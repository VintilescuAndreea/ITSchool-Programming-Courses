package oopMostenire;

public class Persoana {

    private String nume;
    private String prenume;
    private int varsta;
    private String adresa;



    public Persoana(String nume, String prenume, int varsta, String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.adresa = adresa;
    }

    public void informatiiPersoana() {
        System.out.println("Numele persoanei este " + nume);
        System.out.println("Prenume persoanei este  " + prenume);
        System.out.println("Varsta persoanei este  " + varsta);
        System.out.println("Adresa persoanei este  " + adresa);
    }


    // Polimorfism dinamic
     public void mananca() {
         System.out.println(prenume + " " + nume + " mananca atunci cand ii este foame.");
     }

    // Metode getter - folositepentru a accesa atributele private
    public String getPrenume() {
        return prenume;
    }

    public String getAdresa() {
        return adresa;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getNume() {
        return nume;
    }

    // Metode setter - folosite pentru a modifica atributele private
    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
/* Cele 4 principii de baza ale programarii orientate pe obiecte (OOP) sunt:

1. Incapsularea (Encapsulation): Acest principiu se refera la ascunderea detaliilor interne ale unui obiect si expunerea doar a
unei interfete publice. Astfel, datele si metodele unui obiect sunt protejate de accesul direct din exterior, ceea ce ajuta la
mentinerea integritatii datelor si la reducerea complexitatii. Incapsularea se realizeaza prin utilizarea modificatorilor de acces
(cum ar fi private, protected si public) pentru a controla vizibilitatea atributelor si metodelor unei clase.

2. Mostenirea (Inheritance): Acest principiu permite crearea de noi clase (subclase - clase copii) care mostenesc proprietatile si comportamentele
 unei clase existente (superclasa- clasei parinte). Prin mostenire, clasa copil preia toate atributele si metodele clasei parinte, putand adauga sau modifica functionalitati
 suplimentare. In momentul in care clasa copil mosteneste clasa parinte, constructorul clasei cpoil trebuie sa apeleze constructorul clasei parinte folosind cuvantul cheie "super()".
 Mostenirea se declara folosind cuvantul cheie "extends".
 !! In Java, o clasa poate mosteni doar o singura clasa (mostenire unica), dar poate implementa mai multe interfete (mostenire multipla prin interfete).

3. Polimorfismul (Polymorphism): Polimorfismul permite obiectelor de diferite clase sa fie tratate ca obiecte ale unei clase comune.
    Acest principiu permite metodei sa se comporte diferit in functie de tipul obiectului care o apeleaza, facilitand astfel flexibilitatea
    si extensibilitatea codului.
    Polimorfismul reprezinta conceptul prin care o metoda poate avea implementari diferite.
    Este de doua tipuri: static (OVERLOAD - la compilare) si dinamic (OVERRIDE - la rulare).

        Polimorfismul dinamic se realizeaza prin suprascrierea (override) metodelor din clasa parinte in clasa copil. O metoda poate
        avea implementari diferite. Suprascrierea se face folosind anotarea @Override deasupra metodei din clasa copil.
        Acesta se regaseste doar atunci cand exista mostenire intre clase.

        Polimorfismul static se realizeaza prin supraincarcarea (overload) metodelor in cadrul aceleiasi clase.



4. Abstracția (Abstraction): Abstracția se refera la procesul de a simplifica complexitatea prin ascunderea detaliilor neesențiale si
    expunerea doar a caracteristicilor relevante ale unui obiect. Acest principiu ajuta la crearea de modele conceptuale care sunt mai usor
    de inteles si de utilizat.

    Abstractizarea este de doua tipuri: prin clase abstracte si prin interfete.
    Abstractizarea prin clase abstracte se realizeaza prin crearea unei clase care nu poate fi instantiata direct, ci doar extinsa de alte clase.
    Clasele abstracte pot contine metode abstracte (fara implementare) si metode concrete (cu implementare).

    -- predat de el:

    Abstractizarea se refera la conceptul prin care putem defini comportamentul unei clase. Abstractizarea se poate face prin doua feluri:
    1. Clase abstracte - o clasa care nu poate fi instantiata direct, ci doar extinsa de alte clase. O clasa abstracta poate contine metode abstracte (fara implementare) si metode concrete (cu implementare).
    2. Interfete - o interfata este un tip special de clasa care contine doar metode abstracte (fara implementare=> metodele nu au body) si constante.  O clasa poate implementa mai multe interfete, dar poate extinde doar o singura clasa.
    Toate metodele abstracte sunt publice. Intr o interfata putem defini metodele cu void sau return. Intr o interfata nu putem avea un constructor -> nu putem face un obiect.
    Interfata se implementeaza - o interfata se implementeaza si o clasa se mosteneste.
    Clasa care imlementeaza o interfata trebuie sa implementeze toate metodele din interfata. O clasa poate implememta mai multe interfete.
    O interfata poate mosteni o alta interfata folosind cuvantul cheie "extends", iar " implements" se foloseste pentru a implementa o interfata intr o clasa.


 */

/*
 Utilizarea metodelor getter si setter specifice atributelor private ale unei clase pt. principiul incapsularii:

    Metodele getter sunt utilizate pentru a accesa valorile atributelor private ale unei clase din exteriorul acesteia.
 Aceste metode sunt folosite pentru a obtine (a "primi") valoarea unui atribut fara a permite accesul direct la acesta.
 Metodele getter sunt de obicei publice si au un nume care incepe cu "get", urmat de numele atributului cu prima litera majuscula.

 Exemplu de metoda getter:
 public String getNume() {
     return nume;
 }

 Metodele setter sunt utilizate pentru a modifica valorile atributelor private ale unei clase din exteriorul acesteia.
 Aceste metode permit setarea (a "stabili") unei noi valori pentru un atribut, oferind astfel un control asupra modului in care
 valorile sunt modificate. Metodele setter sunt de obicei publice si au un nume care incepe cu "set", urmat de numele atributului
 cu prima litera majuscula.

 Exemplu de metoda setter:
 public void setNume(String nume) {
     this.nume = nume;
 }

 Utilizarea metodelor getter si setter este o practica comuna in programarea orientata pe obiecte, deoarece ajuta la mentinerea
 incapsularii si la protejarea integritatii datelor unui obiect.
 */