public class Manager extends Werknemer {
    private static int count = 0;
    private double bonus;

    public Manager(String naam, String voornaam, Adres adres, String functie, double salaris) {
        super(naam, voornaam, adres, functie, salaris, 50);
        this.bonus = bonus;
    }

    public Manager(String naam, String voornaam, Adres adres, String functie, double salaris, double bonus) {
        super(naam, voornaam, adres, functie, salaris);
        this.bonus = bonus;
        count++;
    }

    public static int getcount(){
        return count;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int getSalaris(){
        return super.getSalaris()+getBonus();
    }

    public float getProcAandeelManagers() {
        double procent = (doule) getCount() / (double) Werknemer.getcount()) * 100;
Numberformat formatter = Numberformat.getInstance(Locale.getDefault());
formatter.set
    }
}
