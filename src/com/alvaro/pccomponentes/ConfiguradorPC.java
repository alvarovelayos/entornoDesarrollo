package com.alvaro.pccomponentes;

public class ConfiguradorPC {

    private String id;
    private Procesador procesador;
    private PlacaBase placaBase;

    public void setId(String id) {
        this.id = id;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public String getId() {
        return this.id;
    }

    public Procesador getProcesado() {
        return this.procesador;
    }
}
