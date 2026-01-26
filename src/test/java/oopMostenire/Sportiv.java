package oopMostenire;

public class Sportiv extends Persoana implements SportivInterface{


    private String sport;
    private String echipa;
    private int numarTricou;

    public Sportiv(String nume, String prenume, int varsta, String adresa, String sport, String echipa, int numarTricou){
        super(nume, prenume, varsta, adresa);
        this.sport = sport;
        this.echipa = echipa;
        this.numarTricou = numarTricou;
    }

    public void informatiiSportiv(){
        informatiiPersoana();
        System.out.println("Sportul practicat de sportiv este " + sport);
        System.out.println("Echipa sportivului este " + echipa);
        System.out.println("Numarul tricoului sportivului este " + numarTricou);
    }


    // Polimorfism dinamic
    @Override
    public void mananca() {
        System.out.println(" Sportivul mananca intre antrenamente.");
    }

    // Metode getter si setter
    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getEchipa() {
        return echipa;
    }

    public void setEchipa(String echipa) {
        this.echipa = echipa;
    }

    public int getNumarTricou() {
        return numarTricou;
    }

    public void setNumarTricou(int numarTricou) {
        this.numarTricou = numarTricou;
    }

    @Override
    public void participaLaAntrenament() {
        System.out.println(" Sportivul participa la antrenament in fiecare zi.");
    }

    @Override
    public void concureaza() {
        System.out.println(" Sportivul concureaza in competitii saptamanal.");
    }

    @Override
    public void seRecupereaza() {
        System.out.println(" Sportivul se recupereaza dupa antrenamente si competitii.");
    }
}
