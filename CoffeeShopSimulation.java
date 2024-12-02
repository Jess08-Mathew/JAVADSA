class CounterEmptyException extends Exception {
    public CounterEmptyException(String message) {
        super(message);
    }
}

class CoffeeShop {
    private int counter = 0;  // Shared resource: The coffee counter
    private final int MAX_CAPACITY = 3;  // Maximum capacity of the counter

    // Producer (Barista) method
    public synchronized void prepareCoffee(String barista) throws InterruptedException {
        // Wait if the counter is full
        while (counter == MAX_CAPACITY) {
            System.out.println(barista + " is waiting. Counter is full.");
            wait();  // Wait until a customer picks up coffee
        }
        counter++;  // Barista prepares a coffee
        System.out.println(barista + " prepared coffee. Counter: " + counter);
        notifyAll();  // Notify all waiting threads (customers or reviewers)
    }

    // Consumer (Customer) method
    public synchronized void pickCoffee(String customer) throws InterruptedException, CounterEmptyException {
        // Wait if the counter is empty
        while (counter == 0) {
            System.out.println(customer + " is waiting. Counter is empty.");
            wait();  // Wait until a coffee is available
        }
        if (counter == 0) throw new CounterEmptyException("Counter is empty! No coffee available for " + customer);
        
        counter--;  // Customer picks up a coffee
        System.out.println(customer + " picked up coffee. Counter: " + counter);
        notifyAll();  // Notify all waiting threads (baristas)
    }

    // Reviewer method (observer task)
    public synchronized void sampleCoffee(String reviewer) throws InterruptedException, CounterEmptyException {
        // Wait if the counter is empty
        while (counter == 0) {
            System.out.println(reviewer + " is waiting. Counter is empty.");
            wait();  // Wait until a coffee is available
        }
        if (counter == 0) throw new CounterEmptyException("Counter is empty! No coffee to sample for " + reviewer);

        counter--;  // Reviewer samples a coffee
        System.out.println(reviewer + " sampled coffee. Counter: " + counter);
        notifyAll();  // Notify all waiting threads (baristas and customers)
    }
}

class Barista extends Thread {
    private final CoffeeShop shop;
    private final String name;
    private final int coffeeCount;

    public Barista(CoffeeShop shop, String name, int coffeeCount) {
        this.shop = shop;
        this.name = name;
        this.coffeeCount = coffeeCount;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < coffeeCount; i++) {
                shop.prepareCoffee(name);  // Barista prepares coffee
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Customer extends Thread {
    private final CoffeeShop shop;
    private final String name;
    private final int coffeeCount;

    public Customer(CoffeeShop shop, String name, int coffeeCount) {
        this.shop = shop;
        this.name = name;
        this.coffeeCount = coffeeCount;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < coffeeCount; i++) {
                shop.pickCoffee(name);  // Customer picks up coffee
            }
        } catch (InterruptedException | CounterEmptyException e) {
            e.printStackTrace();
        }
    }
}

class Reviewer extends Thread {
    private final CoffeeShop shop;
    private final String name;

    public Reviewer(CoffeeShop shop, String name) {
        this.shop = shop;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            shop.sampleCoffee(name);  // Reviewer samples a coffee
        } catch (InterruptedException | CounterEmptyException e) {
            e.printStackTrace();
        }
    }
}

public class CoffeeShopSimulation {
    public static void main(String[] args) {
        CoffeeShop shop = new CoffeeShop();

        // Baristas (Producers)
        Barista barista1 = new Barista(shop, "Barista 1", 2);  // Prepares 2 coffees
        Barista barista2 = new Barista(shop, "Barista 2", 3);  // Prepares 3 coffees

        // Customers (Consumers)
        Customer customer1 = new Customer(shop, "Customer 1", 1);  // Picks up 1 coffee
        Customer customer2 = new Customer(shop, "Customer 2", 2);  // Picks up 2 coffees
        Customer customer3 = new Customer(shop, "Customer 3", 1);  // Picks up 1 coffee

        // Coffee Reviewer (Observer)
        Reviewer reviewer = new Reviewer(shop, "Coffee Reviewer");

        // Start threads
        barista1.start();
        barista2.start();
        customer1.start();
        customer2.start();
        customer3.start();
        reviewer.start();

        // Wait for all threads to finish
        try {
            barista1.join();
            barista2.join();
            customer1.join();
            customer2.join();
            customer3.join();
            reviewer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
