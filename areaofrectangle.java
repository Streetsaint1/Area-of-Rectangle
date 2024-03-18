import java.util.Scanner;

public class AreaRectangle {
    // Method to obtain dimensions and compute the area of a rectangle
    public static double computeArea() {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Obtain the length of the rectangle from the user
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        // Obtain the width of the rectangle from the user
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Do not close the scanner here

        // Calculate and return the area of the rectangle
        return length * width;
    }

    public static void main(String[] args) {
        // Call the computeArea method to get the area of the rectangle
        double area = computeArea();

        // Display the result
        System.out.println("Area of the rectangle: " + area);
    }
}
