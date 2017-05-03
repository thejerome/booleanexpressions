package com.efimchick.booleans.expressions.builder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by EE on 2017-04-29.
 */
public abstract class PluralIntermediateExpressionBuilder extends IntermediateExpressionBuilder {

    protected final PluralTerminalExpressionBuilder terminal;

    protected PluralIntermediateExpressionBuilder(PluralTerminalExpressionBuilder terminal) {
        this.terminal = terminal;
    }

//    @Override
//    public NotBinaryIntermediateExpressionBuilder not() {
//        return new NotBinaryIntermediateExpressionBuilder(this);
//    }


    @Override
    protected TerminalExpressionBuilder process(TerminalExpressionBuilder right) {
        terminal.addMember(right);
        return terminal;
    }

//    @Override
//    protected TerminalExpressionBuilder process(TerminalExpressionBuilder right) {
//        return combine(left, right);
//    }

    //protected abstract BinaryTerminalExpressionBuilder combine(TerminalExpressionBuilder left, TerminalExpressionBuilder right);

}
