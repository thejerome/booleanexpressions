package com.efimchick.booleans.expressions.builder;

import com.efimchick.booleans.expressions.Expression;
import com.efimchick.booleans.expressions.Not;

/**
 * Created by EE on 2017-05-02.
 */
public class NotTerminalExpressionBuilder extends TerminalExpressionBuilder {
    private final TerminalExpressionBuilder inner;

    public NotTerminalExpressionBuilder(TerminalExpressionBuilder inner) {
        super();
        this.inner = inner;
    }

    @Override
    public Expression build() {
        return new Not(inner.build());
    }
}
