package com.efimchick.booleans.expressions.parsing.stack;

import com.efimchick.booleans.expressions.Expression;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by EE on 2017-05-02.
 */
public class Stack {
    private final Deque<StackElement> stack = new LinkedList<>();

    public Expression build(){
        StackElement pop = stack.pop();
        return null;
    }

}
