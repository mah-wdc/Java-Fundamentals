public class Vehicle implements Transport {

    String brand;
    String model;
    Short yearMade;
    boolean fourWheels;
    boolean gasoline;

    

    public Vehicle(String brand, String model, Short yearMade, boolean fourWheels, boolean gasoline) {
        this.brand = brand;
        this.model = model;
        this.yearMade = yearMade;
        this.fourWheels = fourWheels;
        this.gasoline = gasoline;
    }

    @Override
    public void turnOn() {
        System.out.println("Vehicle turns on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Vehicle turns off.");
    }

    @Override
    public void go() { 
        System.out.println("Vehicle goes.");
    }

    @Override
    public void stop() {
        System.out.println("Vehicle stops.");
    }
    
}
