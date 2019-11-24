/*
 * StringRef.java
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
public class StringRef {
    public static void main( String[] args ) {
        String s1 = "abc";
        String s2 = "def";
        String s3 = s2; 
        s2 = "ghi";
        System.out.println( s1 + s2 + s3 );//abcghidef  
    }
}
