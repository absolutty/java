package sk.uniza.fri;

import java.util.HashMap;

/**
 * 20. 3. 2021 - 11:29
 *
 * @author adaha
 */
public final class Immutable {
    private final String retazec;
    private final int cislo;
    private final HashMap<Integer, String> zoznam;

    public Immutable(String retazec, int cislo, HashMap<Integer, String> zoznam) {
        this.retazec = retazec;
        this.cislo = cislo;
        this.zoznam = zoznam;
    }

    /**
     * vráti hodnotu reťazca
     * */
    public String getRetazec() {
        return this.retazec;
    }

    /**
     * vráti hodnotu čísla
     * */
    public int getCislo() {
        return this.cislo;
    }

    /**
     * skopiruje obsah HashMapu a vráti novú referenciu
     * (neodkazuje na referenciu tohto objektu)
     * */
    public HashMap<Integer, String> getZoznam() {
        return new HashMap<Integer, String>(this.zoznam);
    }

    public static void main(String[] args) {
        HashMap<Integer, String> zoznamPrvkov = new HashMap<>();
        zoznamPrvkov.put(3, "tri");
        zoznamPrvkov.put(4, "štyri");
        zoznamPrvkov.put(5, "päť");

        Immutable im = new Immutable("tuturutu", 3, zoznamPrvkov);
    }
}
