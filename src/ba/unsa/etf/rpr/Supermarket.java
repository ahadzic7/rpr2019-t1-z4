package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli;
    private int brojArtikala;

    public Supermarket() {
        this.artikli = null;
        this.brojArtikala = 0;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public void dodajArtikl (Artikl novi) {
        if (getBrojArtikala() == 0) {
            this.artikli = new Artikl[1];
            getArtikli()[0] = novi;
            brojArtikala = 1;
            return;
        }
        Artikl[] tmpArtikli = new Artikl[brojArtikala + 1];
        for (int i = 0; i < brojArtikala; i++) {
            tmpArtikli[i] = this.getArtikli()[i];
        }
        tmpArtikli[brojArtikala] = novi;
        this.artikli = tmpArtikli;
        this.brojArtikala = this.brojArtikala + 1;
    }

    public Artikl izbaciArtiklSaKodom (String trazeniKod) {
        if (getBrojArtikala() == 0)
            return null;

        trazeniKod = trazeniKod.replace("c", "");

        for (int i = 0; i < getBrojArtikala(); i++) {
        //    System.out.println("'" + this.getArtikli()[i].getKod() + "'  " + "<->" + "   '"+ trazeniKod + "'");

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

    public int getBrojArtikala() {
        return brojArtikala;
    }
}
