package main;

import polynomial.Polynomial;

/**
 *
 * @author Sjaak Smetsers
 */
public class Main {

    public static void main(String[] args) {
        Polynomial p1 = new Polynomial( "3.0 1 2 3" );
        Polynomial p2 = new Polynomial( "4 0 5 3" );
        Polynomial p3 = new Polynomial( "4 0 -5 3" );
        Polynomial p4 = new Polynomial( "6 1" );

        p2.plus(p3);
        p1.minus(p2);
 //       p1.plus(p2.times(p5));
        
        System.out.println( p1 );
        System.out.println( p2 );
        System.out.println( p3 );
        System.out.println( p4 );
   }

}
