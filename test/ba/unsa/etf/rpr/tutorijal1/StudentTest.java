package ba.unsa.etf.rpr.tutorijal1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student s = new Student("Ferid", "Hadžić", 17685);

    @Test
    void getIme() {
        assertEquals("Ferid", s.getIme());
    }

    @Test
    void getPrezime() {
        assertEquals("Hadžić", s.getPrezime());
    }


    @Test
    void getIndex() {
        assertEquals(17685, s.getIndex());
    }

}