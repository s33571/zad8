public class ZarzadzanieZOO {

    public static void main(String[] args) {

        Ssak lew = new Ssak("lew",5,200.70);
        lew.wydajDzwiek();
        lew.poruszajSie();
        lew.srodowiskoNaturalne();
        lew.wyswietlInformacje();

        Ptak orzel = new Ptak("orzel",3,30);
        orzel.wydajDzwiek();
        orzel.poruszajSie();
        orzel.srodowiskoNaturalne();
        orzel.wyswietlInformacje();

        Gad waz = new Gad("waz",7,110);
        waz.wydajDzwiek();
        waz.poruszajSie();
        waz.srodowiskoNaturalne();
        waz.wyswietlInformacje();
    }
}