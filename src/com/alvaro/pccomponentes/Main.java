package com.alvaro.pccomponentes;

public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando...");

//Procesador
        Procesador amd = new Procesador();
        amd.setId(1);
        amd.setMarca("Raizen 6400");
        amd.setFabricante("AMD");

        System.out.println(amd.getId());
        System.out.println(amd.getMarca());
        System.out.println(amd.getFabricante());
//PlacaBase
        PlacaBase asus = new PlacaBase();
        asus.setId(2);
        asus.setMarca("B550-Plus");
        asus.setFabricante("asus");

        System.out.println(asus.getId());
        System.out.println(asus.getMarca());
        System.out.println(asus.getFabricante());
//MemoriaRam
        MemoriaRam kinston = new MemoriaRam();
        kinston.setId(3);
        kinston.setMarca("fury");
        kinston.setFabricante("Kinston");

        System.out.println(kinston.getId());
        System.out.println(kinston.getMarca());
        System.out.println(kinston.getFabricante());
//Torre
        Torre corsair = new Torre();
        corsair.setId(4);
        corsair.setMarca("icue 220t");
        corsair.setFabricante("corsair");

        System.out.println(corsair.getId());
        System.out.println(corsair.getMarca());
        System.out.println(corsair.getFabricante());
//Ventilador
        Ventilador tempest = new Ventilador();
        tempest.setId(5);
        tempest.setMarca("Liquid Cooler");
        tempest.setFabricante("tempest");

        System.out.println(tempest.getId());
        System.out.println(tempest.getMarca());
        System.out.println(tempest.getFabricante());
//DiscoDuro
        DiscoDuro segate = new DiscoDuro();
        segate.setId(6);
        segate.setMarca("Iron wolf");
        segate.setFabricante("segate");

        System.out.println(segate.getId());
        System.out.println(segate.getMarca());
        System.out.println(segate.getFabricante());
//FuenteAlimentacion
        FuenteDeAlimentacion fuente = new FuenteDeAlimentacion();
        fuente.setId(7);
        fuente.setMarca("750W");
        fuente.setFabricante("Nfortec");

        System.out.println(fuente.getId());
        System.out.println(fuente.getMarca());
        System.out.println(fuente.getFabricante());
//TarjetaGrafica
        TarjetaGrafica nvidia = new TarjetaGrafica();
        nvidia.setId(8);
        nvidia.setMarca("3060 Ti");
        nvidia.setFabricante("nvidia");

        System.out.println(nvidia.getId());
        System.out.println(nvidia.getMarca());
        System.out.println(nvidia.getFabricante());
//TarjetaSonido
        TarjetaSonido sound = new TarjetaSonido();
        sound.setId(9);
        sound.setMarca("blaster 5.1");
        sound.setFabricante("sound");

        System.out.println(sound.getId());
        System.out.println(sound.getMarca());
        System.out.println(sound.getFabricante());
//GrabadoraDVD
        GrabadorDVD philips = new GrabadorDVD();
        philips.setId(10);
        philips.setMarca("52xz");
        philips.setFabricante("philips");

        System.out.println(philips.getId());
        System.out.println(philips.getMarca());
        System.out.println(philips.getFabricante());
//Monitor
        Monitor acer = new Monitor();
        acer.setId(11);
        acer.setMarca("24PXZ");
        acer.setFabricante("acer");

        System.out.println(acer.getId());
        System.out.println(acer.getMarca());
        System.out.println(acer.getFabricante());
//Teclado
        Teclado logitech = new Teclado();
        asus.setId(12);
        asus.setMarca("k220");
        asus.setFabricante("logitech");

        System.out.println(logitech.getId());
        System.out.println(logitech.getMarca());
        System.out.println(logitech.getFabricante());
//Raton
        Raton mouse = new Raton();
        mouse.setId(13);
        mouse.setMarca("B100");
        mouse.setFabricante("logitech");

        System.out.println(mouse.getId());
        System.out.println(mouse.getMarca());
        System.out.println(mouse.getFabricante());
//Altavoces
        Altavoces speeker = new Altavoces();
        speeker.setId(14);
        speeker.setMarca("2.0 500W");
        speeker.setFabricante("Logitech");

        System.out.println(speeker.getId());
        System.out.println(speeker.getMarca());
        System.out.println(speeker.getFabricante());
    }
}