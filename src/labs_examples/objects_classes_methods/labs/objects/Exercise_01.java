
/*Following the example in CarExample.java, please use Object Composition to model an Airplane class.

The Airplane class must be composed of at least 4 other classes (as well as any primitive types you'd like).

The Airplane class itself should have a fuel capacity (double) variable, as well as a currentFuelLevel variable.

We'll use these a bit later.*/


class Example_01 {
    public static void main(String[] args){
        Engine myEngine = new Engine(17000);
        AirplaneType myAirplaneType = new AirplaneType("Boeing");
        Airplane myAirplane = new Airplane(myEngine, myAirplaneType, 10000, 7500, 169);
        System.out.println("I'm currently flying a " + myAirplane.airplaneType.manufacturer + " airplane with " + myAirplane.engine.horsePower 
        + " horsepower, a current fuel level of " + myAirplane.currentFuelLevel + " gallons, out of a total capacity of " 
        + myAirplane.fuelCapacity + " gallons, carring " + myAirplane.numOfPassengers + " passengers.");
    }
}

class Engine {
    double horsePower;
    public Engine(double horsePower){
        this.horsePower = horsePower;
    }
}

class AirplaneType {
    String manufacturer;
    public AirplaneType(String manufacturer){
        this.manufacturer = manufacturer;
    }
}

class Airplane {
    double fuelCapacity;
    double currentFuelLevel;
    int numOfPassengers;
    Engine engine;
    AirplaneType airplaneType ;

    public Airplane(Engine engine, AirplaneType airplaneType, double fuelCapacity, double currentFuelLevel, int numOfPassengers){
        this.engine = engine;
        this.airplaneType = airplaneType;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.numOfPassengers = numOfPassengers;
    }
}    

