package lab10;
import java.util.ArrayList;
import java.util.List;

public class ShapeContainer {
    private List<Shape> shapes;

    public ShapeContainer(){
        this.shapes = new ArrayList<>();
    }

    public void getArea(){
        for(Shape s : shapes){
            System.out.printf("Pole figury %s", s.name);
            System.out.printf(" wynosi: %f", s.area());
            System.out.print("\n");
        }
    }

    public void getPerimeter(){
        for(Shape s : shapes){
            System.out.printf("Obwod figury %s", s.name);
            System.out.printf(" wynosi: %f", s.perimeter());
            System.out.print("\n");
        }
    }

    public void add(Shape s){
        shapes.add(s);
    }
}
