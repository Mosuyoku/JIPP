package lab13;
import java.util.*;

public class Adder implements Runnable {
    private int n;
    private Vector<Integer> list;

    public Adder( int n, Vector<Integer> list){
        this.n=n;
        this.list=list;
    }

    @Override
    public void run(){
        for (int i = 0; i < n; i++)
        {
            list.add(i);
        }
    }
}
