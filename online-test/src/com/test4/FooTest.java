package com.test;

public class FooTest {
    public static void main( String[] args ) {
        Foo f = new Foo();
        Foo.Bar b = f.new Bar();
        System.out.println( b );
    }
}

class Foo {
    class Bar {
    }
}
