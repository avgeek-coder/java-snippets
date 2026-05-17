import java.util.* ;
class arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        float a[] = new float[15] ;
        System.out.println("Input 15 floating point numbers") ;
        for(int i=0 ; i<15 ; i++) {
            a[i] = sc.nextFloat() ;
        }
        System.out.println("Enter a searching element:") ;
        float se = sc.nextFloat() ;
        int k=0 ;
        for(int i=0 ; i<15 ; i++) {
            if(se==a[i]) {
            System.out.println("Found at Index " +(i)) ;
            k++ ;
            break ;
            }
        }
        if(k==0) {
            System.out.println("Element not found!") ;
        }
    }
}
