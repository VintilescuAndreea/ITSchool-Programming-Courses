package oopMostenire;

public class AngajatSportiv extends Persoana implements AngajatInterface, SportivInterface {

    private String firma;
    private double salariu;
    private String contract;
    private int zileLibere;

    private String sport;
    private String echipa;
    private int numarTricou;

    public AngajatSportiv(String nume, String prenume, int varsta, String adresa, String firma, double salariu, String contract,
                          int zileLibere, String sport, String echipa, int numarTricou) {
        super(nume, prenume, varsta, adresa);
        this.firma = firma;
        this.salariu = salariu;
        this.contract = contract;
        this.zileLibere = zileLibere;
        this.sport = sport;
        this.echipa = echipa;
        this.numarTricou = numarTricou;
    }

    @Override
    public void ajungeLaTimp() {
        System.out.println(" Angajatul sportiv ajunge la timp la munca si la antrenamente.");
    }

    @Override
    public void munceste() {
        System.out.println(" Angajatul sportiv munceste eficient la firma sa.");
    }

    @Override
    public void iaPauza() {
        System.out.println(" Angajatul sportiv ia pauza pentru a se odihni si a se pregati pentru antrenament.");
    }

    @Override
    public void participaLaAntrenament() {
        System.out.println(" Angajatul sportiv participa la antrenament in fiecare zi dupa munca.");
    }

    @Override
    public void concureaza() {
        System.out.println(" Angajatul sportiv concureaza in competitii in weekend.");
    }

    @Override
    public void seRecupereaza() {
        System.out.println(" Angajatul sportiv se recupereaza dupa antrenamente si competitii.");
    }
}
