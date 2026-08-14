package tools;

public class Car extends Vehicle{
    private int numberOfSeats;

    public Car(String brand, double rentPricePerDay,int numberOfSeats){
        super(brand,rentPricePerDay);
        this.numberOfSeats=numberOfSeats;

    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void display(){

        System.out.println(getBrand()+" "+getRentPricePerDay()+" "+isRented() +getNumberOfSeats());
    }
}
