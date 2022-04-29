package kata.supermarket;

import java.math.BigDecimal;

public class BuyOneGetOneFree implements Discount {

    public BigDecimal calculate(Basket basket) {
        BigDecimal discountAmount = BigDecimal.ZERO;
        Item previousItem = null;
        for (Item item : basket.items()) {
            if (item.getDiscount() instanceof BuyOneGetOneFree && item.isNotDiscounted()) {
                if (null == previousItem) {
                    previousItem = item;
                } else {
                    discountAmount = discountAmount.add(item.price());
                    previousItem.applyDiscount();
                    item.applyDiscount();
                    previousItem = null;
                }
            }
        }
        return discountAmount;
    }

    @Override
    public void addProduct(Product product) {
        product.addDiscount(this);
    }
}
