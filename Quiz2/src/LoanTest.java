

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import Loan.Loan;

class LoanTest {

	@Test
	void test() {
		
		Loan loan = new Loan(35000, 0, 60, 0.00833333);
		System.out.println(loan.monthlyPayment(35000, 0, 60, 0.00833333));
		System.out.print(loan.totalSpent(35000, 0, 60, 0.00833333));
		
		assertEquals((long)743.65,(long)loan.monthlyPayment(35000, 0, 60, 0.00833333));
		assertEquals((long)9618.79,(long)loan.totalSpent(35000, 0, 60, 0.00833333));
		
		
	}

}