public class testVehicle {
    public static void main(String[] args) {
        Vehicle v1=new Vehicle("Tesla","Y","Blue",654,2020,4);
        Vehicle v2=new Vehicle("Harley-Davidson","FXS 1340","Black",5800,1981,2);
        System.out.println("Vehicle-1");
        v1.printVehicle();
        System.out.println("Vehicle-2");
        v2.printVehicle();
        if(v1.equals(v2))
            System.out.println("Both vehicles are the same");
//create 2 objects for Car class
        Car c1=new Car("Opel","A","Red",3455,2019,4,"manual");
        Car c2=new Car("BMW","Z","Grey",5000,2020,4,"automated");
        System.out.println("Car-1: ");
        c1.printCar();
        System.out.println("Car-2: ");
        c2.printCar();
        //create 2 objects for Motorbike
        Motor m1=new Motor("YAMAHA","2002","blue",5000,2002,2);
        Motor m2=new Motor("Harley-Davidson","1340","red",4700,1990,2);
        System.out.println("Motor-1:");
        m1.printMotor();
        System.out.println("Motor-2:");
        m2.printMotor();
        //create 2 objects for Van class
        Van w1=new Van("VW","Caravelle","orange",3000,2020,4,8,"family");
        Van w2=new Van("VW","Transporter T6","red",4300,2018,4,2,"Transporter");
        System.out.println("Van-1:");
        w1.printVan();
        System.out.println("Van-2:");
        w2.printVan();
    }
}
