public class Trieda {
    private String nazov;
    private int pocet;

    //začiatok - constructor overloading
    public Trieda(String nazov) {
        this.nazov = nazov;
    }

    public Trieda(int pocet) {
        this.pocet = pocet;
    }

    public Trieda(String nazov, int pocet) {
        this.nazov = nazov;
        this.pocet = pocet;
    }
    //koniec - constructor overloading

    //constructor ktorý vytvorí nový objekt na základe skopírovaných údajov jedného
    public Trieda(Trieda t){
        this.nazov = t.nazov;
        this.pocet = t.pocet;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": "+ nazov + ", " + pocet;
    }
}