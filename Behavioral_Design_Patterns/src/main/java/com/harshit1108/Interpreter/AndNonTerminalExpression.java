package com.harshit1108.Interpreter;

public class AndNonTerminalExpression implements Expression{

    private Expression exp1 = null;
    private Expression exp2 = null;

    public AndNonTerminalExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean interpret(String context) {
        return exp1.interpret(context) && exp2.interpret(context);
    }
}
