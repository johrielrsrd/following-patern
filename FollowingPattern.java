import java.util.Scanner;

public class FollowingPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scan.nextInt();

        int k = 0;

        for (int i = 1; i <= input; i++, k = 0) {
            for (int j = 1; j <= input - i; j++) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
        }
    }
}
