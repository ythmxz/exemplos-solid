package correct;

public class App {

    public static void main(String[] args) {
        Order order1 = new Order(200.f, new FixedDiscount(50.f));
        System.out.println(order1.getAmount());

        Order order2 = new Order(200.f);
        order2.setDiscount(new PercentageDiscount(10.f));
        System.out.println(order2.getAmount());
    }

}
