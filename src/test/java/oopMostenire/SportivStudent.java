package oopMostenire;

public class SportivStudent extends Persoana implements SportivInterface, StudentInterface {

    private String sport;
    private String echipa;
    private int numarTricou;

    private String facultate;
    private String domeniu;
    private int anStudiu;
    private boolean areRestante;

    public SportivStudent(String nume, String prenume, int varsta, String adresa, String sport, String echipa, int numarTricou,
                          String facultate, String domeniu, int anStudiu, boolean areRestante){
        super(nume, prenume, varsta, adresa);
        this.sport = sport;
        this.echipa = echipa;
        this.numarTricou = numarTricou;
        this.facultate = facultate;
        this.domeniu = domeniu;
        this.anStudiu = anStudiu;
        this.areRestante = areRestante;
    }

    @Override
    public void participaLaAntrenament() {
        System.out.println(" Sportivul student participa la antrenament in fiecare zi.");
    }

    @Override
    public void concureaza() {
        System.out.println(" Sportivul student concureaza in competitii saptamanal.");
    }

    @Override
    public void seRecupereaza() {
        System.out.println(" Sportivul student se recupereaza dupa antrenamente.");
    }

    @Override
    public void mergeLaCursuri() {
        System.out.println(" Sportivul student merge la cursuri in timpul saptamanii.");
    }

    @Override
    public void invata() {
        System.out.println(" Sportivul student invata pentru examene in timpul liber.");
    }

    @Override
    public void sustineExamene() {
        System.out.println(" Sportivul student sustine examene la sfarsitul semestrului.");
    }
}
