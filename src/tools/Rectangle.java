package tools;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String name,double length,double width){
        super(name);
        this.length=length;
        this.width=width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double calculateArea(){
        return length*width;
    }
    @Override
    public void display(){
        System.out.println(getName()+" "+calculateArea());
    }
}
