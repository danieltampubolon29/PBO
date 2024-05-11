package tugas2;

public abstract class Animal{
    private String gender;
    private String name;
    // Contructor
    Animal(String name, String gender){
        this.gender = gender;
        this.name = name;
    }
    // Getter and Setter
    public String getGender(){return gender;}
    public void setGender(String gender){this.gender = gender;}
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public void display(){
        System.out.println("Animal name \t: " + name + "\nAnimal gender \t: " + gender);
        detail();
    }
    abstract void detail();
}