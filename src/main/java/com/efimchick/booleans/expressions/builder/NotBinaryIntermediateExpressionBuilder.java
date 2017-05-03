package com.efimchick.booleans.expressions.builder;

/**
 * Created by EE on 2017-05-02.
 */
public class NotBinaryIntermediateExpressionBuilder extends BinaryIntermediateExpressionBuilder {
    private final BinaryIntermediateExpressionBuilder intermediate;

    public NotBinaryIntermediateExpressionBuilder(BinaryIntermediateExpressionBuilder intermediate) {
        super(intermediate.left);
        this.intermediate = intermediate;
    }

    @Override
    protected BinaryTerminalExpressionBuilder combine(TerminalExpressionBuilder left, TerminalExpressionBuilder right) {
        return intermediate.combine(left, new NotTerminalExpressionBuilder(right));
    }
}
