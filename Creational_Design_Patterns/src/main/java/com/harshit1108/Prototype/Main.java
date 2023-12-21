package com.harshit1108.Prototype;

/*
  Prototype pattern comes into creational design pattern.
  As the name state prototype meaning creating object from some reference which we already have.
  It is mainly useful when we have Object which is already created with costly operations
  at that time we keep that object after creation whenever we need
  new object we simply clone object and tweak or do slight modification in the object and use it.
  In addition to this it is useful when we want to hide the creation of object.
  Here when we say cost of creation which means lets say your object got created by some database operations or io operation.
  In cloning its totally up to implementor whether we want to have shallow copy or depp copy while cloning.
  There are mainly three components involved in simple Prototype design pattern.
  1. Prototype : Type of class which has clone method and a super class of all prototypes.
  2. Sub-Classes - Which implements cloning.
  3. Client which uses this subclass and clone
  String is Immutable.
  */
import java.util.List;
public class Main {

    public static void main(String[] args) {
        // Creating a prototype for a car
        Vehicle carPrototype = new Car(
                "Toyota",
                List.of("Air Conditioning", "Power Windows", "Navigation System")
        );

        // Creating shallow and deep clones
        Vehicle shallowClone = carPrototype.shallowClone();
        Vehicle deepClone = carPrototype.deepClone();

        // Modifying the clones to demonstrate the difference
        carPrototype.getFeatures().add("Bluetooth Connectivity");

        // Displaying information
        System.out.println("Original Car:");
        carPrototype.displayInfo();

        System.out.println("\nShallow Clone:");
        shallowClone.displayInfo();

        System.out.println("\nDeep Clone:");
        deepClone.displayInfo();
    }
}
