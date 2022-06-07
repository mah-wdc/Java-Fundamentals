public class Car extends Vehicle {

    public Car(String brand, String model, Short yearMade, boolean fourWheels, boolean gasoline) {
        super(brand, model, yearMade, fourWheels, gasoline);
        this.brand = brand;
        this.model = model;
        this.yearMade = yearMade;
        this.fourWheels = fourWheels;
        this.gasoline = gasoline;
    }

    

    @Override
    public void go() {
        System.out.println("Car goes.");
    }

    @Override
    public void stop() {
        System.out.println("Car stops.");
    }

    @Override
    public void turnOff() {
        System.out.println("Car turns off.");
    }

    @Override
    public void turnOn() {
        System.out.println("Car turns on.");
    }
    
}
