package correct;

public class PercentageDiscount implements DiscountInterface {

    private float percentage;

    public PercentageDiscount(float percentage) {
        this.percentage = percentage;

        if (percentage > 100.f || percentage <= 0.f)
            throw new IllegalArgumentException("Insira um percentual entre 1% e 100%");
    }

    @Override
    public float apply(float orderAmount) {
        return orderAmount - (orderAmount * (this.percentage / 100.f));
    }

}
