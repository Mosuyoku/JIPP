package lab12;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.nio.file.*;

public class Makbet {
    private List<String> line;
    private Map<String, Integer> map = new HashMap<>();

    public Makbet() throws IOException {

        line = Files.readAllLines( new File("macbeth.txt").toPath());

    }

    public void UniqueWord(){
        for(String l : line){
            String[] single = l.split("\\W+");

            for(int i=0; i<single.length; i++){
               single[i] = single[i].toLowerCase();
               if(single[i].length()>=3){
                   if(map.containsKey(single[i])){
                       Integer in = map.get(single[i]);
                       map.replace(single[i], in, in+1);
                   }
                   else{
                       map.put(single[i], 1);
                   }
               }

            }
        }
        System.out.print("\n\n\nPlik zawiera: " + map.size()+" unikalnych slow");

        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        Map<String, Integer> sorted = new HashMap<>();
        list.forEach((Map.Entry<String, Integer> p) -> {sorted.put(p.getKey(), p.getValue()); });

        System.out.print("\n\nLiczba wystapien slowa macbeth: "+map.get("macbeth"));
        System.out.print("\n\n20 najpopularniejszych slow: ");
        int liczba = 20;
        for(Map.Entry<String, Integer> p : sorted.entrySet()){
            liczba--;
            if(liczba>0) {
                System.out.print("\n" + p.getKey() + ";");
            }
        }
    }
}