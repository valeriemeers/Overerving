public class Persoon extends Adres {


    private String naam;
    private String voornaam;
    private Adres adres;

    public Persoon(String naam, String voornaam, String straat, String nummer, int postcode, String gemeente) {
        super(straat, nummer, postcode, gemeente);
        this.naam = naam;
        this.voornaam = voornaam;
        this(naam, voornaam, new Adres(straat, nummer, gemeente, postcode));
    }

    public Persoon(String naam, String voornaam, Adres adres) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.adres = new Adres();
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public void voegVoornamenToe(String... voornamen){      //oneindig aantal namen toevoegen als in een array
        StringBuilder SB = new StringBuilder();
        for (String vn : voornamen) {
            this.voornaam = SB.append(voornaam).append(" ").append(vn).toString();
        }
    }

    @Override
    public String toString() {
        return voornaam + " " + naam + "\n" + getStraat() + " " + getNummer() + "\n" + getPostcode() + " " + getGemeente();
        //        return getVoornaam + " " + getNaam + "\n" + getAdres();

    }
}



