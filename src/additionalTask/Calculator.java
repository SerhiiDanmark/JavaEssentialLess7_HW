package additionalTask;

public class Calculator {

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {

        if (b == 0) {
            System.out.println("На 0 ділити не можна!!!");
        }
        return a / b;
    }
}
