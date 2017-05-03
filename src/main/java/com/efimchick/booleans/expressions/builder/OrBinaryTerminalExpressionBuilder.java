package com.efimchick.booleans.expressions.builder;

import com.efimchick.booleans.expressions.Expression;
import com.efimchick.booleans.expressions.Or;

/**
 * Created by EE on 2017-05-02.
 */
public class OrBinaryTerminalExpressionBuilder extends BinaryTerminalExpressionBuilder {
    public OrBinaryTerminalExpressionBuilder(TerminalExpressionBuilder left, TerminalExpressionBuilder right) {
        super(left, right);
    }

    @Override
    public Expression build() {
        return new Or(left.build(), right.build());
    }
}
