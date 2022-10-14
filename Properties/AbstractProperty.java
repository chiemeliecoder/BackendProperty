package problem1.properties;

import java.util.Objects;

public abstract class AbstractProperty {
    private String address;
    private int sqFeet;

    public AbstractProperty(String address, int sqFeet) {
        this.address = address;
        this.sqFeet = sqFeet;
    }

    public String getAddress() {
        return address;
    }

    public int getSqFeet() {
        return sqFeet;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractProperty that = (AbstractProperty) o;
        return getSqFeet() == that.getSqFeet() &&
                Objects.equals(getAddress(), that.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAddress(), getSqFeet());
    }

    protected String toStringHelper() {
        return "address='" + address + '\'' +
                ", sqFeet=" + sqFeet;
    }

    @Override
    public String toString() {
        return "AbstractProperty{" +
                this.toStringHelper() +
                '}';
    }
}
