package ba.unsa.etf.rpr;

import org.jetbrains.annotations.NotNull;

public class Artikl {
    private String naziv;
    private int trenutnoStanje, cijena;
    private String kod;

    public Artikl(String nazivArtikla, int cijena, String kod) {
        setNaziv(nazivArtikla);
        setCijena(cijena);
        setKod(kod);
    }

    public Artikl(@NotNull Artikl stari) {
        setNaziv(stari.getNaziv());
        setCijena(stari.getCijena());
        setKod(stari.getKod());
    }


    public void setCijena(int cijena) {
        this.cijena = cijena;
    }

    public void setNaziv(String nazivArtikla) {
        this.naziv = nazivArtikla;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public void setTrenutnoStanje(int trenutnoStanje) {
        this.trenutnoStanje = trenutnoStanje;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getKod() {
        return kod;
    }

    public int getTrenutnoStanje() {
        return trenutnoStanje;
    }

    public int getCijena() {
        return cijena;
    }



}
