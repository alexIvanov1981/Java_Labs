/**
 * @author: Aleksander Ivanov
 */
package figure;

public class Figure {
    int width;
    int height;
    int radius;
    String name;

    public Figure(String n, int w, int h) {  //Rectangle
        width = w;
        height = h;
        name = n;
    }

    public Figure(String n, int side){ //Square
        width = height = side;
        name = n;
    }

    public Figure(String n, int r, boolean circle){ //Circle
        radius = r;
        name = n;
    }

    public int getPerimeter(){
      return 2*(width+height);
    }

    public int getCircumference(){
        return (int) (2*radius*(Math.PI));
    }

    public String getName(){
        return name;
    }
}
