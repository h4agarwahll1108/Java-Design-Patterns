package com.harshit1108.Decorator;
/**
 * Decorator - It is a design pattern categorized in structural pattern. It helps to decorate the object meaning
 * It basically keeps expanding behaviour of the object.
 * The decorator design pattern is used to change an object’s functionality during runtime.
 * Other instances of the same class will be unaffected, therefore each object will have its behavior changed.
 *
 * Since we can keep supporting adding new decorator we are getting dynamic object extension.
 * After all we are creating stack of wrapper , certain system becomes so coupled that it becomes difficult to
 * remove certain decorators.
 *
 * Inheritance also helps to expand the functionality but that is at compiletime not at runtime.
 * One of the best example of decorator is customized pizza. Where you have pizza and you have different decorator
 * like addExtraChese, cheeseburst, olives yes, jalepeno yes. We keep adding topups and we finally get pizza.
 *
 * You can also think of Account -> Saving Account -> Salary Account -> Preferred Account.
 * Where base is Account now based on different accounttype it keeps adding new features and offers to same account.
 *
 * To achieve decorator pattern you need following:
 * Create Interface - Base product
 * Create abstract class - Base product's base impl
 * Abstract Decorator - which implements base product - This works as foundation of decorator what other decorator needs to do minimum.
 * Different decorators - Which takes this product input and decorate it.
 *
 * Java example : Collection.unmodifiableMap - this is decorator which is extending Map's functionality and
 * making unmodifiable.
 * https://cecs.wright.edu/~tkprasad/courses/ceg860/paper/node26.html
 *
 * More details  : https://www.javadevjournal.com/java-design-patterns/decorator-design-pattern/
 *
 */
public class Main {
    public static void main(String[] args) {
        // Ordering a base pizza
        Pizza basePizza = new BasePizza();
        System.out.println("Base Pizza - Cost: $" + basePizza.getCost()); //25

        // Adding toppings dynamically using decorators
        Pizza cheesePizza = new CheeseToppingDecorator(basePizza);
        System.out.println("Cheese Pizza - Cost: $" + cheesePizza.getCost()); //25+10=35
        //Adding another topping to cheesePizza
        Pizza pepperoniCheesePizza = new PepperoniToppingDecorator(cheesePizza);
        System.out.println("Pepperoni Cheese Pizza - Cost: $" + pepperoniCheesePizza.getCost()); //25+10+5 = 40

        //Adding to base Pizza(Base Pizza remain same but new veggie obtain that not contain cheese and pepperoni)
        Pizza veggiePizza = new VeggieToppingDecorator(basePizza);
        System.out.println("Veggie Pizza - Cost: $" + veggiePizza.getCost()); //25+15 = 40
    }
}
