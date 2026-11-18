// Base class
class shape {
    protected String color;

    public shape(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing a generic " + color + " shape.");
    }

    public void erase() {
        System.out.println("Erasing a generic " + color + " shape.");
    }
}

// Subclass 1: Circle
class circle extends shape {
    private double radius;

    public circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " Circle with radius " + radius);
    }

    @Override
    public void erase() {
        System.out.println("Erasing the Circle.");
    }
}

// Subclass 2: Triangle
class triangle extends shape {
    private double base;
    private double height;

    public triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " Triangle with base " + base + " and height " + height);
    }

    @Override
    public void erase() {
        System.out.println("Erasing the Triangle.");
    }
}

// Subclass 3: Square
class Square extends shape {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " Square with side " + side);
    }

    @Override
    public void erase() {
        System.out.println("Erasing the Square.");
    }
}

// Main class to demonstrate polymorphism
public class PolymorphismDemo {
    public static void main(String[] args) {
        // Parent class references pointing to child class objects (Runtime Polymorphism)
        shape[] shapes = new shape[3];
        shapes[0] = new circle("Red", 5.0);
        shapes[1] = new triangle("Blue", 4.0, 6.0);
        shapes[2] = new Square("Green", 3.5);

        // Dynamically calling the overridden methods
        for (shape s : shapes) {
            s.draw();
            s.erase();
            System.out.println("---------------------------");
        }
    }
}
