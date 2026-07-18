import java.util.* ;
class Bill {
    int bno, call ;
    String name ; double amt ;
    Bill() {
        bno = 0 ;
        call = 0 ;
        name = "" ;
        amt = 0.0 ;
    }
    Bill(int b, String n, int c)  {
        bno = b ;
        name = n ;
        call = c ;
    }
    void Calculate() {
        if(call<=100)
            amt = call*0.60 ;
        else if(call<=200)
            amt = 100*0.60 + (call-100)*0.80 ;
        else if(call<=300)
            amt = 100*0.60 + 100*0.80 + (call-200)*1.20 ;
        else
            amt = 100*0.60 + 100*0.80 + 100*1.20 + (call-300)*1.50 ;
        amt = amt+125 ;
    }
    void Display() {
        System.out.println("Bill Number: "+bno) ;
        System.out.println("Name: "+name) ;
        System.out.println("Calls made: "+call) ;
        System.out.println("Total Amount to be paid: "+amt) ;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter Bill Number: ") ;
        int b = sc.nextInt() ;
        System.out.println("Enter Name: ") ;
        String n = sc.next() ;
        sc.nextLine() ;
        System.out.println("Enter Calls made: ") ;
        int c = sc.nextInt() ;
        Bill bl = new Bill(b,n,c) ;
        bl.Calculate();
        bl.Display() ;
    }
}