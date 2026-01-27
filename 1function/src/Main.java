
public class Main {
    public static void main(String[] args) {
        System.out.println("addition: " + Maths.addition(10, 10));

        System.out.println("subtraction: " + Maths.subtraction(10, 5));

        System.out.println("multiplication: " + Maths.multiplication(2,3));

        System.out.println("division: " + Maths.division(4,2));

        System.out.println("power: " + Maths.power(2, 4));

        System.out.println("sqrt: " + Maths.nthRoot(4, 2));

        System.out.println("remainder: " + Maths.remainder(-5, 2)); // Remainder should still be positive 1
    }
}
