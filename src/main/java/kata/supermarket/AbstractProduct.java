package kata.supermarket;

public abstract class AbstractProduct {

    private Discount discount;

    public void addDiscount(Discount discount) {
        this.discount = discount;
    }

    public Discount getDiscount() {
        return this.discount;
    }
}
