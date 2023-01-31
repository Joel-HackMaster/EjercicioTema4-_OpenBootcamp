package com.ejercicioTema4;

public abstract class SmartDevice {
    protected String fabricante;
    protected String color;
    protected int nBotones;
    protected String tipoDeCarga;
    protected Double tamHorizontalPantalla;
    protected  Double tamVerticalPantalla;

    protected Double tamPantalla = null;

    public SmartDevice(){
    }

    public  SmartDevice(String fabricante, String color, int nBotones, String tipoDeCarga){
        this.fabricante = fabricante;
        this.color = color;
        this.nBotones = nBotones;
        this.tipoDeCarga = tipoDeCarga;
    }
    public SmartDevice(String fabricante, String color, int nBotones, String tipoDeCarga, Double tamHorizontalPantalla, Double tamVerticalPantalla){
        this.fabricante = fabricante;
        this.color = color;
        this.nBotones = nBotones;
        this.tipoDeCarga = tipoDeCarga;
        this.tamHorizontalPantalla = tamHorizontalPantalla*0.3937;
        this.tamVerticalPantalla = tamVerticalPantalla*0.3937;
    }

    public void resolucionPantalla(){
        Double pantalla = Math.pow(this.tamVerticalPantalla,2) + Math.pow(this.tamHorizontalPantalla,2);
        Double raiz = Math.sqrt(pantalla);
        raiz = Math.round(raiz*100)/100.0;
        this.tamPantalla = raiz;
    }
}
