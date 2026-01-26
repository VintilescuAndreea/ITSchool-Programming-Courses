package structuriAlternative;

import org.testng.annotations.Test;

public class StructuriAlternative {

    /* Exista 2 tupuri de structuri: alternative si repetitive.
     Structurile alternative sunt cele care permit executarea unui cod in functie de o conditie.
     Structurile repetitive sunt cele care permit executarea unui cod de mai multe ori, atata timp cat o conditie este adevarata.

     Structurile alternative:
     - if
     - if...else
     - if...else if...else
     - switch...case
     - operator ternar ( ? : )

     */

    @Test
    public void metodaTest() {
//        verificaPersoanaMajora(15);
//        verificaPersoanaMajora(21);
//        verificareNumarParImpar(21);
//        estePozitivSiDivizibil(21);
          zileleSpatamanii(5);
//        System.out.println("Testul s-a terminat");
    }

    public void verificaPersoanaMajora(int varsta) {
        if (varsta>=18) {
            System.out.println("Persoana are varsta de "+ varsta+ " ani si este majora.");
        } else {
            System.out.println("Persoana are varsta de "+ varsta+ " ani si este minora.");
        }

    }
    public void verificareNumarParImpar(int numar) {
        if (numar % 2 == 0) {
            System.out.println("Numarul " + numar + " este par.");
        } else {
            System.out.println("Numarul " + numar + " este impar.");
        }
    }

    public void estePozitivSiDivizibil(int numar) {
        if (numar > 0 && numar % 5 == 0) {
            System.out.println("Numarul " + numar + " este pozitiv si divizibil cu 5.");
        } else if (numar > 0 && numar % 5 != 0) {
            System.out.println("Numarul " + numar + " este pozitiv, dar nu este divizibil cu 5.");
        } else if (numar < 0 && numar % 5 == 0){
                System.out.println("Numarul " + numar + " nu este pozitiv, dar este divizibil cu 5.");
        } else {
            System.out.println("Numarul " + numar + " nu este pozitiv si nu este divizibil cu 5.");
        }

        }

    public void zileleSpatamanii(int ziua)  {
        switch (ziua) {
            case 1:
                System.out.println("Astazi este luni.");
                break;
            case 2:
                System.out.println("Astazi este marti.");
                break;
            case 3:
                System.out.println("Astazi este miercuri.");
                break;
            case 4:
                System.out.println("Astazi este joi.");
                break;
            case 5:
                System.out.println("Astazi este vineri.");
                break;
            case 6:
                System.out.println("Astazi este sambata.");
                break;
            case 7:
                System.out.println("Astazi este duminica.");
                break;
            default:
                System.out.println("Ziua nu este valida.");
        }
    }

}

/* intrebari interviu:
If se focuseaza pe conditii si switch pe valori. Cu switch nu putem evalua conditii de nr pare etc si este mai scurt decat o serie lunga de if.
La if compilatorul verifica fiecare conditia pas cu pas, la switch se sare direct la cazul care corespunde. Deci e o diferenta de performanta.

 */