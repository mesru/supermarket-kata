package kata.supermarket;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ItemByWeight implements Item {

    private final WeighedProduct product;
    private final BigDecimal weightInKilos;
    private boolean discounted = false;

    ItemByWeight(final WeighedProduct product, final BigDecimal weightInKilos) {
        this.product = product;
        this.weightInKilos = weightInKilos;
    }

    public BigDecimal price() {
        return product.pricePerKilo().multiply(weightInKilos).setScale(2, RoundingMode.HALF_UP);
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
