public class Ssak extends Zwierze {

    public double waga;

    public Ssak(String nazwa, int wiek, double waga) {
        super(nazwa, wiek);
        this.waga = waga;
    }
    @Override
    public String wydajDzwiek() {
        return "wrrr";
    }
    @Override
    public String poruszajSie() {
        return "I am walking";
    }
    @Override
    public String srodowiskoNaturalne() {
        return "ląd";
    }
}
