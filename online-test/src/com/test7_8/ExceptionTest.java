/*
 * ExceptionTest.java
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

class Exc0 extends Exception {
}

class Exc1 extends Exc0 {
}

/**
 * @author 503118564
 */
public class ExceptionTest {

    public static void main( String args[] ) {
        try {
            throw new Exc1(); /* Line 9 */
        } catch ( Exc0 e0 ) /* Line 11 */
        {
            System.out.println( "Ex0 caught" );
        } catch ( Exception e ) {
            System.out.println( "exception caught" );
        }
    }
}
