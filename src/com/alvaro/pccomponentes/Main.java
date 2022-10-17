package com.alvaro.pccomponentes;

public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando...");


        Procesador amd = new Procesador();
        /**
        * Codigo a ejecutar por un administrativo de la empresa
         * Codigo para introducir información de procesadores
         */
        amd.setId(1);
        amd.setMarca("Raizen 6400");
        amd.setFabricante("AMD");

        System.out.println(amd.getId());
        System.out.println(amd.getMarca());
        System.out.println(amd.getFabricante());

        PlacaBase asus = new PlacaBase();

        asus.setId(2);
        asus.setMarca("B550-Plus");
        asus.setFabricante("asus");

        System.out.println(asus.getId());
        System.out.println(asus.getMarca());
        System.out.println(asus.getFabricante());

    }
}