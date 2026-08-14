package tools;

public class Vehicle {
    private String brand;
    private double rentPricePerDay;
    private boolean isRented;

    public Vehicle(String brand, double rentPricePerDay){
        this.brand=brand;
        this.rentPricePerDay=rentPricePerDay;
        this.isRented=false;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getRentPricePerDay() {
        return rentPricePerDay;
    }

    public void setRentPricePerDay(double rentPricePerDay) {
        this.rentPricePerDay = rentPricePerDay;
    }

    public boolean isRented(){
        return isRented;
    }

    public void rent(){
        if (!isRented){
            isRented=true;
            System.out.println(brand+"The car is rented successfully");
        }else{
            System.out.println(brand+"This car is already rented");
        }
    }
    public void returnVehicle() {
        if (isRented) {
            isRented = false;
            System.out.println(getBrand() + "is availiabe again and ready to rented");
        } else {
            System.out.println(getBrand() + "is not rented");
        }
    }
        public void display(){
            System.out.println(getBrand()+" "+getRentPricePerDay()+" "+isRented());

        }
        public double calculateRentCost(int days){
        return rentPricePerDay*days;
        }
    }

