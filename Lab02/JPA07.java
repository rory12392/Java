import java.util.Scanner;

public class JPA07 {
    static Scanner x = new Scanner(System.in);
    public static void main(String[] args){
        int i = 0;
        
        while (i < 4) {
            System.out.print("請輸入三個整數:");
            int a = x.nextInt();
            int b = x.nextInt();
            int c = x.nextInt();
            
            if(a + b > c){
                if(a * a + b * b  == c * c){
                System.out.println("直角三角形");
                }
                else if(a * a + b * b < c * c){
                System.out.println("鈍角三角形");
                }
                else if(a * a + b * b > c * c){
                System.out.println("銳角三角形");
                }
            }
            else{
            System.out.println("不可以構成三角形");
            }
            
            i += 1;
        }
    }
}