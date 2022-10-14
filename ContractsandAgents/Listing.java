package problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import problem1.properties.AbstractProperty;

/**
 * Listing generic class for the new properties on the website
 * @param <T> AbstractProperty with a generic data type
 * @param <U> AbstractContract with a generic data type
 */

public class  Listing<T extends AbstractProperty, U extends AbstractContracts> {
  private T properties;
  private U contract;

  /**
   * Listing constructor
   * @param properties properties have a generic data type and are instantiated here for the client to input their data
   * @param contract contract have a generic data type and are instantiated here for the client to input their data
   */

  public Listing(T properties, U contract) {
    this.properties = properties;
    this.contract = contract;
  }

  /**
   * properties getter generic data type
   * @return properties
   */

  public T getProperties() {
    return properties;
  }

  /**
   * properties setter generic data type
   * @return properties
   */

  public U getContract() {
    return contract;
  }

  /**
   * contracts setter generic data type
   * @return contracts
   */

  public void setProperties(T properties) {
    this.properties = properties;
  }

  /**
   * contracts getter generic data type
   * @return contracts
   */

  public void setContract(U contract) {
    this.contract = contract;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Listing<?, ?> listing = (Listing<?, ?>) o;
    return Objects.equals(properties, listing.properties) && Objects
        .equals(contract, listing.contract);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties, contract);
  }

  @Override
  public String toString() {
    return "Listing{" +
        "properties=" + properties +
        ", contract=" + contract +
        '}';
  }
}
