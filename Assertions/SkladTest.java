package sk.uniza.fri;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sk.uniza.fri.sklad.PolozkaSkladu;
import sk.uniza.fri.sklad.Sklad;
import sk.uniza.fri.tovar.Tovar;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 23. 2. 2021 - 15:50
 *
 * @author adaha
 */
class SkladTest {
    private Tovar t1;
    private Tovar t2;
    private Tovar t3;
    private Tovar rovnAkoT1; //tovar, kt. atribúty budú zhodné s t1
    private PolozkaSkladu polSkl1;
    private PolozkaSkladu polSkl2;
    private PolozkaSkladu polSkl3;
    private Sklad sklad;

    @BeforeEach
    void setUp() {
        this.t1 = new Tovar(100, "ponozky", 2.3);
        this.t2 = new Tovar(101, "nohavice", 15);
        this.t3 = new Tovar(102, "tričko", 12.99);

        this.rovnAkoT1 = new Tovar(100, "ponozky", 2.3);

        this.polSkl1 = new PolozkaSkladu(this.t1, 10);
        this.polSkl2 = new PolozkaSkladu(this.t2, 20);

        this.sklad = new Sklad(25);
        this.sklad.pridajTovarNaSklad(this.polSkl1);
        this.sklad.pridajTovarNaSklad(this.polSkl2);
    }

    @AfterEach
    void tearDown() {
        this.sklad.vypis();
    }

    /**
     * metóda testuje: vytváranie položiek skladu so záporným počtom kusov, následné ich úspešnosť pridania do skladu
     * */
    @Test
    void pridajNaSkladTest() {
        this.polSkl3 = new PolozkaSkladu(this.t3, -30); //vytváranie skladovej položky so zápornym počtom kusov
        assertTrue(this.sklad.pridajTovarNaSklad(this.polSkl3)); //následné pridávanie, očakávaný výsledok testu: TRUE
    }

    /**
     * metóda testuje: prípadnú zhodu v ID tovarov
     * */
    @Test
    void rovnakeIdTest() {
        assertNotEquals(this.t1.getId(), this.rovnAkoT1.getId());
    }

    /**
     * metóda testuje: prípadnú zhodu v názve
     * */
    @Test
    void rovnakyNazovTest() {
        assertNotEquals(this.t1.getNazov(), this.rovnAkoT1.getNazov());
    }
}