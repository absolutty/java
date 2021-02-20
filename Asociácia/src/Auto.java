public class Auto {
    private String znacka;
    private int vykonHP;
    private Majitel majitel;

    public Auto(String znacka, int vykonHP, Majitel majitel) {
        this.znacka = znacka;
        this.vykonHP = vykonHP;
        this.majitel = majitel;
    }

    @Override
    public String toString() {
        return String.format("[auto %s, má %dHP,  %s]", this.znacka, this.vykonHP, this.majitel.toString());
    }
}
