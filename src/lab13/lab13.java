package lab13;
import java.util.*;

public class lab13 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread( new Countdown("t1", 10));
        t1.start();

        while(t1.isAlive()){
            try {
                t1.join();
            }
            catch(InterruptedException e){
                System.out.print("Blad");
            }
        }
        System.out.println("Main thread run is over\n");

        Thread racer1 = new Thread( new Countdown("racer 1", 20));
        Thread racer2 = new Thread( new Countdown("racer 2", 20));
        racer1.start();
        racer2.start();
        racer1.join();
        racer2.join();
        System.out.println("Race is over\n");

        Counter counter = new Counter();

        Thread c1 = new Thread(counter);
        Thread c2 = new Thread(counter);
        Thread c3 = new Thread(counter);

        try
        {
            c1.start();
            c2.start();
            c3.start();

            c1.join();
            System.out.println("C1: " + counter.getCount());

            c2.join();
            System.out.println("C2: " + counter.getCount());

            c3.join();
            System.out.println("C3: " + counter.getCount());
        }
        catch(InterruptedException e) { System.out.println("Blad");}


        Vector<Integer> numbers = new Vector<>();
        Vector<Thread> thr = new Vector<>();
        int n  = 10;
        int t=4;

        Adder adder = new Adder(n, numbers);

        for(int i=0; i<t; i++){
            thr.add(new Thread(adder));
            thr.get(i).start();
            thr.get(i).join();
        }

        System.out.print("\n\nRozmiar: "+ numbers.size());
        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.print("\n"+numbers.get(i));
        }
        System.out.print("\n\n");
        numbers.parallelStream().forEach(e -> System.out.println(e + " "));


        try{
            Producer producer = new Producer();
            Consumer consumer1 = new Consumer("Consumer 1 ", producer);
            Consumer consumer2 = new Consumer("Consumer 2 ", producer);

            Thread p = new Thread(producer);
            Thread c11 = new Thread(consumer1);
            Thread c12 = new Thread(consumer2);

            p.start();
            c11.start();
            c12.start();

            Thread.sleep(3000);
            p.interrupt();
            p.join();
            System.out.println("\nProduced " + producer.getMessageCount()+ " messages.");
            Thread.sleep(500);
            c11.interrupt();
            c12.interrupt();
            c11.join();
            c12.join();
            System.out.println("\nConsumed " + (consumer1.getMessageCount()+ consumer2.getMessageCount()) + " messages.");

            System.out.println("\nMain thread stopped.");
        }
        catch(InterruptedException e){
            System.out.print("\n\n\n ERROR \n\n\n");
        }
    }
}
