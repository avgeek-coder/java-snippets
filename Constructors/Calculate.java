import java.util.* ;
public class Calculate{
    int num,f,rev,d ;
    Calculate(int n) {
        num = n ;
        f = 0 ;
        rev = 0 ;
    }
    int prime() {
        f = 0 ;
        for(int i=1 ; i<=num ; i++) {
            if(num%i==0)
                f++ ;
        }
        if(f==2)
            return 1 ;
        else
            return 0 ;
    }
    int reverse() {
        rev = 0 ;
        while(num>0) {
            num = d%10 ;
            rev = (rev*10)+d ;
            num=num/10 ;
        }
        return rev ;
    }
    void display() {
        int p = prime() ;
        int r = reverse() ;
        if(p==1 && r==rev)
            System.out.println("Prime Palindrome number.") ;
        else
            System.out.println("Not a Prime Palindrome number.") ;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a number: ") ;
        int a = sc.nextInt() ;
        Calculate cal = new Calculate(a) ;
        cal.display() ;
    }
}