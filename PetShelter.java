import java.util.Hashtable; //imports Hashtable so that we can store a list of pets (key: name, value: type of animal) in the pet shelter

public class PetShelter extends Pets {
    private Hashtable<String,String> petsAvailable; //Hashtable to store pets in the shelter


public PetShelter(String name, int age, String animalType, String breed){
    super(name, age, animalType, breed);
    this.petsAvailable = new Hashtable<String,String>();
    System.out.println("Welcome to our Pet Shelter!");

}

public void printRegistry(){ //prints out the entire registry of pets available in the shelter
    System.out.println(petsAvailable);
}

public static void main(String[]args){ //main for testing
    Pets Tangbao = new Pets("Tangbao", 1, "Cat", "Domestic Short Hair");
    System.out.println(Tangbao);

}


}