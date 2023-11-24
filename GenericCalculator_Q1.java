public class GenericCalculator_Q1 {
    // Add two integers
    public static int Add(int a, int b) {
        return a + b;
    }

    // Add two doubles
    public static double Add(double a, double b) {
        return a + b;
    }

    // Add two strings by converting them to doubles
    public static double Add(String a, String b) {
        try {
            double num1 = Double.parseDouble(a);
            double num2 = Double.parseDouble(b);
            return num1 + num2;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
            return 0.0;
        }
    }

    // Subtract two integers
    public static int Subtract(int a, int b) {
        return a - b;
    }

    // Subtract two doubles
    public static double Subtract(double a, double b) {
        return a - b;
    }

    // Multiply two integers
    public static int Multiply(int a, int b) {
        return a * b;
    }

    // Multiply two doubles
    public static double Multiply(double a, double b) {
        return a * b;
    }

    // Divide two integers (return double to handle potential decimal results)
    public static double Divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return Double.NaN; // Return NaN for an undefined result
        }
        return (double) a / b;
    }

    // Divide two doubles
    public static double Divide(double a, double b) {
        if (b == 0.0) {
            System.out.println("Division by zero is not allowed.");
            return Double.NaN; // Return NaN for an undefined result
        }
        return a / b;
    }

    public static void main(String[] args) {
        // Test the Add methods
        System.out.println("Integer Addition: " + Add(3, 8));
        System.out.println("Double Addition: " + Add(1.9, 3.4));
        System.out.println("String Addition: " + Add("3", "8"));
        System.out.println();

        // Test the Subtract methods
        System.out.println("Integer Subtraction: " + Subtract(10, 4));
        System.out.println("Double Subtraction: " + Subtract(5.5, 2.2));
        System.out.println();

        // Test the Multiply methods
        System.out.println("Integer Multiplication: " + Multiply(4, 7));
        System.out.println("Double Multiplication: " + Multiply(2.5, 3.0));
        System.out.println();

        // Test the Divide methods
        System.out.println("Integer Division: " + Divide(10, 2));
        System.out.println("Double Division: " + Divide(7.5, 3.0));
        System.out.println("Division by Zero: " + Divide(5.0, 0.0));
        System.out.println();
    }
}
