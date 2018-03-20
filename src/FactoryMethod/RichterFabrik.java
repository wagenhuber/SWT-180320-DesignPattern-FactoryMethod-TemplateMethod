package FactoryMethod;

public class RichterFabrik extends BrotzeitFabrik {

    @Override
    public Brotzeit createBrotzeit() {
        return new CeasarSalad();

    }


}
