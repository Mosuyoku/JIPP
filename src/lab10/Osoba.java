package lab10;

public class Osoba {
   private String imie;
   private  String nazwisko;

   public Osoba (String imie, String nazwisko){
       this.imie=imie;
       this.nazwisko=nazwisko;
   }

   public Boolean equals(Osoba o){
       if(this.imie==o.imie && this.nazwisko==o.nazwisko){
           return true;
       }
       else{
           return false;
       }
   }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }
}
