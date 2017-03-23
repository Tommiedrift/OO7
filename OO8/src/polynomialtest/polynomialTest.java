package polynomialtest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import polynomial.Polynomial;

public class polynomialTest {
	
	private Polynomial p1;
	private Polynomial p2;
	private Polynomial p3;

	@Before
	public void setUp(){
        Polynomial p1 = new Polynomial( "3.0 1 2 3" );
        Polynomial p2 = new Polynomial( "4 0 5 3" );
        Polynomial p3 = new Polynomial( "4 0 -5 3" );
        Polynomial p4 = new Polynomial( "6 1" );
        Polynomial p5 = new Polynomial( "'0 1");
	}
	
	@Test
	public void testPlus() {
		//Polynomial output = p1.plus(p2);
	}

}
