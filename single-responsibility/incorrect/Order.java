package incorrect;

public class Order {

    private String uuid;
    private float amount;

    public Order(String uuid, float amount) {
        this.uuid = uuid;
        this.amount = amount;
    }

    public String getUuid() {
        return this.uuid;
    }

    public float getAmount() {
        return this.amount;
    }

}
