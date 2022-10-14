package problem1;

import java.util.Objects;
/**
 * The types of contracts of the properties website can be a rental contact
 */

public class Rental extends AbstractContracts{
   private Integer term;

  /**
   * The Rental contract  constructor
   * @param askingPrice the price of the property
   * @param priceNegotiation the price after bargaining or negotiating
   * @param term the length of the contract
   */

  public Rental(double askingPrice, boolean priceNegotiation, Integer term) {
    super(askingPrice, priceNegotiation);
    this.validateLengthOfContract(term);
    this.term = term;
  }

  /**
   * A helper function to validate the number of months in the contract to make sure
   * the client doesnt give us a negative or invalid number of months.
   * @param term The length of the contract
   * @throws IllegalArgumentException
   */

  private void validateLengthOfContract(Integer term) throws IllegalArgumentException{
    if(term < 0){
      throw new IllegalArgumentException();
    }
  }

  /**
   * term getter with data type integer
   * @return term
   */

  public Integer getTerm() {
    return term;
  }

  @Override 
  public Double getValueForAgent(Agent agent) {
    double profit = getAskingPrice() * agent.getCommission();
    double result = this.term * profit;
    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Rental rental = (Rental) o;
    return Objects.equals(term, rental.term);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), term);
  }

  @Override
  public String toString() {
    return "Rental{" +
        "term=" + term +
        '}';
  }
}
