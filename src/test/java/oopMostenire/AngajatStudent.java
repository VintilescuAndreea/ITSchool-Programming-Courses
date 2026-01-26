package oopMostenire;


public class AngajatStudent extends Persoana implements AngajatInterface, StudentInterface {

    private String firma;
    private double salariu;
    private String contract;
    private int zileLibere;

    private String facultate;
    private String domeniu;
    private int anStudiu;
    private boolean areRestante;

    public AngajatStudent(String nume, String prenume, int varsta, String adresa, String firma, double salariu,
                          String contract, int zileLibere, String facultate, String domeniu, int anStudiu, boolean areRestante) {
        super(nume, prenume, varsta, adresa);
        this.firma = firma;
        this.salariu = salariu;
        this.contract = contract;
        this.zileLibere = zileLibere;
        this.facultate = facultate;
        this.domeniu = domeniu;
        this.anStudiu = anStudiu;
        this.areRestante = areRestante;
    }

    @Override
    public void ajungeLaTimp() {

    }

    @Override
    public void munceste() {

    }

    @Override
    public void iaPauza() {

    }

    @Override
    public void mergeLaCursuri() {

    }

    @Override
    public void invata() {

    }

    @Override
    public void sustineExamene() {

    }
}
