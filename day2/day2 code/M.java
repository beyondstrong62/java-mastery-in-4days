public class M {
    public static void main(String[] args) {
        // Creating an object of the Calculator class
        Calculator calc = new Calculator();

        // Calling the overloaded methods
        int sum1 = calc.add(5, 10);
        int sum2 = calc.add(5, 10, 15);
        double sum3 = calc.add(5.5, 10.5);

        // Printing the results
        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of three integers: " + sum2);
        System.out.println("Sum of two doubles: " + sum3);
    }
}