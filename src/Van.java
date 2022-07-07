public class Van extends Vehicle{

    private int Seats;
    private String Type;
    public Van(String brand, String model, String color, int power, int fabricationYear, int noOfWheels,int noOfSeats, String type) {
        super(brand, model, color, power, fabricationYear, noOfWheels);
        Seats=noOfSeats;
        Type=type;
    }

    public int getSeats() {
        return Seats;
    }

    public void setSeats(int seats) {
        Seats = seats;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
    public void printVan(){
        printVehicle();
        System.out.println("This van has: "+getSeats()+" seats");

    }
}
