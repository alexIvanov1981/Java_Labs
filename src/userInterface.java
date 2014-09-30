/**
 * @author: Aleksander Ivanov
 */
import java.util.*;

import figure.Figure;


public class userInterface {
    public static void showMenu(){
        System.out.println();
        System.out.println("Select figure");
        String ar2[] = {"1. Circle","2. Rectangle", "3. Square", "4. Exit"};
        for(int i = 0; i <= ar2.length  - 1; i++) {
            System.out.println(ar2[i] + "  ");
        }
    }

     public static int waitForInput(){
        int input = 0;
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) { // true if int value entered
           input = sc.nextInt(); // reads int value from thread and saves to input parameter
        }
        return input;
     }

    public static void main(String[] args) {

        List<Figure> results = new ArrayList<Figure>();
        int input = 0;

        while (input < 4) {

         if (input == 1) {
            System.out.println("Circle is selected");
            System.out.println("Set radius of the Circle");
            System.out.print("radius:");

            int radius = waitForInput();

            Figure circle = new Figure(radius, true);
            System.out.println("Circle Circumference is: "+ circle.getCircumference());

            results.add(circle);
         }

         if (input == 2) {
            System.out.println("Rectangle is selected");
            System.out.println("Set width and height of the Rectangle");
            System.out.print("width:");
            int width = waitForInput();

            System.out.print("height:");
            int height = waitForInput();

            Figure rectangle = new Figure(width, height);
            int perimeter = rectangle.getPerimeter();
            System.out.println("Rectangle perimeter is:"+perimeter);

            results.add(rectangle);
         }

         if (input == 3) {
            System.out.println("Square is selected");
            System.out.println("Set side of the Square");
            System.out.print("side:");
            int side = waitForInput();

            Figure square = new Figure(side);
            int perimeter = square.getPerimeter();
            System.out.println("Square perimeter is: "+perimeter);

            results.add(square);
         }
         showMenu();
         input = waitForInput();
       }
    for (int i=0; i<=results.size()-1; i++)
    {
        Figure figure = results.get(i);
        System.out.println("Figure name: " + figure.getName());
        System.out.println("Figure size: "+ figure.getPerimeter());
    }

    }
}


