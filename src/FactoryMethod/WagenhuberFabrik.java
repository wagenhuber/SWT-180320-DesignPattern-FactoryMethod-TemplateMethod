package FactoryMethod;

public class WagenhuberFabrik extends BrotzeitFabrik {



    @Override
    public Brotzeit createBrotzeit() {
        return new Bier();
    }

}
