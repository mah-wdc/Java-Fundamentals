/* 
Please demonstrate Object association by creating at least two POJOs and a Controller class. The Controller

class will contain the main() method. In the main() create an object of each POJO you just created and associate

the two together. (This is easier than it sounds. Refer to the Object Association documentation if you're not sure.)

*/

class Exercise_03{
public static void main(String[] args) {
    Country country1 = new Country("Austria");
    Person person1 = new Person("Dominik");

    System.out.println(person1.name + " is from " + country1.country);
}
}

class Country{
    String country;
    public Country(String country){
        this.country = country;
    }
}

class Person{
    String name;
    public Person(String name){
        this.name = name;
    }
}