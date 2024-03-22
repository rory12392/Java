import java.util.Scanner;

public class JPA01 {
    static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter score:");
        int a = x.nextInt();
        
        if(a >= 60)
        	System.out.println("You pass");
        System.out.println("End");
    }
}
