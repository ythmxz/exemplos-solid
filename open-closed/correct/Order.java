package correct;

public class Order {

    private float amount;
    private DiscountInterface discount;

    public Order(float amount) {
        this.amount = amount;
        this.discount = null;
    }

    public Order(float amount, DiscountInterface discount) {
        this(amount);
        this.discount = discount;
    }

    public float getAmount() {
        if (this.discount != null)
            this.amount = this.discount.apply(this.amount);

        return this.amount;
    }

    public void setDiscount(DiscountInterface discount) {
        this.discount = discount;
    }

}
