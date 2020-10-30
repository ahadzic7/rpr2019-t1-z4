package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli;
    private int brojArtikala;
    private final int KAPACITET_KORPE = 50;

    public Korpa() {
        this.artikli = null;
        this.brojArtikala = 0;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public boolean dodajArtikl (Artikl novi) {
        if (getBrojArtikala() == KAPACITET_KORPE)
            return false;
        if (getBrojArtikala() == 0) {
            this.artikli = new Artikl[1];
            getArtikli()[0] = novi;
            brojArtikala = 1;
            return true;
        }
        Artikl[] tmpArtikli = new Artikl[getBrojArtikala() + 1];
        for (int i = 0; i < getBrojArtikala(); i++) {
            tmpArtikli[i] = this.getArtikli()[i];
        }
        tmpArtikli[getBrojArtikala()] = novi;
        this.artikli = tmpArtikli;
        this.brojArtikala = getBrojArtikala() + 1;
        return true;
    }

    public Artikl izbaciArtiklSaKodom (String trazeniKod) {
        if (getBrojArtikala() == 0)
            return null;

        trazeniKod = trazeniKod.replace("c", "");

        for (int i = 0; i < getBrojArtikala(); i++) {
            if (this.getArtikli()[i].getKod().equals(trazeniKod)) {
                Artikl pom = new Artikl(getArtikli()[i]);
                for (int j = i + 1; j < getBrojArtikala(); j++) {
                    this.getArtikli()[j - 1] = this.getArtikli()[j];
                }
                this.getArtikli()[getBrojArtikala() - 1] = null;

                this.brojArtikala = getBrojArtikala() - 1;
                return pom;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala () {
        int ukupnaCijena = 0;
        for (int i = 0; i < getBrojArtikala(); i++) {
            ukupnaCijena = ukupnaCijena + getArtikli()[i].getCijena();
        }
        return ukupnaCijena;
    }

    public int getBrojArtikala() {
        return brojArtikala;
    }
}
