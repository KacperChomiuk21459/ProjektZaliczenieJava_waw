package Test;

import Furki.Corolla;
import Furki.Camry;
import Furki.Mustang;

/**
 * Klasa odpowiedzialna za uruchamianie silników samochodów i wyświetlanie komunikatów.
 */
public class UpalanieFurek {
    /**
     * Metoda główna, która uruchamia silniki samochodów Mustang, Camry i Corolla.
     *
     * @param args argumenty wiersza poleceń
     */
    public static void main(String[] args) {
        Mustang mustang = new Mustang("GT500");
        mustang.startEngine();
        mustang.gas(8000);
        mustang.stopEngine();

        Camry camry = new Camry("XSE");
        camry.startEngine();
        camry.gas(8000);
        camry.stopEngine();

        Corolla corolla = new Corolla("SE");
        corolla.startEngine();
        corolla.gas(8000);
        corolla.stopEngine();
    }
}
