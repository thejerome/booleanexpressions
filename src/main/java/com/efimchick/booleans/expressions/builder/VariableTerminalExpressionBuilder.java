package com.efimchick.booleans.expressions.builder;

import com.efimchick.booleans.expressions.Expression;
import com.efimchick.booleans.expressions.Var;

/**
 * Created by EE on 2017-04-29.
 */
public class VariableTerminalExpressionBuilder extends TerminalExpressionBuilder {
    private final Var var;

    public VariableTerminalExpressionBuilder(Var var) {
        this.var = var;
    }

    @Override
    public Expression build() {
        return var;
    }
}
