public class Bike extends Vehicle {

    public Bike(String brand, String model, Short yearMade, boolean fourWheels, boolean gasoline) {
        super(brand, model, yearMade, fourWheels, gasoline);
        this.brand = brand;
        this.model = model;
        this.yearMade = yearMade;
        this.fourWheels = false;
        this.gasoline = false;
    }

    @Override
    public void go() {
        System.out.println("Bike goes.");
    }

    @Override
    public void stop() {
        System.out.println("Bike stops.");
    }

    @Override
    public void turnOff() {
        System.out.println("Bike can not turn off.");
    }

    @Override
    public void turnOn() {
        System.out.println("Bike can not turn on.");
    }
}
