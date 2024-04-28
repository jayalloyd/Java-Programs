class Complex {
    double real;
    double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex other) {
        double realSum = this.real + other.real;
        double imagSum = this.imag + other.imag;
        return new Complex(realSum, imagSum);
    }

    public void display() {
        System.out.println("Sum = " + this.real + " + " + this.imag + "i");
    }
}

public class ComplexNumberAdd {
    public static void main(String[] args) {
        Complex num1 = new Complex(4.5, 2.0);
        Complex num2 = new Complex(3.0, 5.5);

        Complex sum = num1.add(num2);
        sum.display();
    }
}
