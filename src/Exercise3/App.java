package Exercise3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // tell user what program does
        System.out.println("\nThis program gets input for three triangles from "
                + "the user. It then creates three Triangle objects and " 
                + "displays the description of each.\n");

        Scanner input = new Scanner(System.in);
        Triangle triangle1 = getTriangle(input);
        Triangle triangle2 = getTriangle(input);
        Triangle triangle3 = getTriangle(input);
        input.close();

        System.out.println("\n" + triangle1 + "\n\n" + triangle2 + "\n\n" + triangle3);
        System.out.println("\nGoodbye...");
    }

    private static Triangle getTriangle(Scanner input){
        // get required inputs
        System.out.println("Enter the color of a triangle (e.g. red):");
        String color = input.nextLine().trim();
        color = color.trim().length() == 0 ? "white" : color;

        System.out.println("Is the triangle filled (y or n)");
        char filled = input.next().charAt(0);
        boolean isFilled = (filled == 'y' || filled == 'Y') ? true : false;

        System.out.println("Enter the lengths of the three sides of the triangle:");
        System.out.print("Side 1: ");
        Double side1 = input.nextDouble();
        System.out.print("Side 2: ");
        Double side2 = input.nextDouble();
        System.out.print("Side 3: ");
        Double side3 = input.nextDouble();
        input.nextLine();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(isFilled);

        return triangle;
    }
}
