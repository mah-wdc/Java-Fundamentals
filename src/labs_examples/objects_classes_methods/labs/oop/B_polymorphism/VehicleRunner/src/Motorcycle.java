public class Motorcycle extends Vehicle {

    public Motorcycle(String brand, String model, Short yearMade, boolean fourWheels, boolean gasoline) {
        super(brand, model, yearMade, fourWheels, gasoline);
        this.brand = brand;
        this.model = model;
        this.yearMade = yearMade;
        this.fourWheels = false;
        this.gasoline = gasoline;
    }

    @Override
    public void go() {
        System.out.println("Motorcycle goes.");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stops.");
    }

    @Override
    public void turnOff() {
        System.out.println("Motorcycle turns off.");
    }

    @Override
    public void turnOn() {
        System.out.println("Motorcycle turns on.");
    }
    
}
