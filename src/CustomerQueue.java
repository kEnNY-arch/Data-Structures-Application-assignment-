import java.util.LinkedList;
import java.util.Queue;

class CustomerQueue {
    private Queue<String> customers;

    public CustomerQueue() {
        customers = new LinkedList<>();
    }

    public void addCustomer(String customer) {
        customers.add(customer);
    }

    public String serveCustomer() {
        return customers.poll();
    }

    public void displayQueue() {
        System.out.println("Customers in queue:");
        for (String customer : customers) {
            System.out.println(customer);
        }
    }
}
