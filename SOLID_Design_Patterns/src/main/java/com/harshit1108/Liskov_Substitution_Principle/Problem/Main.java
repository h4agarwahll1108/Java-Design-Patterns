package com.harshit1108.Liskov_Substitution_Principle.Problem;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.calculateArea()); //        200

        Square square = new Square(10);
        System.out.println(square.calculateArea()); //        100

        useRectangle(rectangle);

        useRectangle(square);



    }

    private static void useRectangle(Rectangle rectangle) {
        rectangle.setHeight(20); //for square change 10-->20
        rectangle.setWidth(30); //for square change 10--30
        System.out.println(rectangle.getHeight()+  " " + rectangle.getWidth());
        //20 30 rectangle
        //30 30 square --This is the problem
        assert rectangle.getHeight() == 20 : "Height Not equal to 20";
        assert rectangle.getWidth() == 30 : "Width Not equal to 30";
    }
}

