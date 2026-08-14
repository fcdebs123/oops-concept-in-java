package tools;

public class Traingle extends Shape{
    private double base;
    private double height;

    public Traingle(String name, double base, double height){
        super(name);
        this.base=base;
        this.height=height;
    }
    //@Override
    public double calculateArea(){
        return 0.5*base*height;
    }
    @Override
    public void display(){
        System.out.println(getName()+" "+calculateArea());
    }
}
