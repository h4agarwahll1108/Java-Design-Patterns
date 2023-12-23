package com.harshit1108.Facade;

// Facade: FoodOrderingFacade
class FoodOrderingFacade {
    private final MenuSystem menuSystem;
    private final OrderProcessingSystem orderProcessingSystem;
    private final PaymentProcessingSystem paymentProcessingSystem;

    public FoodOrderingFacade() {
        this.menuSystem = new MenuSystem();
        this.orderProcessingSystem = new OrderProcessingSystem();
        this.paymentProcessingSystem = new PaymentProcessingSystem();
    }

    public void displayMenu() {
        menuSystem.displayMenu();
    }

    public void placeOrder(String item, int quantity) {
        orderProcessingSystem.placeOrder(item, quantity);
        orderProcessingSystem.processOrder();
    }

    public void processPayment(double amount) {
        paymentProcessingSystem.processPayment(amount);
    }
}
