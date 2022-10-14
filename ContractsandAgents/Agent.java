 package problem1;

import problem1.properties.AbstractProperty;

import java.util.HashSet;
import java.util.Objects;

public class Agent<T extends AbstractProperty, U extends AbstractContracts> {
    private static final double MIN_COMMISSION = 0;
    private static final double MAX_COMMISSION = 1;
    private String name;
    private double commission;
    private HashSet<Listing<T, U>> openListings;

    public Agent(String name, double commission) throws InvalidCommissionAmount {
        this.name = name;
        this.validateCommission(commission);
        this.commission = commission;
        this.openListings = new HashSet<>();
    }

    public Agent(String name, double commission, HashSet<Listing<T, U>> openListings) throws InvalidCommissionAmount {
        this.name = name;
        this.validateCommission(commission);
        this.commission = commission;
        this.openListings = openListings;
    }

    private void validateCommission(double commission) throws InvalidCommissionAmount {
        if (commission < MIN_COMMISSION || commission > MAX_COMMISSION)
            throw new InvalidCommissionAmount();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<Listing<T, U>> getOpenListings() {
        return openListings;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public void setOpenListings(HashSet<Listing<T, U>> openListings) {
        this.openListings = openListings;
    }

    public void addListing(Listing<T, U> listing) {
        this.openListings.add(listing);
    }

    public void completeListing(Listing<T, U> listing) {
        this.openListings.remove(listing);
    }

    public double getPortfolioValue() {
        double total = 0;
        for (Listing listing: this.openListings) {
            total += listing.getContract().getValueForAgent(this);
        }
        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agent agent = (Agent) o;
        return Double.compare(agent.getCommission(), getCommission()) == 0 &&
                Objects.equals(getName(), agent.getName()) &&
                Objects.equals(getOpenListings(), agent.getOpenListings());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCommission(), getOpenListings());
    }

    @Override
    public String toString() {
        return "Agent{" +
                "name='" + name + '\'' +
                ", commission=" + commission +
                ", openListings=" + openListings +
                '}';
    }
}
