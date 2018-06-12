package lab11;
import java.util.*;

import lab10.Pracownik;
import lab10.Rectangle;
import lab10.Square;
import lab10.Stanowisko;

public class lab11 {
    public static void main(String[] args) throws IllegalAccessException {
        try{
            BinomialSolver y1= new BinomialSolver(1, 5, 3);
            System.out.printf("Wartosc wielomianu y1: %f", y1.calculate(5));
            System.out.print("\n");
            System.out.printf("Wartosc pierwiastka x1: %f", y1.getX1());
            System.out.print("\n");
            System.out.printf("Wartosc pierwiastka x2: %f", y1.getX2());
            System.out.print("\n");
            BinomialSolver y2= new BinomialSolver(1, 2, 1);
            System.out.printf("Wartosc wielomianu y2: %f", y2.calculate(5));
            System.out.print("\n");
            System.out.printf("Wartosc pierwiastka x1: %f", y2.getX1());
            System.out.print("\n");
            System.out.printf("Wartosc pierwiastka x2: %f", y2.getX2());
            System.out.print("\n");
            BinomialSolver y3= new BinomialSolver(6, 3, 9);
            System.out.printf("Wartosc wielomianu y3: %f", y3.calculate(5));
            System.out.print("\n");
            System.out.printf("Wartosc pierwiastka x1: %f", y3.getX1());
            System.out.print("\n");
            System.out.printf("Wartosc pierwiastka x2: %f", y3.getX2());
            System.out.print("\n");
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }

        try{
            Rectangle rec=new Rectangle("Prostakat", -2, 4);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            System.out.print("\nBledne wartosci!!!\nPodaj inne wymiary: \n");
            double x;
            double y;
            Scanner s = new Scanner(System.in);
            x=s.nextDouble();
            y=s.nextDouble();
            Rectangle rec2=new Rectangle("Prostakat 2", x, y);
        }
        catch(Throwable t){
            System.out.print("\nERROR\n");
        }
        try{
            Square sq=new Square("Kwadrat", -2);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            System.out.print("\nBledne wartosci!!!\nPodaj inne wymiary: \n");
            double x;
            Scanner s = new Scanner(System.in);
            x=s.nextDouble();
            Square sq2=new Square("Kwadrat 2", x);
        }
        catch(Throwable t){
            System.out.print("\nERROR\n");
        }

        Random rand = new Random();
        int n=10;
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i=0; i<n; i++){
            int a = rand.nextInt(11);
            lista.add(a);
        }
        System.out.print("\n");
        for(int i=0; i<lista.size(); i++){
            System.out.printf("%d", lista.get(i));
            System.out.print(", ");
        }
        int cos;
        System.out.print("\n\nPodaj wartosc: \n");
        Scanner s = new Scanner(System.in);
        cos = s.nextInt();
        Boolean zawiera = lista.contains(cos);
        if(zawiera){
            System.out.print("Podana liczba znajduje sie na liscie.");
        }
        else{
            System.out.print("BRAK podanej liczby.");

        }
        lista.remove(5);
        System.out.print("\n\nWartosci po usunieciu elementu:\n");
        Iterator itr = lista.iterator();
        while(itr.hasNext()){
            Object ob = itr.next();
            System.out.printf("%d", ob);
            System.out.print(", ");
        }

        LinkedList<Integer> lista1 = new LinkedList<>();
        for(int i=0; i<n; i++){
            int a = rand.nextInt(11);
            lista1.add(a);
        }
        System.out.print("\n\n\n");
        for(int i=0; i<lista1.size(); i++){
            System.out.printf("%d", lista1.get(i));
            System.out.print(", ");
        }
        int cos1;
        System.out.print("\n\nPodaj wartosc: \n");
        Scanner s1 = new Scanner(System.in);
        cos1 = s1.nextInt();
        Boolean zawiera1 = lista1.contains(cos1);
        if(zawiera1){
            System.out.print("Podana liczba znajduje sie na liscie.");
        }
        else{
            System.out.print("BRAK podanej liczby.");

        }
        lista1.remove(5);
        System.out.print("\n\nWartosci po usunieciu elementu:\n");
        Iterator itr1 = lista1.iterator();
        while(itr1.hasNext()){
            Object ob1 = itr1.next();
            System.out.printf("%d", ob1);
            System.out.print(", ");
        }

