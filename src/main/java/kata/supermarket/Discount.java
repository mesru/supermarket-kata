package kata.supermarket;

import java.math.BigDecimal;

public interface Discount {
    /**
     * Calculate the discount amount in the basket for each implementation of the interface class
     * @param basket A Basket object containing zero or more items
     * @return the amount of discount calculated for the specific Discount implementation throughout the whole basket
     */
    public BigDecimal calculate(Basket basket);

    /**
     * Whenever a Discount is created, it is expected to be added to one or more products. This method
     * should be implemented to add the discount implementation to a specific Product
     * @param product object
     */
    public void addProduct(Product product);
}
