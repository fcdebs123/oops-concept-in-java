//import tools.VeryAdvanCalc;
import tools.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then pre
// ss Enter. You can now see whitespace characters in your code.

class Student{
    String Name;
    int Roll_no;
    int Marks;
}

class Human{
    private int age;
    private String Name;
public Human(){
    age=12;
    Name="John";
}
public Human(int age,String Name){
    this.age=age;
    this.Name=Name;
}
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}






/*class Computer {
    public void playMusic() {
        System.out.println("Music is playing...");
    }

    public String getmePen(int cost, int marketPrice) {


        if (cost >= marketPrice) {
            return "pen is coming";
        } else
            return "pen is not coming";
    }
}

    class Calculator{
        public int addNumber(int x, int y, int z){
            return x+y+z;
        }
        public int addNumber(int x, int y ){
            return x+y;
        }
    }
*/
                                        //ATM simulator using class and objects
/*class atmSimulator{
    double balance=10000000;
    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Invalid deposit amount");
        }else{
            balance=balance+amount;
            System.out.println("Deposit successful Your new balance is>..."+balance);
        }
    }
    public void withdraw(double amount) {
        if (amount < 0 || amount > balance) {
            System.out.println("Invalid or Insufficient balance");
        } else {
            balance = balance - amount;
        }
    }
        public void checkBalance(){
            System.out.println("Your balance is..."+balance);
        }
    }*/

/*class Student {
    String name;
    int Marks;

    public String calculateGrade( char grade) {
        if (Marks >= 90 && Marks <= 100) {
            return "A";
        } else if (Marks >= 89 && Marks <= 75) {
            return "B";
        } else if (Marks >= 60 && Marks <= 74) {
            return "C";
        } else if (Marks >= 40 && Marks <= 59) {
            return "D";
        } else {
            return "Non-Graded";
        }
    }
    public boolean checkPass(){
            if (Marks>=40){
                return true;
            }else {
                return false;
            }
        }
public void displayInfo(){
        
        
        System.out.println("Name:");
    System.out.println("Marks:");
    System.out.println("Grade:");
    System.out.println("Result:");
}
}
*/
/*class Mobile{
    String brand;
    int price;
   static String Name;

   public void show(){
       System.out.println(brand+" "+ " "+price+" "+Name);
   }
   public static void show1( Mobile mobile2){
       System.out.println(mobile2.brand+" "+ " "+mobile2.price+" "+Name);
   }
}
class Employee{
   private String Name;
  private   double salary;
    private int employe_id;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmploye_id() {
        return employe_id;
    }

    public void setEmploye_id(int employe_id) {
        this.employe_id = employe_id;
    }
    public void display(){

        System.out.println("Name: "+ getName()+":" +"\n "+"Salary:"+getSalary()+"\n "+" ID:"+getEmploye_id()+"\n");

    }

   public void giveRaise(double amount){
        if (amount<0){
            System.out.println("Invalid raise of amount");
        }else{
            double newSalary=getSalary()+amount;
            setSalary(newSalary);
            System.out.println("New salary is:"+getSalary());
        }
   }
   public boolean earnMoreThan(Employee other){
        return this.salary>other.getSalary();
   }
}*/



