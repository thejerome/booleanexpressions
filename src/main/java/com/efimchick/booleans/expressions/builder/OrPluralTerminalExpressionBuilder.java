package com.efimchick.booleans.expressions.builder;

import com.efimchick.booleans.expressions.Expression;
import com.efimchick.booleans.expressions.Or;

/**
 * Created by EE on 2017-05-02.
 */
public class OrPluralTerminalExpressionBuilder extends PluralTerminalExpressionBuilder {
    public OrPluralTerminalExpressionBuilder(TerminalExpressionBuilder first) {
        super(first);
    }

    @Override
    public PluralIntermediateExpressionBuilder and() {
        return new OrAppendAndPluralIntermediateExpressionBuilder(this);
    }

    @Override
    public PluralIntermediateExpressionBuilder or() {
        return new OrPluralIntermediateExpressionBuilder(this);
    }

    @Override
    public Expression build() {
        return members.stream()
            .map(m -> m.build())
            .reduce((left, right) -> new Or(left, right))
            .get();
    }
}
