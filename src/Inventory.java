import java.util.LinkedList;
import java.util.Queue;

class Inventory {
    // Array to store a fixed list of products
    private Product[] products;
    private int size;

    // Linked list to manage dynamic stock updates
    private LinkedList<Product> restockedProducts;

    public Inventory(int capacity) {
        products = new Product[capacity];
        restockedProducts = new LinkedList<>();
        size = 0;
    }

    // Add a product to the inventory
    public void addProduct(Product product) {
        if (size < products.length) {
            products[size++] = product;
        }
    }

    // Restock a product
    public void restockProduct(Product product) {
        restockedProducts.add(product);
    }

    // Display all products
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
