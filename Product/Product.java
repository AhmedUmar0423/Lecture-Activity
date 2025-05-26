public class Product {
    private int productId;
    private String name;
    private double price;
    private int quantity;

    public Product() {
        productId = 0;
        name = "";
        price = 0.0;
        quantity = 0;
    }

    public Product(int pId, String pName, double pPrice, int pQuantity) {
        setProductId(pId);
        setName(pName);
        setPrice(pPrice);
        setQuantity(pQuantity);
    }

    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price. Should be greater than 0");
        }
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Invalid quantity. Should be greater than 0");
        }
    }

    public void assigndetails(int pId, String pName, double pPrice, int pQuantity) {
        setProductId(pId);
        setName(pName);
        setPrice(pPrice);
        setQuantity(pQuantity);
    }

    public void dislpayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
        System.out.println("Product Quantity: " + quantity);
    }
}
