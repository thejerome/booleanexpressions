package com.efimchick.booleans.expressions;

import com.sun.org.apache.xpath.internal.operations.Variable;
import org.junit.Test;

/**
 * Created by EE on 2017-04-29.
 */
public class ExpressionTest {


    @Test
    public void basicApiTest(){
        Expression expression;

        Var a = new Var("a");
        Var b = new Var("b");

        And AnB = new And(a,b);
        Expression ex = new And(
            new And(
                new Or(a, new And(
                    a, b
                )),
                b
            ),
            Const.FALSE
        );

    }


    @Test
    public void calculateTest(){

    }
}
