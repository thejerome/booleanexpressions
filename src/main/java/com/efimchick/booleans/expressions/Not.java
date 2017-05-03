package com.efimchick.booleans.expressions;

/**
 * Created by EE on 2017-04-29.
 */
public class Not implements Expression{
    private final Expression member;

    public Not(Expression member) {
        this.member = member;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Not not = (Not) o;

        return member.equals(not.member);
    }

    @Override
    public int hashCode() {
        return member.hashCode();
    }

    @Override
    public String toString() {
        return "Not{" +
            "" + member +
            '}';
    }
}
