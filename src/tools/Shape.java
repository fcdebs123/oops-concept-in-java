package tools;

public class Shape {
    private String name;
    public Shape(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double calculateArea(){
        return 0;
    }

    public void display(){
        System.out.println(name + "area: "+calculateArea());
    }
}
