/**
 * trieda Zviera je abstraktná, t.zn. že nie je možné vytvárať je inštancie
 * pre jej použitie je potrebné aby bola zdedená niektorou triedou
 * */
abstract class Zviera {
    public abstract void vydavaZvuk(); //zvuk, kt. dané zviera vydáva
    public abstract void jeFarby(); //farba zvieraťa

    public void spanok(){
        System.out.println("ZZZ zzz ZZZ"); //zviera spí
    }
}

/**
 * dedí z abstraktnej triedy Zviera
 * metódam je poskytnuté telo
 * */
class Pes extends Zviera{
    @Override
    public void vydavaZvuk() {
        System.out.println("Haf haf"); //štekot
    }

    @Override
    public void jeFarby() {
        System.out.println("Farba psa je biela"); //náš pes je bielej farby
    }
}

class Main {
    public static void main(String[] args) {
        Pes pes  = new Pes();

        pes.jeFarby();
        pes.vydavaZvuk();

        pes.spanok();
    }
}
