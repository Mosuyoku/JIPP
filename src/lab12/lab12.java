package lab12;
import java.io.IOException;
import java.math.BigInteger;
import java.text.*;
import java.util.*;

public class lab12 {
    public static void main(String[] args) throws IOException {
        double startTime1= System.nanoTime();

        int x = 1000000;
        int[] tab = new int[x];
        for(int i=0; i<x; i++){
            tab [i]=i;
        }

        double estimatedTime1 = System.nanoTime() - startTime1;
        System.out.print("Tworzenie tablicy zajelo: "+estimatedTime1/1000000000+"s");


        double startTime2= System.nanoTime();

        ArrayList<Integer> lista = new ArrayList<>();
        for(int i=0; i<x; i++){
            lista.add(i);
        }

        double estimatedTime2 = System.nanoTime() - startTime2;
        System.out.print("\n\nTworzenie ArrayList zajelo: "+estimatedTime2/1000000000+"s");

        double startTime3= System.nanoTime();

        ArrayList<Integer> lista2 = new ArrayList<>(x);
        for(int i=0; i<x; i++){
            lista2.add(i);
        }

        double estimatedTime3 = System.nanoTime() - startTime3;
        System.out.print("\n\nTworzenie ArrayList (z ograniczonym rozmiarem listy) zajelo: "+estimatedTime3/1000000000+"s");

        double startTime4= System.nanoTime();

        LinkedList<Integer> lista3 = new LinkedList<>();
        for(int i=0; i<x; i++){
            lista3.add(i);
        }

        double estimatedTime4 = System.nanoTime() - startTime4;
        System.out.print("\n\nTworzenie LinkedList zajelo: "+estimatedTime4/1000000000+"s\n\n");


        double startTime5= System.nanoTime();

        int index = 10000;
        BigInteger fac = BigInteger.valueOf(1);
        for(int i=1; i<=index; i++){
            fac=fac.multiply(BigInteger.valueOf(i));
        }
        NumberFormat formatter = new DecimalFormat("0.######E0", DecimalFormatSymbols.getInstance(Locale.ROOT));
        String str = formatter.format(fac);
        System.out.println(index+ ": " +str);
        double estimatedTime5 = System.nanoTime() - startTime5;
        System.out.print("Czas liczenia silni: "+estimatedTime5/1000000000+"s");


        Makbet mac = new Makbet();
        mac.UniqueWord();


    }
}
