package FactoryMethod;

public class FactoryMethodBeispiel {


    public static void main(String[] args) {
        BrotzeitFabrik fabrik = new WagenhuberFabrik();
        fabrik.brotzeitAusliefern();

        BrotzeitFabrik fabrik2 = new RichterFabrik();
        fabrik2.brotzeitAusliefern();

    }

}
