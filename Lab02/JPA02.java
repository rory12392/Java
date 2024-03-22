import java.util.Scanner;

public class JPA02 {
    static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input:");
        int a1 = x.nextInt();
        int a2 = x.nextInt();
        if (a1 > a2) {
            System.out.println(a1+" is larger than " + a2);
        }
        else if (a2 > a1) {
            System.out.println(a2+ " is larger than " + a1);
        }
    }
    
}