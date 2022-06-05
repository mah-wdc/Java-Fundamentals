/*
Building off the previous classes we created in Exercise_01

1) Create a toString() method in each POJO. You can do this by holding down the Control key and hitting
enter at the same time. If you see a small menu choose toString() and generate from there. Otherwise you can
select "Code" from the top most navbar of IntelliJ and then select "Generate" and choose toString();

2) In the main() method you created in the controller classes demonstrate creating a number of Objects using a variety
of constructors that you created in the previous exercise.

3) After creating these objects, print the status of these objects. For example:
System.out.println(cardObj.toString())
 */

class Example_01 {
    public static void main(String[] args){
        Engine myEngine = new Engine(17000);
        AirplaneType myAirplaneType = new AirplaneType("Boeing");
        Airplane myAirplane = new Airplane(myEngine, myAirplaneType, 10000, 7500, 169);
        System.out.println("I'm currently flying a " + myAirplane.airplaneType.manufacturer + " airplane with " + myAirplane.engine.horsePower 
        + " horsepower, a current fuel level of " + myAirplane.currentFuelLevel + " gallons, out of a total capacity of " 
        + myAirplane.fuelCapacity + " gallons, carring " + myAirplane.numOfPassengers + " passengers.");

        System.out.println(myAirplane.toString());
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

    @Override
    public String toString() {
        return "Airplane [airplaneType=" + airplaneType + ", currentFuelLevel=" + currentFuelLevel + ", engine="
                + engine + ", fuelCapacity=" + fuelCapacity + ", numOfPassengers=" + numOfPassengers + "]";
    }
    
}   
