import java.util.* ;
class Library {
    String name ;
    int price, day ;
    double fine ;
    void input() {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter Book Name: ") ;
        name = sc.nextLine() ;
        System.out.println("Enter printed price of book: ") ;
        price = sc.nextInt() ;
        System.out.println("Enter number of days for which fine is to be paid: ") ;
        day = sc.nextInt() ;
    }
    void cal() {
        if(day<=7)
            fine=price+0.25 ;
        else if(day<=15)
            fine = 0.25*7 + (day-7)*0.40 ;
        else if(day<=30)
            fine = 0.25*7 + (day-15)*60 + 0.40*8 ;
        else {
            fine = 0.25*7 + 15*0.60 + 0.40*8 + (day-30)*0.80 ;
        }
    }
    void display() {
        System.out.println("The Name of book is: " +name) ;
        System.out.println("Fine to be paid is: " +fine) ;
    }
    public static void main(String[] args) {
        Library lib = new Library() ;
        
        lib.input() ;
        lib.cal() ;
        lib.display() ;
    }
}