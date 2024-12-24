This project is a Loan Calculator aimed at assisting users in calculating and comprehending loan payments. It features the ability to compute monthly payments, total interest, and create a detailed payment schedule throughout the loan's term. The program employs a graphical interface (using JOptionPane) to collect user inputs for the loan principal, annual interest rate, and loan duration in years. It then presents a breakdown of payment details and shows a payment schedule for improved financial planning.

How to Run It
1. Set Up the Environment: Make sure you have a Java development environment (like IntelliJ IDEA, Eclipse, or a JDK with command-line tools).
2. Compile the Code: Save the two classes (LoanCalculator and Main) in their respective files (LoanCalculator.java and Main.java) within the same package (finalproject_loancalculator). Compile them using a Java IDE or the javac command in the terminal.
3. Execute the Program: Run the Main class. The program will prompt the user to enter the loan details (principal, annual interest rate, and loan duration) through pop-up dialogs.
4. View Results: The loan payment summary, which includes the monthly payment, total interest, and payment schedule, will be shown in a pop-up dialog. Additionally, the schedule will be printed to the console for convenience.

 Additional Notes
- Error Handling: The program effectively manages invalid inputs using a try-catch block. If a user inputs non-numeric data, a friendly error message will encourage them to correct it.
- Payment Schedule Precision: The schedule takes into account monthly compounding interest, ensuring precise calculations for each payment period.
- Potential Enhancements: You might consider expanding the program to save the payment schedule to a file or adding a graphical user interface for improved usability.
- Dependencies: The program relies solely on standard Java libraries, making it lightweight and portable.
