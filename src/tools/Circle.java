package tools;

public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String name, double radius){
        super(name);
        this.radius=radius;

    }
    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public void display(){
        System.out.println(getName()+" "+calculateArea());
    }

}
