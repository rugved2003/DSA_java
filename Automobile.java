import java.util.*;

public class Automobile {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        int v = scanner.nextInt();
        int w = scanner.nextInt();
        float res = ((4 * v) - w) / 2;
        if (w >= 2 && (w % 2 == 0) && v < w) {
            System.out.println("TW= " + (int) (res) + " FW= " + (int) (res));
        } else {
            System.out.println("INVALID");

        }

    }

}