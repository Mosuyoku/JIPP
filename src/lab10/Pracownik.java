package lab10;

public class Pracownik extends Osoba {

    private int pensja;
    private Stanowisko stanowisko;
    public Pracownik(String imie, String nazwisko, Stanowisko stanowisko, int pensja){
        super(imie, nazwisko);
        this.stanowisko=stanowisko;
        this.pensja=pensja;
    }

    public int getPensja() {
        return pensja;
    }

    public Stanowisko getStanowisko() {
        return stanowisko;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    public void setStanowisko(Stanowisko stanowisko) {
        this.stanowisko = stanowisko;
    }
}
