// date:17.3.29
// author: linyang <linyang@xiaomi.com>

import javax.swing.JOptionPane;

public class TestLoanClass {
  public static void main(String[] args) {
  	String annualInterestRateString = JOptionPane.showInputDialog(
  		"enter yearly interest rate, for example 8.25:");
  	double annualInterestRate = Double.parseDouble(annualInterestRateString);

	String numberofYearsString = JOptionPane.showInputDialog(
  		"enter number of years as aninteger, \nfor example 5:");
	int numberofYears = Integer.parseInt(numberofYearsString);

	String loanString = JOptionPane.showInputDialog(
  		"enter loan amount, for example 120000.95");
	double loanAmount = Double.parseDouble(loanString);

	Loan loan = new Loan(annualInterestRate, numberofYears, loanAmount);

	double monthlyPayment = (int)(loan.getMonthlyPayment() * 100) / 100.0;
	double totalPayment = (int)(loan.getTotalPayment() * 100) / 100.0;

	String output = "the loan was created on" + 
		loan.getLoanDate().toString() + "\n the monthly payment is " +
		monthlyPayment + "\nThe total payment is " + totalPayment;
	JOptionPane.showMessageDialog(null, output);
  }
}