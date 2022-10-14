package problem1.properties;

import java.util.Objects;

public class CommercialProperty extends AbstractProperty {
    private int numOffices;
    private boolean retailSuitable;
    public CommercialProperty(String address, int sqFeet, int numOffices, boolean retailSuitable) {
        super(address, sqFeet);
        this.numOffices = numOffices;
        this.retailSuitable = retailSuitable;
    }

    public int getNumOffices() {
        return numOffices;
    }

    public void setNumOffices(int numOffices) {
        this.numOffices = numOffices;
    }

    public boolean isRetailSuitable() {
        return retailSuitable;
    }

    public void setRetailSuitable(boolean retailSuitable) {
        this.retailSuitable = retailSuitable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CommercialProperty that = (CommercialProperty) o;
        return getNumOffices() == that.getNumOffices() &&
                isRetailSuitable() == that.isRetailSuitable();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumOffices(), isRetailSuitable());
    }

    @Override
    public String toString() {
        return "CommercialProperty{" +
                this.toStringHelper() +
                "numOffices=" + numOffices +
                ", retailSuitable=" + retailSuitable +
                '}';
    }
}
