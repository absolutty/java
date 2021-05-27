package sk.uniza.fri;

/**
 * 27. 5. 2021 - 19:45
 *
 * @author adaha
 */
public class Osoba {
    private static int idPocitadlo = 1;

    private final String meno;
    private final String id;
    private final int vek;

    public Osoba(String meno, int vek) {
        this.meno = meno;
        this.vek = vek;
        this.id = String.format("%04d", Osoba.idPocitadlo);

        Osoba.idPocitadlo++; //id pocitadlo je zvacsene a pripravene pre novu osobu na pouzitie
    }

    @Override
    public String toString() {
        return String.format("[%s]: %s, vek: %d", this.id, this.meno, this.vek);
    }



    public String getMeno() {
        return this.meno;
    }

    private static final int HASH_KONSTANTA = 57;
    @Override
    public int hashCode() {
        return this.meno.hashCode() * Osoba.HASH_KONSTANTA; //hashcode mena je prenásobený random konštantou HASH_KONSTANTA
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { //ak sa jedna o rovnaku instanciu
            return true;
        } else if (obj instanceof Osoba) {
            Osoba os = (Osoba)obj;
            return os.getMeno().equals(this.meno);
        }
        return false; //nebola splnena ani jedna z uvedenych podmienok
    }
}
