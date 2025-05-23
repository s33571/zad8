public class Gad extends Zwierze {

    public double dlugosc;

    public Gad(String nazwa, int wiek, double dlugosc) {
        super(nazwa, wiek);
        this.dlugosc = dlugosc;
    }
    @Override
    public String wydajDzwiek() {
        return "sss";
    }
    @Override
    public String poruszajSie() {
        return "I am crawling";
    }
    @Override
    public String srodowiskoNaturalne() {
        return "woda";
    }
}
