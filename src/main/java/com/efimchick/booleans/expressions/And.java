package com.efimchick.booleans.expressions;

/**
 * Created by EE on 2017-04-29.
 */
public class And implements Expression {
    private final Expression first;
    private final Expression second;

    public And(Expression first, Expression second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        And and = (And) o;

        if (!first.equals(and.first)) return false;
        return second.equals(and.second);
    }

    @Override
    public int hashCode() {
        int result = first.hashCode();
        result = 31 * result + second.hashCode();
        return result;
    }


    @Override
    public String toString() {
        return "And{" +
            "" + first +
            ", " + second +
            '}';
    }
}
