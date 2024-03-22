import java.util.Scanner;

public class  CJPA01 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Input:");

        int x1 = x.nextInt();

        int sum = 0;
        for(int i = 1; i<=x1; i++)
            sum += i;
        System.out.println("1 + ... + " + x1 + " = " + sum);
    }
}
