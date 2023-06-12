import java.util.Scanner;

public class CountGreaterElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int N = scanner.nextInt();

        int[] Arr = new int[N];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            Arr[i] = scanner.nextInt();
        }

        int count = 1;
        int maxValue = Arr[0];

        for (int i = 1; i < N; i++) {
            if (Arr[i] > maxValue) {
                count++;
                maxValue = Arr[i];
            }
        }

        System.out.println("Count of elements meeting the condition: " + count);

        scanner.close();
    }
}
