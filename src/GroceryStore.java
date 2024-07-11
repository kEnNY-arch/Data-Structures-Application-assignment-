public class GroceryStore {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(5);
        inventory.addProduct(new Product("Apple", 100, 100));
        inventory.addProduct(new Product("Banana", 30, 150));
        inventory.addProduct(new Product("Carrot", 50, 200));
        
        inventory.restockProduct(new Product("Apple", 100, 50));
        inventory.restockProduct(new Product("Banana", 30, 100));

        inventory.displayProducts();

        CustomerQueue customerQueue = new CustomerQueue();
        customerQueue.addCustomer("Ken");
        customerQueue.addCustomer("Rick");
        customerQueue.addCustomer("Odhis");

        customerQueue.displayQueue();

        System.out.println("\nServing customers:");
        System.out.println("Served: " + customerQueue.serveCustomer());
        System.out.println("Served: " + customerQueue.serveCustomer());
        
        customerQueue.displayQueue();
    }
}
