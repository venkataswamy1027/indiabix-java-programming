package com.test;

public class Test2 {
    public static void main( String[] args ) {
        Test2 p = new Test2();
        p.start();
    }

    void start() {
        String s1 = "slip";
        String s2 = fix( s1 );
        System.out.println( s1 + " " + s2 );
    }

    String fix( String s1 ) {
        s1 = s1 + "stream";
        System.out.print( s1 + " " );
        return "stream";
    }
}
