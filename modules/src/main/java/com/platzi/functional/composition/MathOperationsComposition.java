package com.platzi.functional.composition;

import java.util.function.Function;

public class MathOperationsComposition {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyBy3 = x -> {
            System.out.println("Multiplicando x: "+ x + " por 3" );
            return  x*3;
        };

        Function<Integer, Integer> addOneAndMultiplyBy3 = multiplyBy3.compose(y ->{
            System.out.println("sumando 1 a "+ y);
            return y+1;
        });

        Function<Integer,Integer> andSquare = addOneAndMultiplyBy3.andThen(z-> {
            System.out.println("elevando " + z + " a la 2");
            return z*z;
        });

        System.out.println(andSquare.apply(3));
    }
}
