package tugas3;

public class Shape {
    public void draw() {}
    public void erase() {}
    
    public void newMethod() {
        System.out.println("New method in Shape");
    }
 
    public int wheels() {
        return 0; 
    }
    
    public void ride() {
        System.out.println("Shape has " + wheels() + " wheels");
    }
}
