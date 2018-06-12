package lab10;

public abstract class Shape {
    protected String name;

    public Shape(String name){
        this.name=name;

        System.out.printf("Konstruktor obiektu Shape o nazwie: %s", this.name);
        System.out.printf(" zostal wywolany.\n");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public abstract double area();

    public abstract double perimeter();
}