public class Demo {
    public static void main(String[] args) {
        /*Scanner scanner=new Scanner(System.in);
        Student student=new Student();
        System.out.println("Enter the student name");

        System.out.println("Enter the student marks");
        int studentmarks=scanner.nextInt();

        /*Scanner sc=new Scanner(System.in);
        atmSimulator myAccount=new atmSimulator();
        while (true){
            System.out.println("CheckBalance,Deposit,withdraw,exit");
            String choice=sc.nextLine();
            if (choice.equals("exit")){
                System.out.println("See you next time");
                break;
            } else if (choice.equals("CheckBalance")) {
                myAccount.checkBalance();
            } else if (choice.equals("Deposit")) {
                System.out.println("Enter the amount to be deopsited");
                double amount= sc.nextDouble();
                sc.nextLine();
                myAccount.deposit(amount);
            } else if (choice.equals("withdraw")) {
                System.out.println("Enter the amount to withdraw");
                double amount=sc.nextDouble();
                sc.nextLine();
                myAccount.deposit(amount);
            }
            else{
                System.out.println("Invalid choice");
            }
        }



        /*int cost=20;
        int marketPrice=12;

        Computer comp=new Computer();
        Calculator calc= new Calculator();
        int addnumberThree=calc.addNumber(1, 2, 5);
        int addnumberTwo=calc.addNumber(3,5);
        comp.playMusic();
        String str=comp.getmePen(cost,marketPrice);
        System.out.println(str);
        System.out.println(addnumberThree);
        System.out.println(addnumberTwo);*/
                /*MUltidimesional Array




        /*int [][] nums=new int[3][4];

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                nums[i][j]=(int)(Math.random()*10);
            }
        }

        for(int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        for (int n[]:nums){
            for (int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
*/                               /* Array java as a object*/
        Student s1= new Student();
        s1.Name="Anil";
        s1.Marks=88;
        s1.Roll_no=1;

        Student s2= new Student();
        s2.Name="Ram";
        s2.Marks=80;
        s2.Roll_no=2;

        Student s3= new Student();
        s3.Name="Shreya";
        s3.Marks=81;
        s3.Roll_no=3;

        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        /*for (int i=0;i< students.length;i++){
            System.out.println(students[i].Name +" " + students[i].Marks +" ");

        }*/
        //System.out.println();
        /*for (Student stud:students){
            System.out.println(stud.Name +" : " + stud.Marks);
        }

        Mobile mobile1=new Mobile();
        mobile1.brand="Apple";
        mobile1.price=120;
        Mobile.Name="Smart phone";

        Mobile mobile2=new Mobile();
        mobile2.brand="Samsing";
        mobile2.price=130;
        Mobile.Name="Smart phone";

        mobile1.show();
        mobile2.show();
        Mobile.show1(mobile2);*/

        /*Human obj=new Human();
        Human obj1=new Human(20,"hari");
        //obj1.setAge(12);
        //obj1.setName("Ravi");
        //obj1.age=12;
        //obj1.Name="Anil";
        System.out.println(obj.getName()+" "+obj.getAge());
        System.out.println(obj1.getName()+" "+obj1.getAge());*/

       /* Employee employee1=new Employee();
        Employee employee2=new Employee();
        System.out.println("---------Employee Info-----");
        employee1.setName("Sangam");
        employee1.setSalary(120000);
        employee1.setEmploye_id(1);
        employee1.display();
        employee1.giveRaise(20000);
        employee2.setName("Samrat");
        employee2.setSalary(120000);
        employee2.setEmploye_id(1);
        employee2.display();
        employee2.giveRaise(40000);

        boolean result=employee1.earnMoreThan(employee2);
        if (result){
            System.out.println(employee1.getName()+" "+"earns more than"+employee2.getName());
        }else {
            System.out.println(employee1.getName()+" "+"does not earns more than"+employee2.getName());
        }*/
        /*VeryAdvanCalc calculator=new VeryAdvanCalc();
        int r1= calculator.add(4,3);
        int r2= calculator.sub(6,1);
        int r3=calculator.mul(9,5);
        int r4=calculator.div(15,3);
        double r5=calculator.power(4,2);
        System.out.println(r1+" "+ r2+" "+r3+" "+r4+" "+r5);*/


        /*Book b1=new Book("java","john doe",1200);
        Book b2=new Book("c++","Robert Green",1000);
        Book b3=new Book("DSA","Various Writers",1800);
        EBook eBook1=new EBook("DBMS","jay smith",1400,15.2);

        b1.show();
        b2.show();
        b3.show();

        eBook1.displayFileSize();
        System.out.println();
        b1.checkOut();
        b1.checkOut();
        b2.checkOut();
        b2.checkOut();
        //b3.checkOut();
        b1.returnBook();
        b2.returnBook();
        b3.returnBook();

        boolean result= b1.isPricerThan(eBook1);
        if(result){
            System.out.println(b1.getTitle()+" "+"is price higher than"+eBook1.getTitle());
        }else {
            System.out.println(b1.getTitle()+" "+"is price Not higher than"+eBook1.getTitle());
        }*/

        /*Vehicle[] fleet=new Vehicle[3];

        fleet[0]=new Vehicle("Mercedez",1800);
        fleet[1]=new Car("roll royals",2200,4);
        fleet[2]=new Bike("honda",2800,true);
        for (Vehicle v:fleet){
            v.display();
        }
        System.out.println();

fleet[1].rent();
fleet[1].rent();
fleet[0].returnVehicle();*/
        Shape[] all=new Shape[4];
        all[0]=new Shape("All shape");
        all[1]=new Circle("circle",16);
        all[2]=new Rectangle("Rectangle",4,6);
        all[3]=new Traingle("Traingle",8,6);
        for (Shape s:all){
            //s.calculateArea();
            s.display();
        }
        System.out.println();

    }

}