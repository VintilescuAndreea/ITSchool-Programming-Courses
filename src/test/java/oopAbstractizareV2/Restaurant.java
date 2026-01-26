package oopAbstractizareV2;

public abstract class Restaurant {

    private String nume;
    private String adresa;
    private int telefon;

    // sunt obligat sa le am pe toate si sa nu pot sa fac separarea ca la interfete => in clasele de bucatarie sunt obligat sa
    // le implementez pe toate chiar daca nu le folosesc pe toate
    public abstract void servesteFriptura();
    public abstract void servesteCiorba();
    public abstract void servesteCostite();
    public abstract void servestePaste();

    public abstract void servesteHummus();
    public abstract void servesteFalafel();
    public abstract void servesteSalata();



}

/* Recunoastem o clasa abstracta dupa cuvantul cheie "abstract" in definitia clasei.
   O clasa abstracta POATE contine atat metode abstracte (fara implementare), cat si metode concrete (cu implementare).
   O clasa care mosteneste o clasa abstracta trebuie sa furnizeze implementarea pentru toate metodele abstracte definite in clasa abstracta,
   cu exceptia cazului in care clasa derivata este si ea declarata ca fiind abstracta.
   O clasa abstracta poate avea un constructor, dar nu poate fi instantiata direct => nu putem crea obiecte dintr-o clasa abstracta.

*/
