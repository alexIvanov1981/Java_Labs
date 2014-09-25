/**
 * @author: Aleksander Ivanov
 */
import java.util.Scanner;
import figure.Figure;


public class userInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select figure");
        String ar2[] = {"1. Circle","2. Rectangle", "3. Square", "4. Ellipse", "5. Exit"};
        for(int i = 0; i <= ar2.length  - 1; i++) {
            System.out.println(ar2[i] + "  ");
        }

        int input = 0;
        int width = 0;
        int height = 0;
        int side = 0;
        int radius = 0;

        if(sc.hasNextInt()) { // true if int value entered
            input = sc.nextInt(); // reads int value from thread and saves to input parameter
        }

        if (input == 1) {
            System.out.println("Circle is selected");
            System.out.println("Set radius of the Circle");
            System.out.print("radius:");
            if(sc.hasNextInt()) { // true if int value entered
                radius = sc.nextInt(); // reads int value from thread and saves to input parameter
            }

            Figure circle = new Figure(radius, true);
            System.out.println("Circle Circumference is: "+ circle.getCircumference());
         }

        if (input == 2) {
            System.out.println("Rectangle is selected");
            System.out.println("Set width and height of the Rectangle");
            System.out.print("width:");
            if(sc.hasNextInt()) { // true if int value entered
                width = sc.nextInt(); // reads int value from thread and saves to input parameter
            }
            System.out.print("height:");
            if(sc.hasNextInt()) { // true if int value entered
                height = sc.nextInt(); // reads int value from thread and saves to input parameter
            }

            Figure rectangle = new Figure(width, height);
            int perimeter = rectangle.getPerimeter();
            System.out.println("Rectangle perimeter is:"+perimeter);
        }

        if (input == 3) {
            System.out.println("Square is selected");
            System.out.println("Set side of the Square");
            System.out.print("side:");
            if(sc.hasNextInt()) { // true if int value entered
                side = sc.nextInt(); // reads int value from thread and saves to input parameter
            }

            Figure square = new Figure(side);
            int perimeter = square.getPerimeter();
            System.out.println("Square perimeter is: "+perimeter);
        }

    }
}


