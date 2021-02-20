public class Majitel {
    private String meno;
    private String pohlavie;
    private int vek;

    public Majitel(String meno, String pohlavie, int vek) {
        this.meno = meno;
        this.pohlavie = pohlavie;
        this.vek = vek;
    }

    @Override
    public String toString() {
        return String.format("majiteľ je %s %s s vekom %d rokov", this.pohlavie, this.meno, this.vek);
    }
}
