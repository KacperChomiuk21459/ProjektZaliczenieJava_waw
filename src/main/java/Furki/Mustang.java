package Furki;

import lombok.Getter;

/**
 * Klasa reprezentująca samochód Mustang.
 */
public class Mustang {
    @Getter
    /**
     * Model samochodu Mustang.
     */
    private String model;

    /**
     * Tworzy nowy obiekt typu Mustang o podanym modelu.
     *
     * @param model model samochodu Mustang
     */
    public Mustang(String model) {
        this.model = model;
    }

    /**
     * Uruchamia silnik samochodu Mustang i wyświetla komunikat.
     */
    public void startEngine() {
        System.out.println("Mustang " + model + ": Włączam silnik.");
    }

    /**
     * Zwiększa obroty silnika samochodu Mustang do określonej wartości RPM i wyświetla komunikat.
     *
     * @param rpm wartość obrotów do osiągnięcia
     */
    public void gas(int rpm) {
        System.out.println("Mustang " + model + ": Kręcenie do " + rpm + " RPM.");
    }

    /**
     * Wyłącza silnik samochodu Mustang i wyświetla komunikat.
     */
    public void stopEngine() {
        System.out.println("Mustang " + model + ": Wyłączam silnik.");
    }
}
