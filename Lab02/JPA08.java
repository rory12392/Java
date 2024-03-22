import java.util.Scanner;

public class JPA08 {
    static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        int i = 0;
        
        while (i < 5) {
            System.out.print("Input:");
            int a = x.nextInt();

            if (a >= 90 ) {
                System.out.println("Your grade is A");
            }
            else if (a < 90 && a >= 80) {
                System.out.println("Your grade is B");
            }
            else if (a < 80 && a >= 70) {
                System.out.println("Your grade is C");
            }
            else if (a < 70 && a >= 60) {
                System.out.println("Your grade is D");
            }
            else if (a < 60) {
                System.out.println("Your grade is F");
            }

            i += 1;
        }
    }
}
