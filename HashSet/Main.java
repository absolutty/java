import sk.uniza.fri.VesmirnyObjekt;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: adaha
 * Date: 25. 5. 2021
 * Time: 16:19
 */
public class Main {
    private static Set<VesmirnyObjekt> planety = new HashSet<>();

    public static void main(String[] args) {
        VesmirnyObjekt merkur = new VesmirnyObjekt("Merkur", 88);
        Main.planety.add(merkur);

        VesmirnyObjekt venusa = new VesmirnyObjekt("Venuša", 225);
        Main.planety.add(venusa);

        VesmirnyObjekt zem = new VesmirnyObjekt("Zem", 365);
        Main.planety.add(zem);

        Main.planety.add(zem);//pokus o opatovne pridanie uz pridaneho objektu --> neprida ho

        Main.vypisPLanety(); ////pri tomto vypise NIE JE merkur odstraneny
        System.out.println("----------------");
        Main.vypisPLanety(); //pri tomto vypise JE merkur odstraneny
    }

    private static void vypisPLanety() {
        Iterator<VesmirnyObjekt> it = Main.planety.iterator();
        while (it.hasNext()) {
            VesmirnyObjekt o = it.next();


            //vyhodi ConcurrentModificationException
            /*if (o.getTrvanieObehu() < 100) {
                Main.planety.remove(o);
            }*/

            if (o.getTrvanieObehu() < 100) {
                it.remove(); //planeta je odstranena az po prejdeni cyklu
            }

            System.out.println(o.getNazov());
        }
    }
}
