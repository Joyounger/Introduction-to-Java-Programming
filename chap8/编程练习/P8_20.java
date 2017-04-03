// date:17.4.3
// author: linyang <linyang@xiaomi.com>
// 统计文件中的字符数、单词数、和行数


import java.io.File;
import java.util.Scanner;
import static java.lang.System.out;

public class P8_20 {
	public static void main(String[] args) throws Exception {
		
		int wordCount = 0;
		int charCount = 0;
		int lineCount = 0;

		Scanner file = new Scanner(new File("Loan.java"));
		while(file.hasNext()) {
			String str = file.next();
			String[] words = str.split("\\s");
			for(int i = 0; i < words.length; i++) {
				out.println("every words--" + words[i]);
			}
			wordCount += words.length;
			
		}

		file = new Scanner(new File("Loan.java"));
		while(file.hasNext()) {
			String str = file.nextLine();
			out.println("every single line--" + str);
			lineCount++;
		}

		file = new Scanner(new File("Loan.java"));
		while(file.hasNext()) {
			String str = file.nextLine();
			String[] words = str.split("\n");
			for(int i = 0; i < words.length; i++) {
				charCount += words[i].length();
			}
			
		}

		out.println("file " + args[0] + " has");
		out.println(wordCount + " words");
		out.println(lineCount + " lines");	
		out.println(charCount + " characters");
		file.close();
	}
}


/*
every words--public
every words--class
every words--Loan
every words--{
every words--private
every words--double
every words--annualInterestRate;
every words--private
every words--int
every words--numberOfYears;
every words--private
every words--double
every words--loanAmount;
every words--private
every words--java.util.Date
every words--loanDate;
every words--/**
every words--Default
every words--constructor
every words--*/
every words--public
every words--Loan()
every words--{
every words--this(2.5,
every words--1,
every words--1000);
every words--}
every words--/**
every words--Construct
every words--a
every words--loan
every words--with
every words--specified
every words--annual
every words--interest
every words--rate,
every words--number
every words--of
every words--years
every words--and
every words--loan
every words--amount
every words--*/
every words--public
every words--Loan(double
every words--annualInterestRate,
every words--int
every words--numberOfYears,
every words--double
every words--loanAmount)
every words--{
every words--this.annualInterestRate
every words--=
every words--annualInterestRate;
every words--this.numberOfYears
every words--=
every words--numberOfYears;
every words--this.loanAmount
every words--=
every words--loanAmount;
every words--loanDate
every words--=
every words--new
every words--java.util.Date();
every words--}
every words--/**
every words--Return
every words--annualInterestRate
every words--*/
every words--public
every words--double
every words--getAnnualInterestRate()
every words--{
every words--return
every words--annualInterestRate;
every words--}
every words--/**
every words--Set
every words--a
every words--new
every words--annualInterestRate
every words--*/
every words--public
every words--void
every words--setAnnualInterestRate(double
every words--annualInterestRate)
every words--{
every words--this.annualInterestRate
every words--=
every words--annualInterestRate;
every words--}
every words--/**
every words--Return
every words--numberOfYears
every words--*/
every words--public
every words--int
every words--getNumberOfYears()
every words--{
every words--return
every words--numberOfYears;
every words--}
every words--/**
every words--Set
every words--a
every words--new
every words--numberOfYears
every words--*/
every words--public
every words--void
every words--setNumberOfYears(int
every words--numberOfYears)
every words--{
every words--this.numberOfYears
every words--=
every words--numberOfYears;
every words--}
every words--/**
every words--Return
every words--loanAmount
every words--*/
every words--public
every words--double
every words--getLoanAmount()
every words--{
every words--return
every words--loanAmount;
every words--}
every words--/**
every words--Set
every words--a
every words--newloanAmount
every words--*/
every words--public
every words--void
every words--setLoanAmount(double
every words--loanAmount)
every words--{
every words--this.loanAmount
every words--=
every words--loanAmount;
every words--}
every words--/**
every words--Find
every words--monthly
every words--payment
every words--*/
every words--public
every words--double
every words--getMonthlyPayment()
every words--{
every words--double
every words--monthlyInterestRate
every words--=
every words--annualInterestRate
every words--/
every words--1200;
every words--double
every words--monthlyPayment
every words--=
every words--loanAmount
every words--*
every words--monthlyInterestRate
every words--/
every words--(1
every words---
every words--(Math.pow(1
every words--/
every words--(1
every words--+
every words--monthlyInterestRate),
every words--numberOfYears
every words--*
every words--12)));
every words--return
every words--monthlyPayment;
every words--}
every words--/**
every words--Find
every words--total
every words--payment
every words--*/
every words--public
every words--double
every words--getTotalPayment()
every words--{
every words--double
every words--totalPayment
every words--=
every words--getMonthlyPayment()
every words--*
every words--numberOfYears
every words--*
every words--12;
every words--return
every words--totalPayment;
every words--}
every words--/**
every words--Return
every words--loan
every words--date
every words--*/
every words--public
every words--java.util.Date
every words--getLoanDate()
every words--{
every words--return
every words--loanDate;
every words--}
every words--}
every single line--public class Loan {
every single line--  private double annualInterestRate;
every single line--  private int numberOfYears;
every single line--  private double loanAmount;
every single line--  private java.util.Date loanDate;
every single line--
every single line--  /** Default constructor */
every single line--  public Loan() {
every single line--    this(2.5, 1, 1000);
every single line--  }
every single line--
every single line--  /** Construct a loan with specified annual interest rate,
every single line--      number of years and loan amount
every single line--    */
every single line--  public Loan(double annualInterestRate, int numberOfYears,
every single line--      double loanAmount) {
every single line--    this.annualInterestRate = annualInterestRate;
every single line--    this.numberOfYears = numberOfYears;
every single line--    this.loanAmount = loanAmount;
every single line--    loanDate = new java.util.Date();
every single line--  }
every single line--
every single line--  /** Return annualInterestRate */
every single line--  public double getAnnualInterestRate() {
every single line--    return annualInterestRate;
every single line--  }
every single line--
every single line--  /** Set a new annualInterestRate */
every single line--  public void setAnnualInterestRate(double annualInterestRate) {
every single line--    this.annualInterestRate = annualInterestRate;
every single line--  }
every single line--
every single line--  /** Return numberOfYears */
every single line--  public int getNumberOfYears() {
every single line--    return numberOfYears;
every single line--  }
every single line--
every single line--  /** Set a new numberOfYears */
every single line--  public void setNumberOfYears(int numberOfYears) {
every single line--    this.numberOfYears = numberOfYears;
every single line--  }
every single line--
every single line--  /** Return loanAmount */
every single line--  public double getLoanAmount() {
every single line--    return loanAmount;
every single line--  }
every single line--
every single line--  /** Set a newloanAmount */
every single line--  public void setLoanAmount(double loanAmount) {
every single line--    this.loanAmount = loanAmount;
every single line--  }
every single line--
every single line--  /** Find monthly payment */
every single line--  public double getMonthlyPayment() {
every single line--    double monthlyInterestRate = annualInterestRate / 1200;
every single line--    double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
every single line--      (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
every single line--    return monthlyPayment;    
every single line--  }
every single line--
every single line--  /** Find total payment */
every single line--  public double getTotalPayment() {
every single line--    double totalPayment = getMonthlyPayment() * numberOfYears * 12;
every single line--    return totalPayment;    
every single line--  }
every single line--
every single line--  /** Return loan date */
every single line--  public java.util.Date getLoanDate() {
every single line--    return loanDate;
every single line--  }
every single line--}
file Loan.java has
210 words
71 lines
1777 characters
*/