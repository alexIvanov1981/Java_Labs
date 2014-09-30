/**
 * @author: Aleksander Ivanov
 */
package figure;

public class Figure {
    int width;
    int height;
    int radius;

    public Figure(int w, int h) {  //Rectangle
        width = w;
        height = h;
    }
    public Figure(int side){ //Square
        width = height = side;
    }

    public Figure(int r, boolean circle){ //Circle
        radius = r;
    }

    public int getPerimeter(){
      return 2*(width+height);
    }

    public int getCircumference(){
        return (int) (2*radius*(Math.PI));
    }

    public String getName(){
        return (String) ();
    }
}
