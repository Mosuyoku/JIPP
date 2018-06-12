package lab11;

public class BinomialSolver {
    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;

    public BinomialSolver(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
        double delta = (this.b*this.b)-(4*this.a*this.c);

        if(delta<0){
            throw new ArithmeticException("Brak miejsc zerowych!");
        }
        else{
            this.x1=((-1*this.b)-Math.sqrt(delta))/(2*this.a);
            this.x2=((-1*this.b)+Math.sqrt(delta))/(2*this.a);
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double calculate(double x){
        return (a*x*x)+(b*x)+c;
    }

}
