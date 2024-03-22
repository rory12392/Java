import java.util.Scanner;

public class JPA04 {
    static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        int i = 0;
        
        while (i < 2) {
            System.out.println("Input:");
            int a = x.nextInt();

            if (a % 9 == 0 && a % 5 == 0) {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            i += 1;
        }
    }
}