public class GroceryStore {
    public static void main(String[] args) {
        // Create inventory with a capacity of 5 products
        Inventory inventory = new Inventory(5);

        // Add products to inventory
        inventory.addProduct(new Product("Apple", 100, 100));
        inventory.addProduct(new Product("Banana", 30, 150));
        inventory.addProduct(new Product("Carrot", 50, 200));

        // Restock products
        inventory.restockProduct(new Product("Apple", 100, 50));
        inventory.restockProduct(new Product("Banana", 30, 100));

        // Display inventory
        inventory.displayProducts();

        // Manage customer queue
        CustomerQueue customerQueue = new CustomerQueue();
        customerQueue.addCustomer("Ken");
        customerQueue.addCustomer("Rick");
        customerQueue.addCustomer("Odhis");

        // Display customer queue
        customerQueue.displayQueue();

        // Serve customers
        System.out.println("\nServing customers:");
        System.out.println("Served: " + customerQueue.serveCustomer());
        System.out.println("Served: " + customerQueue.serveCustomer());

        // Display remaining customers in queue
        customerQueue.displayQueue();
    }
}
