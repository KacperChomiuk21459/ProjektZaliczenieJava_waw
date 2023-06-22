package Furki;

import lombok.Getter;

/**
 * Klasa reprezentująca samochód Corolla.
 */
public class Corolla {
    @Getter
    /**
     * Model samochodu Corolla.
     */
    private String model;

    /**
     * Tworzy nowy obiekt typu Corolla o podanym modelu.
     *
     * @param model model samochodu Corolla
     */
    public Corolla(String model) {
        this.model = model;
    }

    /**
     * Uruchamia silnik samochodu Corolla i wyświetla komunikat.
     */
    public void startEngine() {
        System.out.println("Corolla " + model + ": Włączam silnik.");
    }

    /**
     * Zwiększa obroty silnika samochodu Corolla do określonej wartości RPM i wyświetla komunikat.
     *
     * @param rpm wartość obrotów do osiągnięcia
     */
    public void gas(int rpm) {
        System.out.println("Corolla " + model + ": Kręcenie do " + rpm + " RPM.");
    }

    /**
     * Wyłącza silnik samochodu Corolla i wyświetla komunikat.
     */
    public void stopEngine() {
        System.out.println("Corolla " + model + ": Wyłączam silnik.");
    }
}
