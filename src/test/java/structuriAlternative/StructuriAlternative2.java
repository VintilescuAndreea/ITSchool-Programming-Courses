package structuriAlternative;

import org.testng.annotations.Test;

public class StructuriAlternative2 {

    @Test

    public void testMetod(){
        determinareNumarPar(4);
    }


    //  Verificam daca un numar este par si pozitiv
    public void determinareNumarPar(int numar){
        if(numar%2==0 && numar > 0){
            System.out.println("Numarul " + numar + " este par si pozitiv.");
        } else if(numar%2==0 && numar < 0) {
            System.out.println("Numarul " + numar + " este par si negativ.");
        } else if (numar%2 != 0  && numar > 0) {
            System.out.println("Numarul " + numar + " este impar si pozitiv.");
        } else if (numar%2 != 0  && numar < 0) {
            System.out.println("Numarul " + numar + " este impar si negativ.");
        } else
            System.out.println("Numarul introdus este invalid");
    }

    /* sau puteam scrie :
    if ( numar >0) {
        if(numar %2 == 0 )
            {System.out.println("Numarul " + numar + " este par si pozitiv.");}
        } else {
            System.out.println("Numarul " + numar + " este impar si pozitiv.");}
    if ( numar < 0 ) {....
     */

}
