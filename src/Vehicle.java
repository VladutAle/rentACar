import java.lang.reflect.GenericArrayType;

public class Vehicle {
    private String brand;
    private String model;
    private String color;
    private int power;
    private int fabricationYear;
    private int noOfWheels;
    String gearBox;

    //create a class constructor for the Vehicle class with it;s parameters
    public Vehicle(String brand, String model, String color, int power, int fabricationYear, int noOfWheels) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.power = power;
        this.fabricationYear = fabricationYear;
        this.noOfWheels = noOfWheels;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(int fabricationYear) {
        this.fabricationYear = fabricationYear;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public void printVehicle(){
        System.out.println("Manufacture's name: "+getBrand());
        System.out.println("Color: "+getColor());

    }

}
