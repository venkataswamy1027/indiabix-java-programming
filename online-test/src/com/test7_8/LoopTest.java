/*
 * LoopTest.java
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
public class LoopTest {
    public static void main( String[] args ) {
        int result = 0;
        short s = 42;
        Long x = new Long( "42" );
        Long y = new Long( 42 );
        Short z = new Short( "42" );
        Short x2 = new Short( s );
        Integer y2 = new Integer( "42" );
        Integer z2 = new Integer( 42 );

        if ( x == y ) /* Line 13 */
            result = 1;
        if ( x.equals( y ) ) /* Line 15 */
            result = result + 10;
        if ( x.equals( z ) ) /* Line 17 */
            result = result + 100;
        if ( x.equals( x2 ) ) /* Line 19 */
            result = result + 1000;
        if ( x.equals( z2 ) ) /* Line 21 */
            result = result + 10000;

        System.out.println( "result = " + result );
    }
}
