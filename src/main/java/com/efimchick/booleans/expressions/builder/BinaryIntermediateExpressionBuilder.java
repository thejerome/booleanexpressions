package com.efimchick.booleans.expressions.builder;

import com.efimchick.booleans.expressions.Var;

/**
 * Created by EE on 2017-04-29.
 */
public abstract class BinaryIntermediateExpressionBuilder extends IntermediateExpressionBuilder {

    protected final TerminalExpressionBuilder left;

    protected BinaryIntermediateExpressionBuilder(TerminalExpressionBuilder leftMember) {
        this.left = leftMember;
    }

    @Override
    public NotBinaryIntermediateExpressionBuilder not() {
        return new NotBinaryIntermediateExpressionBuilder(this);
    }

    @Override
    protected TerminalExpressionBuilder process(TerminalExpressionBuilder right) {
        return combine(left, right);
    }

    protected abstract BinaryTerminalExpressionBuilder combine(TerminalExpressionBuilder left, TerminalExpressionBuilder right);

}
