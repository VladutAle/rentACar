public class Car extends Vehicle{
    private String GearBox;//the code is accessible within the car class
    public Car(String brand, String model, String color, int power, int fabricationYear, int noOfWheels,String gearBox) {
        super(brand, model, color, power, fabricationYear, noOfWheels);
        GearBox=gearBox;
    }

    public void setGearBox(String gearBox) {
        GearBox = gearBox;
    }
    public String getGearBox() {
        return GearBox;
    }

       public void printCar(){
        printVehicle();
        System.out.println("This car has: "+GearBox);
    }
}
