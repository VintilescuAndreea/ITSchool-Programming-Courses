package temeStructuri;

import org.testng.annotations.Test;

import java.util.Arrays;

public class HotelTest {


    @Test
    public void HotelTest() {
        Hotel hotel1 = new Hotel("Marriot", "Str. Libertatii 10", "Bucuresti", "Romania", 5, Arrays.asList("Piscina", "Spa", "Sala de fitness"));
        hotel1.prezentareHotel();
        hotel1.calculeazaPretCamera();
        System.out.println("========================");

        Hotel hotel2 = new Hotel("Continental", "Str. Florilor 5", "Cluj-Napoca", "Romania", 3, Arrays.asList("Mic dejun inclus", "Wi-Fi gratuit"));
        hotel2.prezentareHotel();
        hotel2.calculeazaPretCamera();
        System.out.println("========================");

        Hotel hotel3 = new Hotel("Garoafelor", "Str. Muncii 20", "Iasi", "Romania", 2, Arrays.asList("Parcare gratuita", "Aer conditionat"));
        hotel3.prezentareHotel();
        hotel3.calculeazaPretCamera();
        System.out.println("========================");
    }
}
