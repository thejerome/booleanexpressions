package com.efimchick.booleans.expressions.builder;

import com.efimchick.booleans.expressions.And;
import com.efimchick.booleans.expressions.Expression;

import java.util.stream.Collectors;

/**
 * Created by EE on 2017-05-02.
 */
public class AndPluralTerminalExpressionBuilder extends PluralTerminalExpressionBuilder {

    protected AndPluralTerminalExpressionBuilder(TerminalExpressionBuilder first) {
        super(first);
    }

    @Override
    public AndPluralIntermediateExpressionBuilder and() {
        return new AndPluralIntermediateExpressionBuilder(this);
    }

    @Override
    public OrPluralIntermediateExpressionBuilder or() {
        return new OrPluralIntermediateExpressionBuilder(new OrPluralTerminalExpressionBuilder(this));
    }

    @Override
    public Expression build() {
        return members.stream()
            .map(m -> m.build())
            .reduce(
                (left, right) -> new And(left, right)
            ).get();
    }
}
