package lab10;

public class Elipse extends Shape {
    private double a;
    private double b;

    public Elipse(String name, double a, double b){
        super(name);
        this.a=a;
        this.b=b;

        System.out.printf("Konstruktor obiektu Elipse o nazwie: %s", this.name);
        System.out.printf(" zostal wywolany.\n");
    }

    public double area(){
        return 3.14*a*b;
    }

    public double perimeter(){
        return 3.14*((3*(a+b))/2-Math.sqrt(a*b));
    }
}
