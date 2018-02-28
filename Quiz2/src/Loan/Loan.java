package Loan;

public class Loan {
	
	
	private double TtlPrice;
	private double DownPayment;
	private double length;
	private double interest;
	
	
	
	public Loan(double ttlPrice, double downPayment, double length, double interest) {
		super();
		TtlPrice = ttlPrice;
		DownPayment = downPayment;
		this.length = length;
		this.interest = interest;
	}

	public double monthlyPayment(double TtlPrice, double DownPayment, double length, double interest) {

		double principal = (double) TtlPrice-DownPayment;
		double x = Math.pow((interest + 1), length);
		double monthlyPayment = principal * ((interest*x) / (x - 1));
		double roundOff = (double) Math.round(monthlyPayment * 100) / 100;
		return roundOff;
	}

	public double totalSpent(double TtlPrice, double DownPayment, double length, double interest) {

		double principal = (double) TtlPrice-DownPayment;
		double x = Math.pow((interest + 1), length);
		double monthlyPayment = principal * ((interest*x) / (x - 1));
		double totalValue = (double) length * monthlyPayment ;
		double totalInterest = totalValue - principal;
		double roundOff2 = (double) Math.round(totalInterest * 100) / 100;
		return roundOff2;
	}



}