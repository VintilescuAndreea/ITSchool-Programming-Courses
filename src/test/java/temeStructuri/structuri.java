package temeStructuri;

import org.testng.annotations.Test;

public class structuri {

    @Test
    public void metodaTest2() {
        estePozitivSiDivizibil(10); // true
        estePozitivSiDivizibil(-10); // false
        estePozitivSiDivizibil(7); // false
        estePozitivSiDivizibil(0); // false
    }
    // Verificăm dacă un număr este pozitiv și divizibil cu 5.

    public boolean estePozitivSiDivizibil(int numar) {
        if (numar > 0 && numar % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
