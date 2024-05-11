package tugas1;

public class Cat extends Animal {
    private int weight;

    Cat(String name, String gender, int weight) {
        super(name, gender);
        this.weight = weight;
    }

    @Override
    public void detail() {
        System.out.println("Cat weight \t: " + this.weight + "\n" + getName() + " Say Meow!");
    }
}