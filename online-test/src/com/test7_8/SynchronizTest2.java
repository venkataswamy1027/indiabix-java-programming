/*
 * SynchronizTest.java
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
 *
 */
public class SynchronizTest2 implements Runnable 
{ 
    private String x="hello"; 
    private String y="world"; 

    public static void main(String args[]) 
    {
        SynchronizTest2 that = new SynchronizTest2(); 
        (new Thread(that)).start(); 
        (new Thread(that)).start(); 
    } 
    public synchronized void run() 
    {
        for(int i = 0; i < 10; i++) 
        {  
            try {
                Thread.sleep( 1000);
            } catch ( InterruptedException e ) {
                e.printStackTrace();
            }
            System.out.println("x = " + x + ", y = " + y); /* Line 17 */
        } 
    } 

}
