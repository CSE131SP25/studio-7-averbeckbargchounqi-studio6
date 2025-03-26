package studio7;

public class Complex {

    private double real;
    private double imaginary;

    public Complex(double initReal, double initImaginary){
        real = initReal;
        imaginary = initImaginary;
    }
    
    public String add(double real2, double imaginary2){
        return (real+real2) + " + " + (imaginary+imaginary2) + "i";
    }

    public String multiply(double real2, double imaginary2){
        return ((real*real2 ) - (imaginary*imaginary2)) + " + " + ((real*imaginary2) + (real2*imaginary)) + "i";
    }

    public static void main(String[] args){
        Complex complex = new Complex(3,5);

        System.out.println(complex.add(2,2));
        System.out.println(complex.multiply(2, 2));
    }
}
