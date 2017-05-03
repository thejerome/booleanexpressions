package com.efimchick.booleans.expressions;

/**
 * Created by EE on 2017-04-29.
 */
public class Or implements Expression {
    private final Expression first;
    private final Expression second;

    public Or(Expression first, Expression second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Or or = (Or) o;

        if (!first.equals(or.first)) return false;
        return second.equals(or.second);
    }

    @Override
    public int hashCode() {
        int result = first.hashCode();
        result = 31 * result + second.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Or{" +
            "" + first +
            ", " + second +
            '}';
    }
}
