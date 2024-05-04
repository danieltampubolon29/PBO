package pertemuan2;

abstract class Animal {
    private String animal;
    private String name;
    private String gender;

    // Constructor
    Animal(String animal, String name, String gender) {
        this.animal = animal;
        this.name = name;
        this.gender = gender;
    }

    // Getter and setter
    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Display common animal data
    void display() {
        System.out.println("Type of Animal \t: " + animal + "\nAnimal name \t: " + name + "\nAnimal gender \t: " + gender);
        System.out.println(getWeightInfo());
        getVoiceInfo();
    }

    // Abstract methods to be implemented by subclasses
    abstract String getWeightInfo();
    abstract void getVoiceInfo();
}

class Detail extends Animal {
    private int weight;
    private String voice;

    Detail(String animal, String name, String gender, int weight, String voice) {
        super(animal, name, gender);
        this.weight = weight;
        this.voice = voice;
    }
    // Getter and Setter
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    String getWeightInfo() {
        return ("Animal weight \t: " + weight + " kg");
    }

    @Override
    void getVoiceInfo() {
        System.out.println( "Animal voice \t: " + voice + "\n");
    }
}


public class Main {
public static void main(String[] args) {    
    // make object animal
    Detail animal1 = new Detail("Dog", "Kyno", "male", 6, "guk guk");
    Detail animal2 = new Detail("Cat", "Katy", "female", 2, "meow");
    // animal 1
    animal1.display();

    // animal 2
    animal2.display();
    // change value of set
    animal2.setName("Cassie");
    animal2.setWeight(3);
    animal2.display();
}
}
