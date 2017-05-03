package com.efimchick.booleans.expressions.builder;

import com.efimchick.booleans.expressions.Expression;

/**
 * Created by EE on 2017-04-29.
 */
public abstract class BinaryTerminalExpressionBuilder extends TerminalExpressionBuilder {

    protected final TerminalExpressionBuilder left;
    protected final TerminalExpressionBuilder right;

    protected BinaryTerminalExpressionBuilder(TerminalExpressionBuilder left, TerminalExpressionBuilder right) {
        this.left = left;
        this.right = right;
    }

}
