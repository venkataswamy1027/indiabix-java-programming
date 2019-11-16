package com.test;

public class Test1 {
    public static void main( String args[] ) {
    }

    interface DoMath {
        double getArea( int rad );
    }

    interface MathPlus {
        double getVol( int b, int h );
    }

    interface AllMath extends DoMath {
        float getAvg( int h, int l );
    }

    abstract class AllMaths implements DoMath, MathPlus {
        public double getArea( int rad ) {
            return rad * rad * 3.14;
        }
    }
}
