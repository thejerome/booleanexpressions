package com.efimchick.booleans.expressions;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static com.efimchick.booleans.expressions.builder.ExpressionBuilder.not;
import static com.efimchick.booleans.expressions.builder.ExpressionBuilder.var;
import static org.junit.Assert.assertEquals;

/**
 * Created by EE on 2017-04-29.
 */
public class ExpressionBuilderTest {


    @Test
    public void varTest(){
        Expression expression = var("a").build();
        assertEquals(expression, new Var("a"));
    }

    @Test
    public void andTest(){
        {
            Expression expression = var("a").and().var("b").build();
            assertEquals(expression, new And(new Var("a"), new Var("b")));
        }
        {
            Expression expression = var("a").and().var("b").and().var("c").build();
            assertEquals(expression, new And(new And(new Var("a"), new Var("b")), new Var("c")));
        }
        {
            Expression expression = var("a").and().var("b").and().var("c").and().var("b").and().var("c").build();
            assertEquals(expression, new And(new And(new And(new And(
                new Var("a"),
                new Var("b")),
                new Var("c")),
                new Var("b")),
                new Var("c")
            ));
        }

    }


    @Test
    public void orTest(){
        {
            Expression expression = var("a").or().var("b").build();
            assertEquals(expression, new Or(new Var("a"), new Var("b")));
        }
        {
            Expression expression = var("a").or().var("b").or().var("c").build();
            assertEquals(expression, new Or(new Or(new Var("a"), new Var("b")), new Var("c")));
        }
    }

    @Test
    public void notTest(){
        {
            Expression expression = var("a").or().not().var("b").build();
            assertEquals(new Or(new Var("a"), new Not(new Var("b"))), expression);
        }
        {
            Expression expression = not().var("a").build();
            assertEquals(new Not(new Var("a")), expression);
        }
        {
            Expression expression = not().var("a").build();
            assertEquals(new Not(new Var("a")), expression);
        }
        {
            Expression expression = not().not().not().not().var("a").build();
            assertEquals(new Not(new Not(new Not(new Not(new Var("a"))))), expression);
        }
    }

    @Test
    public void priorityTest(){
        {
            Expression expression = var("a").and().var("b")
                .or()
                .var("c").and().var("d")
                .build();

            assertEquals(new Or(new And(new Var("a"), new Var("b")),
                new And(new Var("c"), new Var("d"))), expression);
        }
    }

    @Test
    public void builderTest(){
        //(a & b | c) & (a | b)
//        Expression expression =
//            embrace(var("a").and().var("b").or().var("c"))
//                .and()
//                .embrace(var("a").or().var("b"))
//                .build();
//
//        expression = and(or(and(var("a"), var("b")), var("c")), or(var("a", var("b"))));
    }

    @Test
    public void calculateTest(){

    }
}
