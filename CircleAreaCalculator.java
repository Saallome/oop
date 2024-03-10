import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the radius of the circle
        System.out.print("Enter the radius of the circle: ");

        // Read the radius from the user
        double radius = scanner.nextDouble();

        // Close the Scanner to prevent resource leak
        scanner.close();

        // Calculate the area of the circle using the formula: area = Math.PI * radius * radius
        double area = Math.PI * radius * radius;

        // Display the calculated area
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}