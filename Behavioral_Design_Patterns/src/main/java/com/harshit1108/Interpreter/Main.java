package com.harshit1108.Interpreter;

/**
 * Interpreter pattern is used to defines a grammatical representation for a language and provides an interpreter to deal with this grammar.
 * This pattern involves implementing an expression interface which tells to interpret a particular context.
 * This pattern is used in SQL parsing, symbol processing engine etc.
 * This pattern performs upon a hierarchy of expressions. Each expression here is a terminal or non-terminal.
 * The tree structure of Interpreter design pattern is somewhat similar to that defined by the composite design pattern with terminal expressions being leaf objects and non-terminal expressions being composites.
 * The tree contains the expressions to be evaluated and is usually generated by a parser.
 * The parser itself is not a part of the interpreter pattern.
 */
public class Main {

    public static Expression getMaleExpression(){
        Expression expression1 = new TerminalExpression("Harshit");
        Expression expression2 = new TerminalExpression("Aman");
        return new OrNonTerminalExpression(expression1,expression2);
    }

    public static Expression getMarriedExpression(){
        Expression expression1 = new TerminalExpression("Priya");
        Expression expression2 = new TerminalExpression("Married");
        return new AndNonTerminalExpression(expression1,expression2);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedExpression();
        System.out.println(isMale.interpret("Harshit"));
        System.out.println(isMarriedWoman.interpret("Priya Married"));
        System.out.println(isMarriedWoman.interpret("Sheetal Married"));
    }
}
