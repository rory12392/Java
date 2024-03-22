import java.util.Scanner;

public class CJPA06 {
    public static void main (String argv[]) {
        int x, y;
        Scanner input = new Scanner(System.in);
        System.out.println("Input:");
        x = input.nextInt();
        while (x != 999) {
            y = input.nextInt();
            System.out.println(powerOf(x, y));
            System.out.println("Input:");
            x = input.nextInt();
        }
    }  
    static int powerOf (int m, int n) {
    int a = 1;
    while (n > 0) {
        a *= m;
        n--;
    }
    return a;
    }
}