package com.harshit1108.Factory_Method;
/**
 * Factory : As name suggest it is factory where we can create objects.
 * Since it creates object it falls in creational design pattern
 * Factory pattern has  two important element in its design.

 * 1. Interface/Abstract class : This is base element for which we are making factory
 * i.e. we are going to get object of this type
 * In this case it is "OperatingSystem" which has type available Windows and Linux.

 * 2. Factory : This will have nothing but Object creation logic.
 * Let's say as a library you introduce one more subtype that is
 * MacOperatingSystem. Now your caller is automatically extended this facility of third type
 * , also we have taken responsibility of
 * creating of object.

 * In java this pattern is heavily used:
 * 1. Calendar.getInstance : Calendar is abstract class amd based on Locale and Timezone we provided it is giving calendar instance.
 * Note in this case we really don't know what type of calendar we got.
 * 2. In reflection Class.forname : the type of class you pass it gets loaded.
 */

public class Main {

    public static void main(String[] args) {

        BookCreator gamingBook = new GamingBookCreator();
        BookCreator mysteryBook = new MysteryBookCreator();

        Book book1 = gamingBook.createBook();
        Book book2 = mysteryBook.createBook();

        book1.displayInfo();
        book2.displayInfo();

    }
}
