
class Complex {

    double real;
    double imaginary;
    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    Complex add(Complex c) {
        return new Complex(
                this.real + c.real,
                this.imaginary + c.imaginary
        );
    }
    Complex multiply(Complex c) {
        double r = (this.real * c.real) -
                (this.imaginary * c.imaginary);

        double i = (this.real * c.imaginary) +
                (this.imaginary * c.real);

        return new Complex(r, i);
    }
    void compareMagnitude(Complex c) {
        double m1 = Math.sqrt(
                real * real + imaginary * imaginary
        );

        double m2 = Math.sqrt(
                c.real * c.real + c.imaginary * c.imaginary
        );

        if (m1 > m2) {
            System.out.println("First complex number is greater.");
        } else if (m1 < m2) {
            System.out.println("Second complex number is greater.");
        } else {
            System.out.println("Both have equal magnitude.");
        }
    }
    Complex copy() {
        return new Complex(real, imaginary);
    }
    void display() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + (-imaginary) + "i");
        }
    }
    public static void main(String[] args) {

        Complex c1 = new Complex(4, 5);
        Complex c2 = new Complex(2, 3);

        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        Complex sum = c1.add(c2);
        System.out.print("Addition: ");
        sum.display();

        Complex product = c1.multiply(c2);
        System.out.print("Multiplication: ");
        product.display();

        System.out.println("Magnitude Comparison:");
        c1.compareMagnitude(c2);

        Complex c3 = c1.copy();

        System.out.print("Copied Object: ");
        c3.display();

        c1.real = 10;
        c1.imaginary = 20;

        System.out.print("Modified Original Object: ");
        c1.display();

        System.out.print("Copied Object After Modification: ");
        c3.display();
    }
}

