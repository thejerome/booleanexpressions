package com.efimchick.booleans.expressions;

import org.junit.Test;

import static com.efimchick.booleans.expressions.builder.ExpressionBuilder.not;
import static com.efimchick.booleans.expressions.builder.ExpressionBuilder.var;
import static org.junit.Assert.assertEquals;

/**
 * Created by EE on 2017-04-29.
 */
public class ExpressionParsingTest {

    @Test
    public void varTest(){
        Expression expression = Expressions.parse("a");
        assertEquals( new Var("a"), expression);
    }

    @Test
    public void andTest(){
        Expression expression = Expressions.parse("a&b");
        assertEquals(new And(new Var("a"), new Var("b")), expression);
    }

}
