package problem1;

/**
 * The types of contracts of the properties website can be a sale contact
 */
public class Sales extends AbstractContracts{

  /**
   * The Sale contract  constructor
   * @param askingPrice the price of the property
   * @param priceNegotiation the price after bargaining or negotiating
   */

  public Sales(double askingPrice, boolean priceNegotiation) {
    super(askingPrice, priceNegotiation);
  }

  @Override
  public Double getValueForAgent(Agent agent) {
    return super.getValueForAgent(agent);
  }

  @Override
  public String toString() {
    return "Sales{}";
  }
}
