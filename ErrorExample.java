// write me email and phone number
// write p for 5 error

public class ErrorExample {
    public static void main(String[] args) {
        // Syntax Error
        int x = 10  // Missing semicolon at the end

        // Runtime Error
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[5]);  // Accessing an invalid index

        // Logical Error
        int y = 5;
        int z = 0;
        int result = y / z;  // Division by zero

        // Type Error
        String name = "John";
        int age = name;  // Incompatible types: String cannot be converted to int

        // Assertion Error
        int number = -5;
        assert number >= 0 : "Number cannot be negative";

        // This line will not be reached due to the previous assertion error
        System.out.println("Program completed successfully.");
    }
}
