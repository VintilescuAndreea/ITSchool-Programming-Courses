package oopMostenire;


public class Angajat extends Persoana implements AngajatInterface {

    private String firma;
    private double salariu;
    private String contract;
    private int zileLibere;

    public Angajat( String nume, String prenume, int varsta, String adresa , String firma, double salariu, String contract, int zileLibere){
        super(nume, prenume, varsta, adresa);
        this.firma = firma;
        this.salariu = salariu;
        this.contract = contract;
        this.zileLibere = zileLibere;
    }

    public void informatiiAngajat(){
        informatiiPersoana();
        System.out.println("Firma angajatului este " + firma);
        System.out.println("Salariul angajatului este " + salariu);
        System.out.println("Contractul angajatului este " + contract);
        System.out.println("Zilele libere ale angajatului sunt " + zileLibere);
    }
    // Polimorfism dinamic

    @Override
    public void mananca() {
        System.out.println(" Angajatul  mananca in pauza de masa la birou.");
    }

    // Polimorfism static - metoda fara parametrii

    public void afiseazaDetalii(){
        System.out.println("Afisez toti angajatii companiei " + firma);
    }

    public void afiseazaDetalii(String firma){
        System.out.println("Afisez angajatii din compania" + firma);
    }

    public void afiseazaDetalii(String firma, boolean contract){
        System.out.println("Afisez angajatii din compania " + firma + " cu contract " + contract);
    }

    // Metode getter si setter
    public String getFirma() {
        return firma;
    }

    public double getSalariu() {
        return salariu;
    }

    public String getContract() {
        return contract;
    }

    public int getZileLibere() {
        return zileLibere;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public void setZileLibere(int zileLibere) {
        this.zileLibere = zileLibere;
    }

    @Override
    public void ajungeLaTimp() {
        System.out.println(" Angajatul trebuie sa ajunga la timp la munca intre orele 8:00-10:00.");
    }

    @Override
    public void munceste() {
        System.out.println(" Angajatul munceste 8 ore pe zi la birou.");
    }

    @Override
    public void iaPauza() {
        System.out.println(" Angajatul ia pauza de masa intre orele 12:00-14:00.");
    }
}

