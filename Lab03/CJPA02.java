public class CJPA02 {
    public static void main(String[] args) {
        int a = 27;
        int b = 0;
        for(int x = 1; x <= a; x++){
            for(int y = 1; y <= a; y++){
                b++;
                if( a==b){
                    System.out.println("count = " + y);
                }
            }
        }
    }
}
