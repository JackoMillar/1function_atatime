import javax.naming.ldap.Control;

public class Main {
    public static void main(String[] args) {
        System.out.println("addition: " + Maths.addition(10, 10));

        System.out.println("subtraction: " + Maths.subtraction(10, 5));

        System.out.println("multiplication: " + Maths.multiplication(2,3));

        System.out.println("division: " + Maths.division(4,2));

        System.out.println("power: " + Maths.power(2, 4));

        System.out.println("sqrt: " + Maths.nthRoot(4, 2));

        System.out.println("remainder: " + Maths.remainder(-5, 2)); // Remainder should still be positive 1

        System.out.println("ifstatement: " + ControlFlow.ifstatement(5, 6));

        System.out.println("Count to five:");
        ControlFlow.loop(5);

        System.out.println("Add 5 numbers together: ");
        ControlFlow.foreach(new int[]{1, 2, 3, 4, 5});

        System.out.println("You should follow me on: " + ControlFlow.switchex(1));

        ControlFlow.trycatchexample(10, 0);

        System.out.println("The final countdown: ");
        ControlFlow.WhileLoop(5);

        System.out.println("Count up everybody: ");
        ControlFlow.breakEx(10);
    }
}
