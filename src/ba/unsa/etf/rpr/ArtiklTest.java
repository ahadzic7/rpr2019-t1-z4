package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void setCijena() {
        Artikl testArtikl = new Artikl("Laptop", 1500, "404");
        testArtikl.setCijena(1800);
        assertEquals(1800, testArtikl.getCijena());
    }

    @Test
    void setNaziv() {
        Artikl testArtikl = new Artikl("Laptop", 1500, "404");
        testArtikl.setNaziv("macBook");
        assertEquals("macBook", testArtikl.getNaziv());
    }

    @Test
    void setKod() {
        Artikl testArtikl = new Artikl("Laptop", 1500, "404");
        testArtikl.setKod("101");
        assertEquals("101", testArtikl.getKod());
    }

    @Test
    void setTrenutnoStanje() {
        Artikl testArtikl = new Artikl("Laptop", 1500, "404");
        testArtikl.setTrenutnoStanje(0);
        assertEquals(0, testArtikl.getTrenutnoStanje());
    }


}