package lab11;
import lab10.*;
import java.util.*;
import java.lang.*;

public class Firma implements Iterable <Pracownik>{
    private Set<Pracownik> pracownicy;

    public Firma(){
        this.pracownicy = new HashSet();
    }

    public boolean isExist(Pracownik p){
        for(Pracownik q : pracownicy){
            if(q.getImie()==p.getImie() && q.getNazwisko()==p.getNazwisko()){
                return pracownicy.contains(p);
            }
        }
        return false;
    }

    public void addWorker(Pracownik p){
        for(Pracownik q : pracownicy){
                if(q.getImie()==p.getImie() && q.getNazwisko()==p.getNazwisko()){
                    throw new IllegalStateException("Taki pracownik istnieje!");
                }
        }
        pracownicy.add(p);
    }

    public int count(){
        return pracownicy.size();
    }

    public void removeWorker(String imie, String nazwisko){
        for(Pracownik p : pracownicy){
               if(p.getImie()==imie && p.getNazwisko()==nazwisko){
                   pracownicy.remove(p);
               }
        }
    }

    public void showAll(){
        for(Pracownik p : pracownicy){
            System.out.print(p.getImie() + ", " + p.getNazwisko() + ", " + p.getStanowisko() + ", " + p.getPensja()+ "\n");
            }
    }

    @Override
    public Iterator<Pracownik> iterator(){
        return pracownicy.iterator();
    }
}
