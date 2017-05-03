package com.efimchick.booleans.expressions.builder;

import com.efimchick.booleans.expressions.Expression;

/**
 * Created by EE on 2017-05-02.
 */
public abstract class TerminalExpressionBuilder {
    public abstract Expression build();

    public PluralIntermediateExpressionBuilder and(){
        return new AndPluralIntermediateExpressionBuilder(new AndPluralTerminalExpressionBuilder(this));
    }

    public PluralIntermediateExpressionBuilder or() {
        return new OrPluralIntermediateExpressionBuilder(new OrPluralTerminalExpressionBuilder(this));
    }
}
