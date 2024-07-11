import java.util.LinkedList;
import java.util.Queue;

class Inventory {
    private Product[] products;
    private int size;
    
    private LinkedList<Product> restockedProducts;

    public Inventory(int capacity) {
        products = new Product[capacity];
        restockedProducts = new LinkedList<>();
        size = 0;
    }

    public void addProduct(Product product) {
        if (size < products.length) {
            products[size++] = product;
        }
    }

    public void restockProduct(Product product) {
        restockedProducts.add(product);
    }

    public void displayProducts() {
        System.out.println("Inventory:");
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
        System.out.println("\nRestocked Products:");
        for (Product p : restockedProducts) {
            System.out.println(p);
        }
    }
}
