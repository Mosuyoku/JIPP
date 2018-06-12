package lab10;

public class VerboseObject {
    private String name;

    public VerboseObject(String name){
        this.name=name;
        System.out.printf("\nWywolano konstruktor VerboseObject o nazwie: %s", this.name);
    }

    @Override
    protected void finalize(){
        System.out.printf("\nObiekt VerboseObject o nazwie: %s", name);
        System.out.print(" zostal zniszczony");
    }

    public void x(){
        System.out.printf("\nMetoda obiektu VerseObject o nazwie: %s", name);
        System.out.print(" zostala wywolana\n");
    }
}
