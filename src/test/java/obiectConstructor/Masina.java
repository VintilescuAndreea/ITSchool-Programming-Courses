package obiectConstructor;

/*       - CONSTRUCTORI -
   Constructorul are rolul de a initializa variabilele unei clase. Cu alte cuvinte, el stabileste valorile de pornire ale proprietatilor unui obiect.
   Cum recunoastem un constructior?
   - Numele constructorului este intotdeauna la fel ca numele clasei.
    - Nu are modificator de acces (public, private, protected), insa de cele mai multe ori este declarat public pentru a putea fi accesat din alte clase.
   - Nu are tip de returnare, nici macar void.
    - Poate avea parametri, dar nu este obligatoriu.
   Intr-o clasa putem avea mai multi constructori, cu diferiti parametri (supraincarcare de constructori).Acestia se deosebesc prin lista de parametri (tipul si/sau numarul acestora).
   Daca nu definim niciun constructor, Java va crea unul default, fara parametri. Daca definim macar un constructor, Java nu va mai crea unul default.
    //Un constructor poate apela alt constructor din aceeasi clasa folosind cuvantul cheie this(), dar acest apel trebuie sa fie prima linie din constructor.???
    Vom folosi cuvantul cheie "this."  pentru a ne referi la variabilele de instanta ale clasei atunci cand numele parametrilor constructorului sunt aceleasi cu numele variabilelor de instanta.
    Constructorii pot fi de 2 tipuri: constructori cu parametri si constructori fara parametri (default).
    Constructorii fara parametri sunt folositi pentru a crea obiecte cu valori implicite, in timp ce constructorii cu parametri permit initializarea obiectelor cu valori specifice la momentul crearii.
    Daca o clasa nu are definit niciun constructor, Java va furniza un constructor implicit fara parametri.
    Constructorii nu pot fi mosteniti, dar o clasa copil poate apela constructorul clasei parinte folosind cuvantul cheie super().

          - OBIECTE -
    Un obiect este o instanta a unei clase. El reprezinta o entitate concreta care are starea (atributele) si comportamentul (metodele) definite de clasa din care face parte.
    Intr-o clasa putem crea mai multe obiecte, fiecare avand propriile valori pentru atribute.
    Pentru a crea un obiect, folosim cuvantul cheie new urmat de apelul constructorului. Obiectele se diferentiaza prin numele lor, care trebuie sa fie unic in cadrul aceleiasi clase.
    Sintaxa generala pentru crearea unui obiect este:
    NumeClasa numeObiect = new NumeClasa(parametriConstructor);

    Dupa ce un obiect este creat, putem accesa atributele si metodele sale folosind operatorul punct (.). De exemplu:
    numeObiect.atribut = valoare;
    numeObiect.metoda(parametri);
 */


import java.util.List;

public class Masina {

    public String marca;
    public String model;
    public int anFabricatie;
    public String culoare;
    public int pret;
    public int pretFinat;


    public List<String> dotariInterioare;
    public boolean esteElectrica;

    public Masina(String model, int anFabricatie, String culoare, List<String> dotariInterioare, boolean esteElectrica, String marca) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.culoare = culoare;
        this.dotariInterioare = dotariInterioare;
        this.esteElectrica = esteElectrica;
        this.marca = marca;
    }

    public Masina(String marca, String model, String culoare, int anFabricatie, int pret, boolean esteElectrica, List<String> dotariInterioare) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.anFabricatie = anFabricatie;
        this.pret = pret;
        this.esteElectrica = esteElectrica;
        this.dotariInterioare = dotariInterioare;
    }

    public void prezentareMasina() {
        System.out.println("Masina este marca " + marca + ", model " + model + ", fabricata in anul " + anFabricatie + ", de culoare " + culoare + ".");

        if (esteElectrica) {
            System.out.println("Este o masina electrica.");
        } else {
            System.out.println("Nu este o masina electrica.");
        }
        System.out.println("Dotari interioare: " + String.join(", ", dotariInterioare));

        for (int i = 0; i < dotariInterioare.size(); i++) {
            System.out.println("Dotarea interioara " + (i + 1) + " este: " + dotariInterioare.get(i));
        }
        if (pret != 0) {
            calculPret();
        }

    }


    /* Ex1: Determinam impozitul in functie de anul de fabricatie
        Daca masina este fabricata inainte de 2000, impozitul este 100 euro
        Daca masina este fabricata intre 2005 si 2015, impozitul este 200 euro
        Daca masina este fabricata dupa 2015, impozitul este 50 euro.
    */
    public void calculImpozit() {
        if (anFabricatie < 2000) {
            System.out.println("Impozitul este 100 Euro.");
        } else if (anFabricatie >= 2005 && anFabricatie <= 2015) {
            System.out.println("Impozitul este 200 Euro.");
        } else if (anFabricatie > 2015) {
            System.out.println("Impozitul este 50 Euro.");
        } else {
            System.out.println("Anul de fabricatie nu se incadreaza in niciuna din categoriile specificate.");
        }
    }

    public void calculPret(){

        if (pret != 0) {
            System.out.println("Pretul masinii este: " + pret + " Euro.");
        }
        if(dotariInterioare.isEmpty()){
            System.out.println("Masina nu are dotari interioare.");
        } else {
            int dotari = 0;
            for (int i = 0; i < dotariInterioare.size(); i++) {
                switch (dotariInterioare.get(i)) {
                    case "Scaune incalzite":
                        dotari += 1000;
                        break;
                    case "Sistem de navigatie":
                        dotari += 2000;
                        break;
                    case "Pilot automat":
                        dotari += 1500;
                        break;
                    case "Aer conditionat":
                        dotari += 800;
                        break;
                    case "Bluetooth":
                        dotari += 600;
                        break;
                    case "Geamuri electrice":
                        dotari += 400;
                        break;
                    case "Sistem audio":
                        dotari += 1200;
                        break;
                    default:
                        System.out.println("Dotarea " + dotariInterioare.get(i) + " nu are pret definit.");
                }

            }
            pretFinat = pret + dotari;
            System.out.println("Pretul final al masinii este: " + pretFinat + " Euro.");

        }

    }
}


