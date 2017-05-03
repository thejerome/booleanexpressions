package com.efimchick.booleans.expressions.builder;

import com.efimchick.booleans.expressions.Or;

/**
 * Created by EE on 2017-05-02.
 */
public class OrAppendAndPluralIntermediateExpressionBuilder extends OrPluralIntermediateExpressionBuilder {

    public OrAppendAndPluralIntermediateExpressionBuilder(PluralTerminalExpressionBuilder terminal) {
        super(terminal);
    }

    @Override
    protected TerminalExpressionBuilder process(TerminalExpressionBuilder right) {
        TerminalExpressionBuilder updatedLast = terminal.members.pollLast().and().process(right);
        terminal.members.add(updatedLast);
        return terminal;
    }
}
