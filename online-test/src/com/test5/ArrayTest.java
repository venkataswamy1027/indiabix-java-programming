package com.test;

public class ArrayTest {

    public static void main( String[] args ) {
        //command line invocation :- java ArrayTest red green blue
        String foo = args[1];
        String bar = args[2];
        String baz = args[3];
        System.out.println( "baz = " + baz ); //ArrayIndexOutOfBoundsException at runtime
    }
}
