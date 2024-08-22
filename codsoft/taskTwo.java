package codSoft;
import java.util.Scanner;

public class taskTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your each subject marks (out of 100): ");
            
            int telugu = getValidMarks(s, "Telugu");
            int hindi = getValidMarks(s, "Hindi");
            int english = getValidMarks(s, "English");
            int maths = getValidMarks(s, "Maths");
            int social = getValidMarks(s, "Social");

            int totalMarks = telugu + hindi + english + maths + social;
            float percentage = totalMarks * 100 / 500.0f;

            System.out.println("\nMarks entered:");
            System.out.println("Telugu Marks: " + telugu);
            System.out.println("English Marks: " + english);
            System.out.println("Hindi Marks: " + hindi);
            System.out.println("Maths Marks: " + maths);
            System.out.println("Social Marks: " + social);

            System.out.println("Total Marks: " + totalMarks + " (out of 500)");
            System.out.println("Percentage: " + percentage + "%");

            if (percentage >= 90) {
                System.out.println("Grade: A");
            } else if (percentage >= 80) {
                System.out.println("Grade: B");
            } else if (percentage >= 70) {
                System.out.println("Grade: C");
            } else if (percentage >= 50) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }

            System.out.print("Do you want to check again (yes/no): ");
            String op = s.next();

            if (op.equalsIgnoreCase("no")) {
                break;
            }
        }
        s.close();
    }

    private static int getValidMarks(Scanner s, String subject) {
        int marks;
        while (true) {
            System.out.print(subject + ": ");
            if (s.hasNextInt()) {
                marks = s.nextInt();
                if (marks >= 0 && marks <= 100) {
                    break;
                } else {
                    System.out.println("Invalid marks, please enter a number between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input, please enter a number between 0 and 100.");
                s.next(); // clear the invalid input
            }
        }
        return marks;
    }
}
