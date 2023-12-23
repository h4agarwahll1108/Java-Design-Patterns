package com.harshit1108.Facade;

// Subsystem: OrderProcessingSystem
class OrderProcessingSystem {
    public void placeOrder(String item, int quantity) {
        System.out.println("Placing order for " + quantity + " " + item);
        // Additional order processing logic
    }

    public void processOrder() {
        System.out.println("Processing order");
        // Additional order processing logic
    }
}
