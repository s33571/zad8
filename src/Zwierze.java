public abstract class Zwierze {

    protected String nazwa;
    protected int wiek;

    public Zwierze(String nazwa, int wiek) {
        this.nazwa = nazwa;
        this.wiek = wiek;
    }
    public String getNazwa() {
        return nazwa;
    }
    public int getWiek() {
        return wiek;
    }
    public abstract String wydajDzwiek();

    public abstract String poruszajSie();

    public String wyswietlInformacje() {
        System.out.println("--- Informacje o zwierzęciu ---");
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Wiek: " + wiek + " lat");
        System.out.println("Dźwięk: " + wydajDzwiek());
        return "Nazwa " + nazwa + " wiek " + wiek;
    }
    public abstract String srodowiskoNaturalne();
}