import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
  

        // Step 1: Create a Scanner object to take input from the user.
        Scanner scanner = new Scanner(System.in);

        // Step 2: Prompt the user to enter the test score.
        System.out.print("Enter the test score: ");

        // Step 3: Read the test score from the user.
        int testScore = scanner.nextInt();

        // Step 5: Create a String variable to store the grade.
        String grade;

        // Step 6: Use the test score to determine the grade using the ternary operator.
        grade = (testScore >= 90) ? "A"
                : (testScore >= 80) ? "B"
                : (testScore >= 70) ? "C"
                : (testScore >= 60) ? "D"
                : "F";

        // Step 7: Output the grade.
        System.out.println("The grade is: " + grade);

        // Step 8: Close the scanner.
        scanner.close();
    }
}
