public class Calculator1 {
    // Method to add two integers
    public int add1(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add1(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add1(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Creating an object of the Calculator1 class
        Calculator1 calc = new Calculator1();

        // Calling the overloaded methods
        int sum1 = calc.add1(5, 10);          // Calls add1(int, int)
        int sum2 = calc.add1(5, 10, 15);      // Calls add1(int, int, int)
        double sum3 = calc.add1(5.5, 10.5);   // Calls add1(double, double)

        // Printing the results
        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of three integers: " + sum2);
        System.out.println("Sum of two doubles: " + sum3);
    }
}
