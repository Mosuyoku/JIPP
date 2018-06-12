package lab10;

public class Circle extends Elipse {
    public Circle(String name, double r){
        super(name, r, r);

        System.out.printf("Konstruktor obiektu Circle o nazwie: %s", this.name);
        System.out.printf(" zostal wywolany.\n");
    }
}
