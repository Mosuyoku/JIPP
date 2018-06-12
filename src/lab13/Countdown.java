package lab13;
import java.util.*;

public class Countdown implements Runnable{
    private String name;
    private int limit;

    public Countdown(String name, int limit){
        this.name=name;
        this.limit=limit;
    }

    @Override
    public void run(){
        Random generator = new Random();
        for ( int i = limit; i > 0; i--) {
            System.out.println(name + ": " + i);
            try {
                int x = generator.nextInt(1000 -10 +1)+10;
                Thread.sleep(x);
            } catch (InterruptedException e) {
                System.out.println("Blad " + e.getMessage());
            }
        }
    }
}
