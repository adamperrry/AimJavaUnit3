package Exercise1;

public class App {
    public static void main(String[] args) {
        // tell user what program does
        System.out.println("\nThis program creates two rectangle objects and "
                + "displays their width, height, area and perimeter.\n");

        // create two rectangle objects
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 5);

        // put them in an array to loop over and output
        Rectangle[] rectangles = { rectangle1, rectangle2 };

        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Rectangle " + (i + 1) + ":");
            System.out.format("height = %.2f%n", rectangles[i].getHeight());
            System.out.format("width = %.2f%n", rectangles[i].getWidth());
            System.out.format("area = %.2f%n", rectangles[i].getArea());
            System.out.format("perimeter = %.2f%n%n", rectangles[i].getPerimeter());
        }

        System.out.println("Goodbye...");
    }

}
