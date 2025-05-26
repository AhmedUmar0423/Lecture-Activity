public class ProductApp {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product(1, "P1", 100.00, 2);

        p1.dislpayDetails();
        p2.dislpayDetails();

        p2.assigndetails(1, "P2", 0, 2);

        p2.dislpayDetails();
    }
}