        int minimum=Collections.min(lista);
        int minimum1=Collections.min(lista1);
        int maximum=Collections.max(lista);
        int maximum1=Collections.max(lista1);
        System.out.printf("\n\nNajmniejszy element ArrayList: %d", minimum);
        System.out.printf("\nNajmniejszy element LinkedList: %d", minimum1);
        System.out.printf("\nNajwiekszy element ArrayList: %d", maximum);
        System.out.printf("\nNajwiekszy element LinkedList: %d", maximum1);
        System.out.print("\n\n\n");

        Collections.sort(lista);
        for(int i=0; i<lista.size(); i++){
            System.out.printf("%d", lista.get(i));
            System.out.print(", ");
        }
        System.out.print("\n");
        Collections.sort(lista1);
        for(int i=0; i<lista1.size(); i++){
            System.out.printf("%d", lista1.get(i));
            System.out.print(", ");
        }
        System.out.print("\n");
        Collections.sort(lista, Collections.reverseOrder());
        for(int i=0; i<lista.size(); i++){
            System.out.printf("%d", lista.get(i));
            System.out.print(", ");
        }
        System.out.print("\n");
        Collections.sort(lista1, Collections.reverseOrder());
        for(int i=0; i<lista1.size(); i++){
            System.out.printf("%d", lista1.get(i));
            System.out.print(", ");
        }
        System.out.print("\n\n\n");

        Set secik = Collections.synchronizedSet(new HashSet(lista));
        Iterator itset = secik.iterator();
        while(itset.hasNext()){
            Object ob = itset.next();
            System.out.printf("%d", ob);
            System.out.print(", ");
        }

        System.out.print("\n\n\n");
        lista.removeIf(i->i>6);
        Iterator it = lista.iterator();
        while(it.hasNext()){
            Object ob = it.next();
            System.out.printf("%d", ob);
            System.out.print(", ");
        }

        Pracownik jan = new Pracownik("Jan", "Kowalski", Stanowisko.Kierownik, 10);
        Pracownik jan1 = new Pracownik("Jan", "Kowalski", Stanowisko.Kierownik, 10);
        Pracownik jerzy = new Pracownik("Jerzy", "Jerzowski", Stanowisko.Niekierownik, 8);
        Pracownik maria = new Pracownik("Maria", "Nowak", Stanowisko.Sekretarka, 6);

        Firma work = new Firma();
        work.addWorker(jan);
        try{
            work.addWorker(jan1);
        }
        catch(IllegalStateException e){
            e.printStackTrace();
            System.out.print("\n\nBrak takiego pracownika");
        }

        work.addWorker(jerzy);
        if(work.isExist(jerzy)){
            System.out.print("\n\nTaki pracownik istnieje!");
        }
        else{
            System.out.print("\n\nBrak takiego pracownika!");
        }

        System.out.print("\n\nW firmie znajduje sie: "+ work.count()+" pracownikow.");

        work.addWorker(maria);
        System.out.print("\n\nW firmie znajduje sie: "+ work.count()+" pracownikow.");
        work.removeWorker("Jerzy", "Jerzowski");
        System.out.print("\n\nW firmie znajduje sie: "+ work.count()+" pracownikow.");

        work.addWorker(jerzy);
        System.out.print("\n\nLista aktualnych pracownikow: \n");
        work.showAll();

        System.out.print("\n\nLista aktualnych pracownikow SEKEND: \n");
        for(Pracownik p : work){
            System.out.print(p.getImie() + ", " + p.getNazwisko() + ", " + p.getStanowisko() + ", " + p.getPensja()+ "\n");
        }
    }
}
