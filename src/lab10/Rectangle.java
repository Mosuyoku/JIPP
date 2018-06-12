package lab10;

public class Rectangle extends Shape{
    protected double width;
    protected double height;

    public Rectangle(String name, double width, double height) throws IllegalAccessException {
        super(name);
        this.width=width;
        this.height=height;

        if(this.width<=0 || this.height<=0){
            throw new IllegalAccessException("Podano bledne wymiary!");
        }

        System.out.printf("Konstruktor obiektu Rectangle o nazwie: %s", this.name);
        System.out.printf(" zostal wywolany.\n");
    }

    public double area(){
        return width*height;
    }

    public double perimeter(){
        return 2*width+2*height;
    }
}