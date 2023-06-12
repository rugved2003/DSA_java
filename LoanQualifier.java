import java.util.Scanner;

public class LoanQualifier {

    public static void main(String args[]) {
        int requiredSalary = 30000;
        int requiredyearsemployed = 2;
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer:");
        double years = scanner.nextDouble();

        scanner.close();

        if (salary >= requiredSalary) {
            if (years >= requiredyearsemployed) {
                System.out.println("Congrats! You qualify for the loan");
            } else {
                System.out.println("Sorry, you must have worked at your current job "
                        + requiredyearsemployed + " years.");
            }

        } else {
            System.out.println("Sorry, you must earn at least $"
                    + requiredSalary + " to qualify for the loan");
        }

    }
}