import java.util.Scanner;

public class CJPA04 { 
	static Scanner x=new Scanner(System.in);
	public static void main(String[] args) {
        	int a = 0;
        	int b = 0;
        	int c = 0;
        	double average;
        
		while(true)
		{
			System.out.print("Please enter meal dollars or enter -1 to stop: ");
			b=x.nextInt();		

			if(b != -1)
			{
				a += b;
				c++;
			}
			else
			{
				break;
			}
		}     
		average=(double)a/c;
  		System.out.println("餐點總費用:" + a);
        	System.out.printf(" %d 道餐點平均費用為: %.2f \n",c,average);
        }
    }

