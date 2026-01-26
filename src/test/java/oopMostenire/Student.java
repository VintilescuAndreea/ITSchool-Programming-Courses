package oopMostenire;

public class Student extends Persoana implements StudentInterface{


    private String facultate;
    private String domeniu;
    private int anStudiu;
    private boolean areRestante;

    public Student(String nume, String prenume, int varsta, String adresa, String facultate, String domeniu, int anStudiu, boolean areRestante){
        super(nume, prenume, varsta, adresa);
        this.facultate = facultate;
        this.domeniu = domeniu;
        this.anStudiu = anStudiu;
        this.areRestante = areRestante;
    }

    public void infoStudent(){
        informatiiPersoana();
        System.out.println("Facultatea studentului este " + facultate);
        System.out.println("Domeniul de studiu al studentului este " + domeniu);
        System.out.println("Anul de studiu al studentului este " + anStudiu);
        System.out.println("Studentul are restante?: " + areRestante);
    }

    // Polimorfism dinamic
    @Override
    public void mananca() {
        super.mananca();
        System.out.println(" Studentul mananca in pauza dintre cursuri.");
    }


    // Polimorfist static - metoda cu parametrii

    public void studiaza(){
        System.out.println("Studentul studiaza pentru examene.");
    }

    public void studiaza(String materia){
        System.out.println("Studentul studiaza materia " + materia + " pentru examene.");
    }

    public void cautaStudent(String facultate, String domeniu){
        System.out.println("Caut student la facultatea " + facultate + " de la domeniul " + domeniu);
    }
    // Metode getter si setter
    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public String getDomeniu() {
        return domeniu;
    }

    public void setDomeniu(String domeniu) {
        this.domeniu = domeniu;
    }

    public int getAnStudiu() {
        return anStudiu;
    }

    public void setAnStudiu(int anStudiu) {
        this.anStudiu = anStudiu;
    }

    public boolean isAreRestante() {
        return areRestante;
    }

    public void setAreRestante(boolean areRestante) {
        this.areRestante = areRestante;
    }

    @Override
    public void mergeLaCursuri() {
        System.out.println("Studentul merge la cursuri in fiecare zi lucratoare.");
    }

    @Override
    public void invata() {
        System.out.println("Studentul invata pentru examene in fiecare weekend.");
    }

    @Override
    public void sustineExamene() {
        System.out.println("Studentul sustine examene la sfarsitul fiecarui semestru.");
    }
}
