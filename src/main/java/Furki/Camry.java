package Furki;

import lombok.Getter;

/**
 * Klasa reprezentująca samochód Camry.
 */
public class Camry {
    @Getter
    /**
     * Model samochodu Camry.
     */
    private String model;

    /**
     * Tworzy nowy obiekt typu Camry o podanym modelu.
     *
     * @param model model samochodu Camry
     */
    public Camry(String model) {
        this.model = model;
    }

    /**
     * Uruchamia silnik samochodu Camry i wyświetla komunikat.
     */
    public void startEngine() {
        System.out.println("Camry " + model + ": Włączam silnik.");
    }

    /**
     * Zwiększa obroty silnika samochodu Camry do określonej wartości RPM i wyświetla komunikat.
     *
     * @param rpm wartość obrotów do osiągnięcia
     */
    public void gas(int rpm) {
        System.out.println("Camry " + model + ": Kręcenie do " + rpm + " RPM.");
    }

    /**
     * Wyłącza silnik samochodu Camry i wyświetla komunikat.
     */
    public void stopEngine() {
        System.out.println("Camry " + model + ": Wyłączam silnik.");
    }
}
