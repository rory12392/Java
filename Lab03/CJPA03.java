public class CJPA03 {
    public static void main (String args []){
        System.out.printf("1~1000中的完美數有: ");
        for( int i = 2 ; i <= 1000 ; i++ ){
            int sum = 0 ;
            for( int j = 1 ; j < i ; j++ ){
                if( i % j == 0 ){
                    sum += j ;
                }
            }
            if(sum==i){
                		System.out.printf("%d ",i);
            }
        }
    }
}
