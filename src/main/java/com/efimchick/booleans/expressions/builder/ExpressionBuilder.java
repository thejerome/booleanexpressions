package com.efimchick.booleans.expressions.builder;

import com.efimchick.booleans.expressions.Var;

/**
 * Created by EE on 2017-04-29.
 */
public interface ExpressionBuilder {

    static VariableTerminalExpressionBuilder var(String name){
        return new VariableTerminalExpressionBuilder(new Var(name));
    }

    static NotIntermediateExpressionBuilder not(){
        return new NotIntermediateExpressionBuilder(new AsIsIntermediateExpressionBuilder());
    }

    //static BinaryTerminalExpressionBuilder embrace(BinaryTerminalExpressionBuilder embraced)
}
