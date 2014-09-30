/**
 * @author: Aleksander Ivanov
 */
import java.util.*;

import figure.Figure;

public class userInterface {
    public static void showMenu(){
        System.out.println();
        System.out.println("Select figure");
        String menu[] = {"1. Circle","2. Rectangle", "3. Square", "4. Exit"};
        for(int i = 0; i < menu.length; i++) {
            System.out.println(menu[i] + "  ");
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
            String name = "Circle";
            System.out.println("Circle is selected");
            System.out.println("Set radius of the Circle");
            System.out.print("radius:");


            int radius = waitForInput();

            Figure circle = new Figure(name, radius, true);
            System.out.println("Circle Circumference is: "+ circle.getCircumference());

            results.add(circle);
         }

         if (input == 2) {
            String name = "Rectangle";
            System.out.println("Rectangle is selected");
            System.out.println("Set width and height of the Rectangle");
            System.out.print("width:");
            int width = waitForInput();

            System.out.print("height:");
            int height = waitForInput();

            Figure rectangle = new Figure(name, width, height);
            int perimeter = rectangle.getPerimeter();
            System.out.println("Rectangle perimeter is:"+perimeter);

            results.add(rectangle);
         }

         if (input == 3) {
            String name = "Square";
            System.out.println("Square is selected");
            System.out.println("Set side of the Square");
            System.out.print("side:");
            int side = waitForInput();

            Figure square = new Figure(name, side);
            int perimeter = square.getPerimeter();
            System.out.println("Square perimeter is: "+perimeter);

            results.add(square);
         }
         showMenu();
         input = waitForInput();
       }
    for (int i=0; i<results.size(); i++)
    {
        Figure figure = results.get(i);
        System.out.println("Figure name: " + figure.getName());
        if (figure.getName()== "Circle")
        {
            System.out.println("Circle Circumference: "+ figure.getCircumference());
        }
        else
        {
            System.out.println("Figure Perimeter: "+ figure.getPerimeter());
        }
    }

    }
}


