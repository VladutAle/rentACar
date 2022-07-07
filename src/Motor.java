public class Motor extends Vehicle{

    @Override
    public void setNoOfWheels(int noOfWheels) {
        super.setNoOfWheels(noOfWheels);
        noOfWheels=2;
    }

    public Motor(String brand, String model, String color, int power, int fabricationYear, int noOfWheels) {
        super(brand, model, color, power, fabricationYear, noOfWheels);
    }
public void printMotor(){
        printVehicle();
    System.out.println("This vehicle has:"+getNoOfWheels()+" wheels");
}
}
