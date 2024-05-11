package tugas1;

public class Main {
    public static void main(String[] args) {
        // membuat object
        Dog dog = new Dog("cassie", "female", 7);
        Cat cat = new Cat("kyno", "male", 3);
        dog.display();
        cat.display();
    }
}