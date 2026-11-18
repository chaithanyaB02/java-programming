// Define the Resizable interface
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

// Create the Rectangle class implementing Resizable
class rectangle implements Resizable {
    private int width;
    private int height;

    // Constructor to initialize initial dimensions
    public rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Implement resizeWidth method
    @Override
    public void resizeWidth(int width) {
        this.width = width;
        System.out.println("Width resized to: " + this.width);
    }

    // Implement resizeHeight method
    @Override
    public void resizeHeight(int height) {
        this.height = height;
        System.out.println("Height resized to: " + this.height);
    }

    // Method to display current dimensions
    public void displayDimensions() {
        System.out.println("Current Rectangle Dimensions -> Width: " + width + ", Height: " + height);
    }
}

// Main class to test the program
public class resizemain {
    public static void main(String[] args) {
        // Create a Rectangle object with initial width 10 and height 20
        rectangle rect = new rectangle(10, 20);
        rect.displayDimensions();

        // Resize the width and height
        rect.resizeWidth(30);
        rect.resizeHeight(40);

        // Display updated dimensions
        rect.displayDimensions();
    }
}