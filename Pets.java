public class Pets {
    private String name;
    private int age;
    private String animalType;
    private String breed;

    public Pets(String name, int age, String animalType, String breed){
        this.name = name;
        this.age = age;
        this.animalType = animalType;
        this.breed = breed;
    }



/*Accessors */
public String getName() { //returns the name of the pet
    return this.name;
}

public int getAge() { //returns the age of the pet
    return this.age;
}

public String animalType(){ //returns the type of pet, cat, dog, bird, etc
    return this.animalType;
}

public String breed(){ //returns the breed of the pet
    return this.breed;
}

/*methods */
public void grab(String item){

}


public String toString() {
    return this.name + " is a "  +  this.age + " year old " + this.breed + " " + this.animalType;
}



public static void main(String[]args){
    Pets Tangbao = new Pets("Tangbao", 1, "Cat", "Domestic Short Hair");
    System.out.println(Tangbao);
}

}



