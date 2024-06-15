package tugas3;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }
    
    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
    
    @Override
    public void newMethod() {
        System.out.println("New method in Circle");
    }

    public int wheels() {
        return 1; 
    }
    
    public void ride() {
        System.out.println("Circle (as a unicycle) has " + wheels() + " wheel");
    }
} 
