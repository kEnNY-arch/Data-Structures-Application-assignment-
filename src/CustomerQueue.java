import java.util.LinkedList;
import java.util.Queue;

class CustomerQueue {
    // Queue to manage customers
    private Queue<String> customers;

    public CustomerQueue() {
        customers = new LinkedList<>();
    }

    // Add a customer to the queue
    public void addCustomer(String customer) {
        customers.add(customer);
    }

    // Serve a customer
    public String serveCustomer() {
        return customers.poll();
    }

    // Display all customers in the queue
    public void displayQueue() {
        System.out.println("Customers in queue:");
        for (String customer : customers) {
            System.out.println(customer);
        }
    }
}
