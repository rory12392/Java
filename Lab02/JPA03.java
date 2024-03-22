import java.util.Scanner;

public class JPA03 {
    static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        int i = 0;
        while (i < 2) {
            System.out.println("Input an integer:");
            int a = x.nextInt();

            if (a % 2 == 0) {
                System.out.println("The number is odd.");
            }
            else if (a % 2 != 0) {
                System.out.println("The number is even.");
            }
            i += 1;
        }
    }
}