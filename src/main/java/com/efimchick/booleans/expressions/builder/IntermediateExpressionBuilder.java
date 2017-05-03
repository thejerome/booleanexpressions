package com.efimchick.booleans.expressions.builder;

import com.efimchick.booleans.expressions.Var;

/**
 * Created by EE on 2017-05-02.
 */
public abstract class IntermediateExpressionBuilder {

    public TerminalExpressionBuilder var(String name){
        return process(new VariableTerminalExpressionBuilder(new Var(name)));
    }

    public TerminalExpressionBuilder var(Var var){
        return process(new VariableTerminalExpressionBuilder(var));
    };

    public IntermediateExpressionBuilder not() {
        return new NotIntermediateExpressionBuilder(this);
    }


    protected abstract TerminalExpressionBuilder process(TerminalExpressionBuilder terminalExpressionBuilder);


}
