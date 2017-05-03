package com.efimchick.booleans.expressions;


import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by EE on 2017-04-29.
 */
public class Expressions {


    public static Builder builder() {
        return null;
    }

    public static Expression parse(String s) {

        //return new Parser(s).parse();

        return new Var(s);
    }
}
