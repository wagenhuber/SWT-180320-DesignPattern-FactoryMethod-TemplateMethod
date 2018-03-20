package FactoryMethod;

public abstract class BrotzeitFabrik {

    //Design-Pattern "Factory": Ablauf ist vorgegeben
    public void brotzeitAusliefern() {
        bestellungAufnehmen();
        Brotzeit brotzeit = createBrotzeit();
        ausliefern(brotzeit);
        muellEntsorgen();
    }

    //Design-Pattern "Template Method": Subklasse entscheidet über die kontrkete Implementierung
    //Design-Pattern "Factory": Factory-Methode
    public abstract Brotzeit createBrotzeit();


    private void bestellungAufnehmen() {
        System.out.println("bestellungAufnehmen");
    }


    private void ausliefern(Brotzeit brotzeit) {
        System.out.println("ausliefern: " + brotzeit.toString() );
    }


    private void muellEntsorgen() {
        System.out.println("muellEntsorgen");
    }

}
