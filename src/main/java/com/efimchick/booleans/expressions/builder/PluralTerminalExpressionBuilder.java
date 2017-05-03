package com.efimchick.booleans.expressions.builder;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by EE on 2017-05-02.
 */
public abstract class PluralTerminalExpressionBuilder extends TerminalExpressionBuilder {

    protected final Deque<TerminalExpressionBuilder> members = new LinkedList<>();

    protected PluralTerminalExpressionBuilder(TerminalExpressionBuilder first) {
        members.push(first);
    }

    protected void addMember(TerminalExpressionBuilder member){
        members.add(member);
    }

}
