import java.util.*;
/* 
For this exercise please create two classes. The first class is the controller and it will contain 

the main() method. The second class is a POJO. Just a simple object type class that defines an object. 

In this POJO, demonstrate at least three overloaded constructors. In the main() method, create at 

least 3 objects of your POJO class, each using a different constructor.
*/

class Controller{
    public static void main(String[] args) {
        Country country1 = new Country();
        System.out.println("I live in " + country1.countryName + " which is located in " 
        + country1.countryCont + " with a population of " + country1.countyPopulation + " people.");
        
        Country country2 = new Country("Serbia", 13000000);
        System.out.println("I live in " + country2.countryName + " with a population of " + country2.countyPopulation + " people.");

        Country country3 = new Country("the USA", "North America", 350000000);
        System.out.println("I live in " + country3.countryName + " which is located in " 
        + country3.countryCont + " with a population of " + country3.countyPopulation + " people.");

        System.out.println(country1.toString());
        System.out.println(country2.toString());
        System.out.println(country3.toString());

    }
}
class Country{
    String countryName;
    String countryCont;
    int countyPopulation;

    public Country(){
        countryName = "Austria";
        countryCont = "Europe";
        countyPopulation = 8000000;
    }
    public Country(String countryName, int countryPopulation){
        this.countryName = countryName;
        this.countyPopulation = countryPopulation;
    }
    public Country(String countryName, String countryCont, int countryPopulation){
        this.countryName = countryName;
        this.countryCont = countryCont;
        this.countyPopulation = countryPopulation;
    }
    @Override
    public String toString() {
        return "Country [countryCont=" + countryCont + ", countryName=" + countryName + ", countyPopulation="
                + countyPopulation + "]";
    }
    
}