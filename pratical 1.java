class Complex {
    double real, imaginary;

    Complex() {
        real = 0;
        imaginary = 0;
    }

    Complex(double r, double i) {
        real = r;
        imaginary = i;
    }

    Complex add(Complex c) {
        return new Complex(real + c.real, imaginary + c.imaginary);
    }

    Complex subtract(Complex c) {
        return new Complex(real - c.real, imaginary - c.imaginary);
    }

    Complex multiply(Complex c) {
        double r = real * c.real - imaginary * c.imaginary;
        double i = real * c.imaginary + imaginary * c.real;
        return new Complex(r, i);
    }

    Complex divide(Complex c) {
        double denominator = c.real * c.real + c.imaginary * c.imaginary;
        double r = (real * c.real + imaginary * c.imaginary) / denominator;
        double i = (imaginary * c.real - real * c.imaginary) / denominator;
        return new Complex(r, i);
    }

    void display() {
        if (imaginary >= 0)
            System.out.println(real + " + " + imaginary + "i");
        else
            System.out.println(real + " - " + (-imaginary) + "i");
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(1, 7);
        Complex result;

        System.out.print("Addition: ");
        result = c1.add(c2);
        result.display();

        System.out.print("Subtraction: ");
        result = c1.subtract(c2);
        result.display();

        System.out.print("Multiplication: ");
        result = c1.multiply(c2);
        result.display();

        System.out.print("Division: ");
        result = c1.divide(c2);
        result.display();
    }
}
