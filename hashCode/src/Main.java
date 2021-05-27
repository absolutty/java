package sk.uniza.fri;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: adaha
 * Date: 27. 5. 2021
 * Time: 19:45
 */
public class Main {
    private static Set<Osoba> zoznamOsob = new HashSet<>(); //zoznam osob moze obsahovat iba jednu osobu s tym menom

    public static void main(String[] args) {
        Osoba o1 = new Osoba("Peter", 25);
        Main.zoznamOsob.add(o1);
        Osoba o2 = new Osoba("Matej", 23);
        Main.zoznamOsob.add(o2);
        Osoba o3 = new Osoba("Alex", 27);
        Main.zoznamOsob.add(o3);
        Osoba o4 = new Osoba("Marek", 23);
        Main.zoznamOsob.add(o4);
        Osoba o5 = new Osoba("Adam", 25);
        Main.zoznamOsob.add(o5);
        Osoba o6 = new Osoba("Vladimir", 24);
        Main.zoznamOsob.add(o6);

        Osoba o7 = new Osoba("Matej", 23); //duplikatna osoba (take meno je v zozname uz raz pridane
        Main.zoznamOsob.add(o7);//nebude pridana, osetrene metodami equals() a hashcode()

        Main.vypisZoznamOsob();
    }

    private static void vypisZoznamOsob() {
        Rozdelenie.vypis(50);
        System.out.println("Vypisujem osoby: ");
        for (Osoba o : Main.zoznamOsob) {
            System.out.println(o.toString());
        }
    }
}
