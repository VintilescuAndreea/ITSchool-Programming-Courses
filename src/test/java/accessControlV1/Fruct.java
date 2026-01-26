package accessControlV1;

public class Fruct {

    public void metodaPublica(){}
    private void metodaPrivata(){}
    protected void metodaProtected(){}
    void metodaDefault(){}

}

/* Cunoastem 4 modificatori de acces in Java:
   1. public - accesibil de oriunde
   2. protected - accesibil in acelasi pachet si in subclase
   3. default (fara specificator) - accesibil doar in acelasi pachet
   4. private - accesibil doar in cadrul aceleiasi clase

   Sunt reprezentati de 2 categorii:
   1. cand vine vorba de mostenire ( in acelasi pacjet/in pachete diferite)
   2. cand vine vorba de obiecte ( in acelasi pachet/in pachete diferite)

   1a.In cazul mostenirii unei clase, in cadrul aceluiasi pachet, modificatorul private nu este mostenit.
   => clasa copil are acces la metodele publice, protected si default ale clasei parinte.

   1b.In cazul mostenirii unei clase, in pachete diferite, modificatorul private si default nu sunt mostenite.
   => clasa copil are acces la metodele publice si protected ale clasei parinte.

   2a. In cazul accesarii unei clase prin intermediul unui obiect, in cadrul aceluiasi pachet, modificatorul private nu este accesibil.
    => obiectul are acces la metodele publice, protected si default ale clasei.

    2b. In cazul accesarii unei clase prin intermediul unui obiect, in pachete diferite, modificatorul private, protected si default nu sunt accesibile.
    => obiectul are acces doar la metodele publice ale clasei.
*/