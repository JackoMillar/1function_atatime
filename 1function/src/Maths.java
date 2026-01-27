
public class Maths {
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static int power(int a, int n) {
        return (int) Math.pow(a, n);
    }

    public static double nthRoot(double x, double n) {
        return Math.pow(x, 1.0 / n);
    }

    public static int remainder(int a, int b){
        int r = a % b;
        if (r < 0) r += Math.abs(b);
        return r;
    }
}
