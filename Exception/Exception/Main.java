package sk.uniza.fri;

import sk.uniza.fri.exceptions.KladneCisloException;
import sk.uniza.fri.exceptions.ZaporneCisloException;

/**
 * Created by IntelliJ IDEA.
 * User: adaha
 * Date: 21. 4. 2021
 * Time: 10:11
 */
public class Main {
    public static void main(String[] args) {
        int cisloNaOverenie = 7;

        try {
            Main.jeKladne(cisloNaOverenie);
            Main.jeZaporne(cisloNaOverenie);
        } catch (ZaporneCisloException ex) {
            System.out.printf("Cislo je %d zaporne: [%s]\n", cisloNaOverenie, ex.getMessage());
        } catch (KladneCisloException ex) {
            System.out.printf("Cislo je %d je kladne: [%s]\n", cisloNaOverenie, ex.getMessage());
        } finally {
            System.out.println("Koniec overovania cisla.");
        }
    }

    private static void jeKladne(int cislo) throws ZaporneCisloException {
        if (cislo < 0) { //ak cislo NIE JE kladne
            throw new ZaporneCisloException();
        }
    }

    private static void jeZaporne(int cislo) throws KladneCisloException {
        if (cislo >= 0) { //ak cislo NIE JE zaporne
            throw new KladneCisloException();
        }
    }
}
