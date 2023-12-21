package com.harshit1108.Builder.UsingBuilderInnerClass;

//Builder pattern : It is creational design pattern used to create complex presentation of objects.
/**
 * Most Common Way to implement builder pattern is to have Builder class as innner class because
 * 1. We don't want to expose our constructor which eventually creates confusion at later stage.
 * 2. We don't want to have in-consistent object by having setters exposed.
 * 3. Now since constructor is private we will need inner class to access that. - Which will have same inputs what we have in class. But without getters.
 */
public class Pizza {


    private String size;
    private boolean tamato;
    private boolean extraCheese;
    private boolean mayonese;
    private boolean onion;
    private boolean capsicum;

    public Pizza(PizzaBuilder pizzaBuilder) {
        this.size = pizzaBuilder.size;
        this.tamato = pizzaBuilder.tamato;
        this.extraCheese = pizzaBuilder.extraCheese;
        this.mayonese = pizzaBuilder.mayonese;
        this.onion = pizzaBuilder.onion;
        this.capsicum = pizzaBuilder.capsicum;
    }

    public String getSize() {
        return size;
    }

    public boolean isTamato() {
        return tamato;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public boolean isMayonese() {
        return mayonese;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isCapsicum() {
        return capsicum;
    }

    public static class PizzaBuilder {

        private String size;
        private boolean tamato;
        private boolean extraCheese;
        private boolean mayonese;
        private boolean onion;
        private boolean capsicum;

        public PizzaBuilder size(String size) {
            this.size = size;
            return this;
        }

        public PizzaBuilder tamato(boolean tamato) {
            this.tamato = tamato;
            return this;
        }

        public PizzaBuilder extraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }

        public PizzaBuilder mayonese(boolean mayonese) {
            this.mayonese = mayonese;
            return this;
        }

        public PizzaBuilder onion(boolean onion) {
            this.onion = onion;
            return this;
        }

        public PizzaBuilder capsicum(boolean capsicum) {
            this.capsicum = capsicum;
            return this;
        }

        public Pizza build(){
            return  new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", tamato=" + tamato +
                ", extraCheese=" + extraCheese +
                ", mayonese=" + mayonese +
                ", onion=" + onion +
                ", capsicum=" + capsicum +
                '}';
    }
}
