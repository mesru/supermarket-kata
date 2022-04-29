package kata.supermarket;

import java.math.BigDecimal;

public interface Item {
    public BigDecimal price();

    /**
     * Returns whether a discount is applied to an item, to prevent from multiple discounts on the same item
     * @return FALSE if a Discount is not applied, TRUE otherwise
     */
    public boolean isNotDiscounted();

    /**
     * Flags an item as discounted
     */
    public void applyDiscount();

    /**
     * Returns the discount assigned to the product of this item
     * @return a Discount object
     */
    Discount getDiscount();
}
