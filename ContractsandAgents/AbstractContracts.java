package problem1;

import java.util.Objects;
import problem1.properties.AbstractProperty;

/**
 * The contracts for new properties on the website
 */
public abstract class AbstractContracts {
  private double askingPrice;
  private boolean priceNegotiation;

  /**
   * The abstract contract Constructor
   * @param askingPrice the price of the property
   * @param priceNegotiation the price after bargaining or negotiating
   */

  public AbstractContracts(double askingPrice, boolean priceNegotiation) {
    this.validateAskingPrice(askingPrice); //How to do a validation
    this.askingPrice = askingPrice;
    this.priceNegotiation = priceNegotiation;
  }

  /**
   * A helper function to validate the asking price to make sure the client doesnt give us a negative price
   * @param askingPrice
   * @throws IllegalArgumentException
   */
  private void validateAskingPrice(double askingPrice) throws IllegalArgumentException{  //Helper function to validate the price is a non-negative.
    if(askingPrice < 0.0){
      throw new IllegalArgumentException();
    }
  }

  /**
   * Asking price of the getter with primitive data type double
   * @return asking price
   */

  public double getAskingPrice() {
    return askingPrice;
  }

  /**
   * Negotiation price of the getter with primitive data type double
   * @return priceNegotiation
   */

  public boolean isPriceNegotiation() {
    return priceNegotiation;
  }

  public Double getValueForAgent(Agent agent){
    return this.askingPrice * agent.getCommission();
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractContracts that = (AbstractContracts) o;
    return Double.compare(that.askingPrice, askingPrice) == 0
        && priceNegotiation == that.priceNegotiation;
  }

  @Override
  public int hashCode() {
    return Objects.hash(askingPrice, priceNegotiation);
  }

  @Override
  public String toString() {
    return "AbstractContracts{" +
        "askingPrice=" + askingPrice +
        ", priceNegotiation=" + priceNegotiation +
        '}';
  }
}
