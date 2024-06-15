package tugas3;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(), new Square(), new Triangle(), new Rectangle() };
        
        for (Shape shape : shapes) {
            shape.draw();
            shape.erase();
            shape.newMethod();
            shape.ride(); 
            System.out.println();
        }
    }
}
