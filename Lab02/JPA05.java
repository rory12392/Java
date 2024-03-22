import java.util.Scanner;

public class JPA05 {
    static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        int i = 0;
        
        while (i < 4) {
            System.out.println("Enter an integer:");
            int a = x.nextInt();

            if (a % 2 == 0 && a % 3 == 0 && a % 6 == 0) {
                System.out.println(x + "是2、3、6的倍數");
            }
            else if (a % 2 == 0) {
                System.out.println(x + "是2的倍數");
            }
            else if (a % 3 == 0) {
                System.out.println(x + "是3的倍數");
            }
            else if (a % 2 != 0 && a % 3 != 0 && a % 6 != 0) {
                System.out.println(x + "不是2、3、6的倍數");
            }
            
            i += 1;
        }
    }
}
