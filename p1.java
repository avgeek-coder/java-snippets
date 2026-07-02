import java.util.* ;
public class Series_Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in) ;
        int x, n, sum=0 ;
        x = sc.nextInt() ;
        n = sc.nextInt() ;
        for(int i=1 ; i<=n ; i++) {
            sum = sum + (int)Math.pow(x,n) ;            
        }
        System.out.println("The sum of the series is = " +sum) ;
    }
}
