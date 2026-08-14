package tools;

 public class Bike extends Vehicle{
    private boolean hasGear;

    public Bike(String brand,double rentPricePerDay, boolean hasGear){
        super(brand,rentPricePerDay);
        this.hasGear=hasGear;
    }

    public boolean isHasGear() {
        return hasGear;
    }

    public void setHasGear(boolean hasGear) {
        this.hasGear = hasGear;
    }
    @Override
    public void display(){
        System.out.println("[Brand:]"+getBrand()+" "+"[Price Per Day]"+getRentPricePerDay()+" "+"[Rent Availiable:]"+isRented() +"[HAs Gear:]"+isHasGear());
    }
}
