import java.util.Scanner;

public class CJPA05 {
    static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {

        int z = 0;
        while (z < 1) {
            System.out.printf("Please enter value:");
            int a,b=1;
            int n = x.nextInt();
            if(n>=1&&n<=10){
                for(a=1; a <= n; a++){
                b=b*a;
                z = z + 1;
                }
            System.out.printf("%d!: %d",n,b);
            }
        else System.out.println("Error, the value is out of range.");
        }
    }

}
