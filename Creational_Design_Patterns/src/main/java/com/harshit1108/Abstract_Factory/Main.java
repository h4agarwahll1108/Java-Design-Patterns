package com.harshit1108.Abstract_Factory;
/**
A abstract factory contains main following :
1. Abstract product class , in our case : Smartphone and Smartwatch
2. Actual products that is Iphone, GalaxyPhone, Applewatch, Galaxywatch.
3. Abstract factory - which helps for interacting for creation and product factories will extend that to ensure right
 product gets created. - Here ElectronicDeviceFactory
4. Actual product factories - AppleDeviceFactory , SamsungDeviceFactory
5. Client - Application will take the respective factory and creates object, and then you can paint UI.

ava lib example which is most famous that DOM Parser .It uses abstract factory pattern for creations.
The DocumentBuilderFactory is an abstract factory, a factory that is created as a new instance of DocumentBuilderFactory and the Document is an interface that is implemented by the factory to return the response.
We don't know here which type of DocumentBuilder we got but based on our input it has given correct instance.
*/
public class Main {

    public static void main(String[] args) {
        // Create Apple devices family
        //Using Interface we can create instance for different type of product
        ElectronicDeviceFactory appleFactory = new AppleDeviceFactory();
        // factory method will create object for phone and watch.
        //After that based on the method display method call and whatever object created their info will display.
        Smartphone iPhone = appleFactory.createSmartphone();
        Smartwatch appleWatch = appleFactory.createSmartwatch();

        // Display information
        iPhone.displayInfo();
        appleWatch.displayInfo();

        System.out.println("\n----------------\n");

        // Create Samsung devices family
        ElectronicDeviceFactory samsungFactory = new SamsungDeviceFactory();
        Smartphone galaxyPhone = samsungFactory.createSmartphone();
        Smartwatch galaxyWatch = samsungFactory.createSmartwatch();

        // Display information
        galaxyPhone.displayInfo();
        galaxyWatch.displayInfo();
    }
}
