package pkgTest;

import static org.junit.Assert.*;
import org.junit.Test;

import pkgCore.CarLoan;

public class CarLoanTest {
	
	@Test
	public void test()
	{
		CarLoan c1 = new CarLoan(35000.0,0.0,60,.10);
		assertEquals((Math.round(c1.calculateMonthlyPayment() * 100) / 100.0), 743.65, .01);
		assertEquals((Math.round(c1.calculateTotalInterest() * 100) / 100.0), 9618.79, .01);
		CarLoan c2 = new CarLoan(100000.0,15000.0,120,.15);
		assertEquals((Math.round(c2.calculateMonthlyPayment() * 100) / 100.0), 1371.35, .01);
		assertEquals((Math.round(c2.calculateTotalInterest() * 100) / 100.0), 79561.66, .01);
	}
}