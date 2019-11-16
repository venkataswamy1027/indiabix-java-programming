package com.test;

public class Test2 {

    public static void main( String[] args ) {
        int x = 20;
        String sup = (x < 15) ? "small" : (x < 22) ? "tiny" : "huge";
        System.out.println( sup );
    }
}
