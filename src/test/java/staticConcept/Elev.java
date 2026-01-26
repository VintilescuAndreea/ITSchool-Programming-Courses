package staticConcept;

public class Elev {
    public String nume;
    public String prenume;
    public int varsta;
    public static String scoala = "Scoala Nr.1";
    public static int indexEcuson=0;


    public Elev(String prenume, int varsta, String nume) {
        this.prenume = prenume;
        this.nume = nume;
        this.varsta = varsta;
        indexEcuson++;

    }

    public void prezentareElev() {
        System.out.println("Elevul se numeste " + prenume + " " + nume
                + ", are varsta de " + varsta + " ani si invata la scoala " + scoala + ".");
    }

    public void calculareEcuson(){
        System.out.println("Numarul total de elevi cu ecuson este: " + indexEcuson);
    }
}
