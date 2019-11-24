/*
 * ThreadTest.java
 * 
 * Copyright (c) 2019 by General Electric Company. All rights reserved.
 * 
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
package com.test;

/**
 * @author 503118564
 */
public class ThreadTest extends Thread {
    public void run() {
        System.out.println( "In run" );
        yield();
        System.out.println( "Leaving run" );
    }

    public static void main( String[] argv ) {
        (new ThreadTest()).start();
    }
}
