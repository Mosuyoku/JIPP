package lab10;

public class lab10 {
    public static void main(String[] args) {
       Osoba jan = new Osoba("Jan", "Kowalski");
       Osoba jan2 = new Osoba("Jan", "Kowalski");
       Osoba maria = new Osoba("Maria", "Nowak");

       System.out.printf("jan == jan : %b%n", jan==jan);
       System.out.printf("jan == jan2 : %b%n", jan==jan2);
       System.out.printf("jan == maria : %b%n", jan==maria);
       System.out.printf("jan.equals(jan) : %b%n", jan.equals(jan));
       System.out.printf("jan.equals(jan2) : %b%n", jan.equals(jan2));
       System.out.printf("jan.equals(maria) : %b%n", jan.equals(maria));

       VerboseObject o1 = new VerboseObject("Obiekt1");
       VerboseObject o2 = new VerboseObject("Obiekt2");
       VerboseObject o3 = new VerboseObject("Obiekt3");
        o1.x();
        o2.x();
        o3.x();

        try {
            Rectangle rec = new Rectangle("Prostokat", 5, 6);
            Square sq = new Square("Kwadrat", 3);

            System.out.printf("Pole prostokata: %f", rec.area());
            System.out.printf(" oraz jego obwod: %f", rec.perimeter());
            System.out.printf("\nPole kwadratu: %f", sq.area());
            System.out.printf(" oraz jego obwod: %f", sq.perimeter());
            Shape sh = rec;
            Rectangle rec2 = sq;
            System.out.printf("\nPole prostokata (po zrzutowaniu): %f", sh.area());
            System.out.printf(" oraz jego obwod: %f", sh.perimeter());
            System.out.printf("\nPole kwadratu (po zrzutowaniu): %f", rec2.area());
            System.out.printf(" oraz jego obwod: %f", rec2.perimeter());
            //Nie da sie stworzyc instancji dla klasy Shape, poniewaz jest ona abstrakcyjna, nie ma natomiast problemu kiedy chcemy na klasę Shape zrzutować klase Rectangle.
            System.out.println("\n");

            ShapeContainer s = new ShapeContainer();
            s.add(rec);
            s.add(sq);
            s.add(sh);
            s.add(rec2);
            s.getArea();
            s.getPerimeter();
            System.out.println("\n");

            Elipse el = new Elipse("Elipsa", 5, 6);
            Circle ci = new Circle("Kolo", 3);
            System.out.printf("Pole elipsy: %f", el.area());
            System.out.printf(" oraz jej obwod: %f", el.perimeter());
            System.out.printf("\nPole kola: %f", ci.area());
            System.out.printf(" oraz jego obwod: %f", ci.perimeter());
            Shape sh2 = el;
            Elipse el2 = ci;
            System.out.printf("\nPole elipsy (po zrzutowaniu): %f", sh2.area());
            System.out.printf(" oraz jej obwod: %f", sh2.perimeter());
            System.out.printf("\nPole kola (po zrzutowaniu): %f", el2.area());
            System.out.printf(" oraz jego obwod: %f", el2.perimeter());
            System.out.println("\n");
            s.add(el);
            s.add(ci);
            s.add(sh2);
            s.add(el2);
            s.getArea();
            s.getPerimeter();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
