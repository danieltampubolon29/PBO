package tugas3;

public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle.draw()");
    }
    
    @Override
    public void erase() {
        System.out.println("Rectangle.erase()");
    }
    
    @Override
    public void newMethod() {
        System.out.println("New method in Rectangle");
    }

    @Override
    public int wheels() {
        return 6;
    }
    
    @Override
    public void ride() {
        System.out.println("Rectangle (as a truck) has " + wheels() + " wheels");
    }
}
