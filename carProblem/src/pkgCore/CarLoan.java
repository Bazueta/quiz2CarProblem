package pkgCore;


public class CarLoan


{
	private double total;
	private double dPayment;
	private int timeOfLoan;
	private double interestRate;
	
	
	public CarLoan(double t, double dP, int length, double iR)
	{
		this.total = t;
		this.dPayment = dP;
		this.timeOfLoan = length;
		this.interestRate = iR;
	}
	
	
	public double calculateMonthlyPayment()
	{
		double irBy12 = (this.interestRate)/12;
		double numerator = irBy12 * (total - dPayment);
		double denomerator = (1 - Math.pow((1 + irBy12), -timeOfLoan));
		return numerator/denomerator;
	}
	
	
	public double calculateTotalInterest()
	{
		return (this.calculateMonthlyPayment() - ((total - dPayment) / timeOfLoan)) * timeOfLoan;
	}
	
	public double getTotalPrice() {
		return total;
	}
	
	public void setTotalPrice(double total) {
		this.total = total;
	}
	
	public double getDownPayment() {
		return dPayment;
	}
	
	public void setDownPayment(double dPayment) {
		this.dPayment = dPayment;
	}
	
	public int getLengthOfLoan() {
		return timeOfLoan;
	}
	
	public void setLengthOfLoan(int timeOfLoan) {
		this.timeOfLoan = timeOfLoan;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
}