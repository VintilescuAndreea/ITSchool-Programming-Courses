package oopAbstractizareV1;

public class BucatarieRestaurantNonVegan extends Restaurant implements IRestaurantNonVegan{

    public BucatarieRestaurantNonVegan(String nume, String adresa, int telefon) {
        super(nume, adresa, telefon);
    }

    @Override
    public void servestePaste() {

    }

    @Override
    public void servesteFriptura() {

    }

    @Override
    public void servesteCiorba() {

    }

    @Override
    public void servesteCostite() {

    }
}
