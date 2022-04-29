package kata.supermarket;

import java.math.BigDecimal;

public class ItemByUnit implements Item {

    private final Product product;
    private boolean discounted = false;

    ItemByUnit(final Product product) {
        this.product = product;
    }

    @Override
    public BigDecimal price() {
        return product.pricePerUnit();
    }

    @Override
    public boolean isNotDiscounted() {
        return !discounted;
    }

    @Override
    public void applyDiscount() {
        this.discounted = true;
    }

    @Override
    public Discount getDiscount() {
        return this.product.getDiscount();
    }
}
