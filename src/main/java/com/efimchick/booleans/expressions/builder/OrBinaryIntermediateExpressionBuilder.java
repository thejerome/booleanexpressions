package com.efimchick.booleans.expressions.builder;

/**
 * Created by EE on 2017-05-02.
 */
public class OrBinaryIntermediateExpressionBuilder extends BinaryIntermediateExpressionBuilder {
    public OrBinaryIntermediateExpressionBuilder(TerminalExpressionBuilder leftMember) {
        super(leftMember);
    }

    @Override
    protected BinaryTerminalExpressionBuilder combine(TerminalExpressionBuilder left, TerminalExpressionBuilder right) {
        return new OrBinaryTerminalExpressionBuilder(left, right);
    }
}
