inner class in java
java in inner class is performed inside of a main class
while the main class of the object can be called but next class in the main class object cannot be called instead this should refer the main class and main class ohject
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*--------------------------inner class-------------------------------*/
class A{
    public void show(){
        System.out.println("In A");
    }
    class B{
        public void config(){
            System.out.println("in config");
        }
    }
}




public class deemo {
    public static void main(String[] args) {
        A obj=new A();
        A.B obj1=obj.new B();
        obj.show();
        obj1.config();

    }
}

but if we make the class B static we can remove the obj from the obj1 object it can run.
but the main class cannot be static that the case
