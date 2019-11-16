package com.test;

import java.awt.Component;

public class Ticker extends Component {

    public static void main( String[] args ) {
        Ticker t = new Ticker();
        boolean test1 = (t instanceof Ticker);
        System.out.println( test1 );
        boolean test2 = (t instanceof Component);
        System.out.println( test2 );
    }
}
