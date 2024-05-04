package tugas1;
class Animal{
    private String animal;
    private String name;
    private String gender;
    // Contructor
    Animal(String animal, String name, String gender){
        this.animal = animal;
        this.name = name;
        this.gender = gender;
    }
    // Getter and Setter
    public String getAnimal(){
        return animal;
    }
    public void setAnimal(String animal){
        this.animal = animal;
    }
    public String getName(){
        return animal;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public void display(){
        System.out.println("Type of Animal \t: " + animal + "\nAnimal name : " + name + "\nAnimal gender \t: " + gender + "\n");
    }

}
public class Main {
public static void main(String[] args) {
    // membuat object
    Animal animal1 = new Animal("Dog", "Kyno", "Male");
    Animal animal2 = new Animal("Cat", "Cassie", "Female");
    // animal 1
    animal1.display();
    // change the value of setter
    animal1.setName("Blackie");
    animal1.display();
    // animal 2
    animal2.display();
    // change the value of setter
    animal2.setAnimal("Bird");
    animal2.display();
}
}
