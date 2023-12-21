package com.harshit1108.Builder.GOF;
// Product class
public class Pizza {

    private String crust;

    private String suace;

    private String topping;

    public Pizza(String crust, String suace, String topping) {
        this.crust = crust;
        this.suace = suace;
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "crust='" + crust + '\'' +
                ", suace='" + suace + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }
}
