package tugas3;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }
    
    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }
    
    @Override
    public void newMethod() {
        System.out.println("New method in Triangle");
    }

    @Override
    public int wheels() {
        return 3; 
    }
    
    @Override
    public void ride() {
        System.out.println("Triangle (as a tricycle) has " + wheels() + " wheels");
    }
}
