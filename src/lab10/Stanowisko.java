package lab10;

public enum Stanowisko{
    Kierownik (1, "Nic nie robi cały dzien"),
    Niekierownik (2, "Cos robi caly dzien"),
    Sekretarka (3, "Duzo robi caly dzien");

    int lp;
    String describe;

    Stanowisko(int lp, String describe) {
        this.lp = lp;
        this.describe = describe;
    }
}
