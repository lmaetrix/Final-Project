/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalproject_loancalculator;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            double principal = Double.parseDouble(JOptionPane.showInputDialog("Enter the loan principal amount:"));
            double annualInterestRate = Double.parseDouble(JOptionPane.showInputDialog("Enter the annual interest rate (%):"));
            int loanDurationYears = Integer.parseInt(JOptionPane.showInputDialog("Enter the loan duration (in years):"));

            LoanCalculator calculator = new LoanCalculator(principal, annualInterestRate, loanDurationYears);

            double monthlyPayment = calculator.calculateMonthlyPayment();
            double totalInterest = calculator.calculateTotalInterest(monthlyPayment);
            String schedule = calculator.generatePaymentSchedule(monthlyPayment);

            StringBuilder result = new StringBuilder();
            result.append("Loan Payment Summary\n")
                  .append("----------------------\n")
                  .append(String.format("Principal Amount: %.2f\n", principal))
                  .append(String.format("Annual Interest Rate: %.2f%%\n", annualInterestRate))
                  .append(String.format("Loan Duration: %d years\n", loanDurationYears))
                  .append(String.format("Monthly Payment: %.2f\n", monthlyPayment))
                  .append(String.format("Total Interest Paid: %.2f\n\n", totalInterest))
                  .append("Payment Schedule:\n")
                  .append(schedule);

            // Display the result
            JOptionPane.showMessageDialog(null, result.toString(), "Loan Payment Summary", JOptionPane.INFORMATION_MESSAGE);

            // Optionally show schedule in console for clarity
            System.out.println(result.toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter numerical values.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An unexpected error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
