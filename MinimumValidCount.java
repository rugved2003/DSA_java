import java.util.Scanner;

public class MinimumValidCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String S = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch == '*') {
                count++;
            } else if (ch == '#') {
                count--;
            }
        }

        int minValidCount = Math.abs(count);
        System.out.println("Minimum considered valid count: " + minValidCount);

        scanner.close();
    }
}
