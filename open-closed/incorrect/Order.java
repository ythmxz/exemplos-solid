package incorrect;

public class Order {

    private float amount;

    public Order(float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return this.amount;
    }

    public void applyFixedDiscount(float discount) {
        if (discount > this.amount)
            throw new IllegalArgumentException("Desconto não pode ser maior que o valor do pedido");

        this.amount -= discount;
    }

    public void applyPercentageDiscount(float percentage) {
        if (percentage > 100.f || percentage <= 0.f)
            throw new IllegalArgumentException("Insira um percentual entre 1% e 100%");

        this.amount -= this.amount * (percentage / 100.f);
    }

}
