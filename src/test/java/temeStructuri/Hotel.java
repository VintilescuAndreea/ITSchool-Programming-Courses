package temeStructuri;

import java.util.List;

public class Hotel {

    public String nume;
    public String adresa;
    public String oras;
    public String tara;
    public int numarStele;
    public List<String> facilitati;

    public Hotel(String nume, String adresa, String oras, String tara, int numarStele, List<String> facilitati) {
        this.nume = nume;
        this.adresa = adresa;
        this.oras = oras;
        this.tara = tara;
        this.numarStele = numarStele;
        this.facilitati = facilitati;
    }

    public void prezentareHotel() {
        System.out.println("Hotelul " + nume + " este situat in " + oras + ", " + tara + ". Adresa este " + adresa + ".");
        System.out.println("Numar de stele: " + numarStele);
        System.out.println("Facilitati disponibile: " + String.join(", ", facilitati));
    }

    public void calculeazaPretCamera() {
        switch (numarStele) {
            case 1:
                System.out.println("Pretul unei camere la hotelul " + nume + " este 100 ron pe noapte.");
                break;
            case 2:
                System.out.println("Pretul unei camere la hotelul " + nume + " este 200 ron pe noapte.");
                break;
            case 3:
                System.out.println("Pretul unei camere la hotelul " + nume + " este 300 ron pe noapte.");
                break;
            default:
                System.out.println("Clasificare necunoscuta, nu se poate calcula pretul.");
        }
    }
}
