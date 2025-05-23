public class Ptak extends Zwierze{

    public double rozpietoscSkrzydel;

    public Ptak(String nazwa, int wiek, double rozpietoscSkrzydel) {
        super(nazwa, wiek);
        this.rozpietoscSkrzydel = rozpietoscSkrzydel;
    }
    @Override
    public String wydajDzwiek() {
        return "kraa";
    }
    @Override
    public String poruszajSie() {
        return "I am flying";
    }
    @Override
    public String srodowiskoNaturalne() {
        return "drzewa";
    }
}
