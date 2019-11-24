/*
 * ProgramTest1.java
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
public class ProgramTest1 {
    public static void main( String[] args ) {
        int I = 0;
        outer: 
            while ( true ) {
            I++;
            inner: 
                for ( int j = 0; j < 10; j++ ) {
                I += j;
                if ( j == 3 )
                    continue inner;
                break outer;
            }
            continue outer;
        }
        System.out.println( I );
    }
}
