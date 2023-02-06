package it.roofsense.model;

import java.util.HashSet;
import java.util.Set;

public class Roof {
    private String name;
    private final Set<Layer> layers;

    public Roof(final String name) {
        this.name = name;
        this.layers = new HashSet<>();
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }

    public final Set<Layer> getLayers() {
        return this.layers;
    }
}
