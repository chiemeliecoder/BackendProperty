package problem1.properties;

import java.util.Objects;

public class ResidentialProperty extends AbstractProperty {
    private int numBedrooms;
    private int numBathrooms;

    public ResidentialProperty(String address, int sqFeet, int numBedrooms, int numBathrooms) {
        super(address, sqFeet);
        this.numBedrooms = numBedrooms;
        this.numBathrooms = numBathrooms;
    }

    public int getNumBedrooms() {
        return numBedrooms;
    }

    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }

    public int getNumBathrooms() {
        return numBathrooms;
    }

    public void setNumBathrooms(int numBathrooms) {
        this.numBathrooms = numBathrooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResidentialProperty that = (ResidentialProperty) o;
        return getNumBedrooms() == that.getNumBedrooms() &&
                getNumBathrooms() == that.getNumBathrooms();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumBedrooms(), getNumBathrooms());
    }

    @Override
    public String toString() {
        return "ResidentialProperty{" +
                this.toStringHelper() +
                "numBedrooms=" + numBedrooms +
                ", numBathrooms=" + numBathrooms +
                '}';
    }
}
