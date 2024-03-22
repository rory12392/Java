import java.util.Scanner;

public class JPA06 {
    static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        int i = 0;
        
        while (i < 5) {
            System.out.print("Input Chinese score:");
            int a1 = x.nextInt();
            System.out.print("Input English score:");
            int a2 = x.nextInt();
            System.out.print("Input Math score:");
            int a3 = x.nextInt();

            if (a1 >= 60 && a2 >= 60 && a3 >= 60) {
                System.out.println("All Pass");
            }
            else if (a1 < 60 && a2 >= 60 && a3 >= 60) {
                System.out.println("Chinese failed");
            }
            else if (a1 >= 60 && a2 < 60 && a3 >= 60) {
                System.out.println("English failed");
            }
            else if (a1 >= 60 && a2 >= 60 && a3 < 60) {
                System.out.println("Math failed");
            }
            else if (a1 < 60 && a2 < 60 && a3 >= 60) {
                System.out.println("Chinese failed\nEnglish failed");
            }
            else if (a1 < 60 && a2 >= 60 && a3 < 60) {
                System.out.println("Chinese failed\nMath failed");
            }
            else if (a1 >= 60 && a2 < 60 && a3 < 60) {
                System.out.println("English failed\nMath failed");
            }
            else if (a1 < 60 && a2 < 60 && a3 < 60) {
                System.out.println(x + "Chinese failed\nEnglish failed\nMath failed");
            }
            i += 1;
        }
    }
}

