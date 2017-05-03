package com.efimchick.booleans.expressions.builder;

/**
 * Created by EE on 2017-05-02.
 */
public class NotIntermediateExpressionBuilder extends IntermediateExpressionBuilder {
    private final IntermediateExpressionBuilder inner;

    public NotIntermediateExpressionBuilder(IntermediateExpressionBuilder inner) {
        super();
        this.inner = inner;
    }

    @Override
    protected TerminalExpressionBuilder process(TerminalExpressionBuilder terminalExpressionBuilder) {
        return new NotTerminalExpressionBuilder(inner.process(terminalExpressionBuilder));
    }
}
