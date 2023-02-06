package it.roofsense;

import it.roofsense.model.Roof;

public class App {
    public static void main(String[] args) {
        final Roof layer = new Roof("Titolo roof");
        System.out.println(layer.getName());
    }
}
