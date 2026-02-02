public class ControlFlow {

    public static boolean ifstatement(int a, int b) {
        if (a == b)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static void loop(int n){
        for (int i = 1; i <= n; i++) {
            System.out.print(" " +i);
        }
        System.out.println("");
    }

    public static void foreach(int[] arr){
        int sum = 0;
        for (int x: arr) {
            sum += x;
        }
        System.out.print(sum + "\n");
    }

    public static String switchex(int x) {
        switch (x)
        {
            case 1:
                return "instagram";

            case 2:
                return "follow me!";

            case 3:
                return "tiktok";

        }
        return "";
    }

    public static void trycatchexample(int x, int y) {
        try {
            int result = x / y;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        }
    }

    public static void WhileLoop(int x){
        while (x > 0) {
            System.out.print(x);
            x--;
        }
        System.out.println();
    }

    public static void breakEx(int x) {
        for (int i = 0; i <= x; i++) {
            if (i == (x/2)) break;
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
