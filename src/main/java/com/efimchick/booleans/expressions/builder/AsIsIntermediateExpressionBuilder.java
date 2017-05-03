package com.efimchick.booleans.expressions.builder;

/**
 * Created by EE on 2017-05-02.
 */
public class AsIsIntermediateExpressionBuilder extends IntermediateExpressionBuilder {

    @Override
    protected TerminalExpressionBuilder process(TerminalExpressionBuilder terminalExpressionBuilder) {
        return terminalExpressionBuilder;
    }
}
