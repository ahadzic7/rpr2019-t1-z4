package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    private static Supermarket prodavnica = new Supermarket();


    private static void popuniSupermarket () {
        prodavnica.dodajArtikl(new Artikl("Lopta", 10, "1"));
        prodavnica.dodajArtikl(new Artikl("Stolica", 100, "2"));
        prodavnica.dodajArtikl(new Artikl("Telefon", 800, "3"));
    }

    @Test
    void getArtikli() {
        popuniSupermarket();
    }

    @Test
    void dodajArtikl() {
        popuniSupermarket();
        assertEquals(3, prodavnica.getBrojArtikala());
    }

    @Test
    void izbaciArtiklSaKodom() {
        popuniSupermarket();
        prodavnica.izbaciArtiklSaKodom("1");
        assertEquals(2, prodavnica.getBrojArtikala());
    }

    @Test
    void getBrojArtikala() {
        popuniSupermarket();
        assertEquals(3, prodavnica.getBrojArtikala());
    }
}