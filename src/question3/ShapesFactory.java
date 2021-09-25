package question3;
import java.util.ArrayList;
import java.util.List;
public class ShapesFactory 
{
	ArrayList<Shape> slist = new ArrayList<>();
	public ShapesFactory()  {  }
	public void addShape(Shape s)
    {
             Circle c = new Circle();
    }
	public List<Circle> getCircles()
    {
          //Should return list of Circle Objects from slist property.
    }
	public List<Rectangle> geRectangles()
    {
          //Should return list of  Rectangle Objects from slist property.
    }
    public boolean  deleteShape(Shape s)
    {
              //If given Shape I,e. Circle/Rectangle object if should delete and return true
              //If not found should return false
    }
}

