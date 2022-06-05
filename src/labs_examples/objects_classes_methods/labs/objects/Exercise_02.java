/*
For each POJO you created to complete the previous Airplane exercise, please change all the instance variables in each

class to "private". Then, create getter and setter methods (for each instance variable) in each class you created for

the airplane exercise. Also, create a toString() method in each POJO. Once complete, demonstrate getting and setting

those variables from the class in which you composed the Airplane object, as well as invoking their toString() methods.
*/

class Example_01 {
    public static void main(String[] args){
        Engine myEngine = new Engine(17000);
        AirplaneType myAirplaneType = new AirplaneType("Boeing");
        Airplane myAirplane = new Airplane(myEngine, myAirplaneType, 10000, 7500, 179);
        //System.out.println("I'm currently flying a " + myAirplane.airplaneType.manufacturer + " airplane with " + myAirplane.engine.horsePower 
        //+ " horsepower, a current fuel level of " + myAirplane.currentFuelLevel + " gallons, out of a total capacity of " 
        //+ myAirplane.fuelCapacity + " gallons, carring " + myAirplane.numOfPassengers + " passengers.");

        System.out.println(myAirplane.toString());
    }
}

class Engine {
    double horsePower;
    public Engine(double horsePower){
        this.horsePower = horsePower;
    }
    @Override
    public String toString() {
        return "Engine [horsePower=" + horsePower + "]";
    }
    
}

class AirplaneType {
    String manufacturer;
    public AirplaneType(String manufacturer){
        this.manufacturer = manufacturer;
    }
    @Override
    public String toString() {
        return "AirplaneType [manufacturer=" + manufacturer + "]";
    }
    
}

class Airplane {
    private double fuelCapacity;
    private double currentFuelLevel;
    private int numOfPassengers;
    Engine engine;
    AirplaneType airplaneType ;

    public Airplane(Engine engine, AirplaneType airplaneType, double fuelCapacity, double currentFuelLevel, int numOfPassengers){
        this.engine = engine;
        this.airplaneType = airplaneType;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.numOfPassengers = numOfPassengers;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    @Override
    public String toString() {
        return "Airplane [airplaneType=" + airplaneType + ", currentFuelLevel=" + currentFuelLevel + ", engine="
                + engine + ", fuelCapacity=" + fuelCapacity + ", numOfPassengers=" + numOfPassengers + "]";
    }

    
}    

