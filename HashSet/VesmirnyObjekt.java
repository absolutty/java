package sk.uniza.fri;

import java.util.HashSet;
import java.util.Set;

/**
 * 25. 5. 2021 - 16:19
 *
 * @author adaha
 */
public final class VesmirnyObjekt {
    private final String nazov;
    private final double trvanieObehu; //počet dni, trvanie obehu planéty o kolo slnka
    private final Set<VesmirnyObjekt> mesiace;

    public VesmirnyObjekt(String nazov, double trvanieObehu) {
        this.nazov = nazov;
        this.trvanieObehu = trvanieObehu;
        this.mesiace = new HashSet<>();
    }

    public boolean pridajMesiac(VesmirnyObjekt mesiac) {
        return this.mesiace.add(mesiac);
    }

    public String getNazov() {
        return this.nazov;
    }

    public double getTrvanieObehu() {
        return this.trvanieObehu;
    }

    public Set<VesmirnyObjekt> getMesiace() {
        return new HashSet<>(this.mesiace);
    }
}
