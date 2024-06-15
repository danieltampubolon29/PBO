package tugas3;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
    
    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
    
    @Override
    public void newMethod() {
        System.out.println("New method in Square");
    }

    @Override
    public int wheels() {
        return 4;
    }
    
    @Override
    public void ride() {
        System.out.println("Square (as a quad bike) has " + wheels() + " wheels");
    }
}
