import java.util.* ;
class Employee {
    int eno, age,num ;
    double basic,da,hra,pf,net=0 ;
    String ename ;
    Scanner sc = new Scanner(System.in) ;
    void accept() {
        System.out.println("Enter Employee's name: ") ;
        ename = sc.nextLine() ;
        System.out.println("Enter Employee's number: ") ;
        eno = sc.nextInt() ;
        System.out.println("Enter Employee's age: ") ;
        age = sc.nextInt() ;
        System.out.println("Enter Employee's Salary: ") ;
        basic = sc.nextDouble() ;
    }
    void calculate() {
        hra = 0.185*basic ;
        da = 0.1745*basic ;
        pf = 0.081*basic ;
        net = basic + hra + da - pf ;
        if(age>50) {
            net = net+5000 ;
        }
    }
    void print() {
        System.out.println("Emp_no\t\tEmp_name\t\tAge\tBasic\t\tNet_salary") ;
        System.out.println(eno + "\t\t" +ename+ "\t\t" +age+ "\t" +basic+ "\t\t" +net) ;
    }
    public static void main(String[] args) {
        Employee emp = new Employee() ;
        emp.accept() ;
        emp.calculate() ;
        emp.print() ;
    }
}
