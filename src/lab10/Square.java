package lab10;

public class Square extends Rectangle {
    public Square(String name, double width) throws IllegalAccessException {
        super(name, width, width);

        System.out.printf("Konstruktor obiektu Square o nazwie: %s", this.name);
        System.out.printf(" zostal wywolany.\n");

    }
}
