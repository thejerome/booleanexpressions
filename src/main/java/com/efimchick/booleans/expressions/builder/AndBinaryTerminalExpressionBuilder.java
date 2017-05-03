package com.efimchick.booleans.expressions.builder;

import com.efimchick.booleans.expressions.And;
import com.efimchick.booleans.expressions.Expression;

/**
 * Created by EE on 2017-05-02.
 */
public class AndBinaryTerminalExpressionBuilder extends BinaryTerminalExpressionBuilder {

    public AndBinaryTerminalExpressionBuilder(TerminalExpressionBuilder left, TerminalExpressionBuilder right) {
        super(left, right);
    }

    @Override
    public Expression build() {
        return new And(left.build(), right.build());
    }
}
