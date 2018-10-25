package ba.unsa.etf.rpr.tutorijal1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PredmeTest {

    Student s = new Student("Ferid", "Hadžić", 17685);
    Predmet p = new Predmet("Razvoj programskih rješenja", 1);

    @Test
    void getNazivPredmeta() {
        assertEquals("Razvoj programskih rješenja", p.getNazivPredmeta());
    }

    @Test
    void getSifraPredmeta() {
        assertEquals(1, p.getSifraPredmeta());
    }

}
