/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject_loancalculator;
public class LoanCalculator {
    private double principal;
    private double annualInterestRate;
    private int loanDurationYears;

    public LoanCalculator(double principal, double annualInterestRate, int loanDurationYears) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.loanDurationYears = loanDurationYears;
    }

    public double calculateMonthlyPayment() {
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        int totalPayments = loanDurationYears * 12;
        return (principal * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -totalPayments));
    }

    public double calculateTotalInterest(double monthlyPayment) {
        int totalPayments = loanDurationYears * 12;
        return (monthlyPayment * totalPayments) - principal;
    }

    public String generatePaymentSchedule(double monthlyPayment) {
        StringBuilder schedule = new StringBuilder();
        double remainingBalance = principal;
        double monthlyInterestRate = (annualInterestRate / 100) / 12;

        schedule.append(String.format("%-10s %-15s %-15s %-15s\n", "Month", "Payment", "Interest", "Balance"));
        for (int i = 1; i <= loanDurationYears * 12; i++) {
            double interest = remainingBalance * monthlyInterestRate;
            double principalPayment = monthlyPayment - interest;
            remainingBalance -= principalPayment;

            schedule.append(String.format("%-10d %-15.2f %-15.2f %-15.2f\n", i, monthlyPayment, interest, remainingBalance));
        }

        return schedule.toString();
    }
}
