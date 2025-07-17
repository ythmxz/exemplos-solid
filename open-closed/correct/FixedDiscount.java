package correct;

public class FixedDiscount implements DiscountInterface {

    private float value;

    public FixedDiscount(float value) {
        this.value = value;
    }

    @Override
    public float apply(float orderAmount) {
        if (this.value > orderAmount)
            throw new IllegalArgumentException("Desconto não pode ser maior que o valor do pedido");

        return orderAmount - this.value;
    }

}
