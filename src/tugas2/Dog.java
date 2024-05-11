package tugas2;

public class Dog extends Animal {
    private int weight;

    Dog(String name, String gender, int weight) {
        super(name, gender);
        this.weight = weight;
    }

    @Override
    public void detail() {
        System.out.println("Dog weight \t: " + this.weight + "\n" + getName() + " Say Guk Guk!");
    }
}
