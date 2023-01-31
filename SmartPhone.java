package com.ejercicioTema4;

public class SmartPhone extends SmartDevice{
    protected String procesadorPhone;
    protected int cantRam; // GB
    protected int duracionbateriaPhone; //horas
    public SmartPhone(){
    }
    public SmartPhone(String fabricante, String color, int nBotones, String tipoDeCarga, Double tamHorizontalPantalla, Double tamVerticalPantalla, String procesadorPhone, int cantRam, int duracionbateriaPhone){
        super(fabricante, color, nBotones, tipoDeCarga, tamHorizontalPantalla, tamVerticalPantalla);
        this.procesadorPhone = procesadorPhone;
        this.cantRam = cantRam;
        this.duracionbateriaPhone = duracionbateriaPhone;
    }
    public SmartPhone(String fabricante, String color, int nBotones, String tipoDeCarga){
        super(fabricante, color, nBotones, tipoDeCarga);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "procesadorPhone='" + procesadorPhone + '\'' +
                ", cantRam=" + cantRam +
                ", duracionbateriaPhone=" + duracionbateriaPhone +
                ", fabricante='" + fabricante + '\'' +
                ", color='" + color + '\'' +
                ", nBotones=" + nBotones +
                ", tipoDeCarga='" + tipoDeCarga + '\'' +
                ", tamHorizontalPantalla=" + tamHorizontalPantalla +
                ", tamVerticalPantalla=" + tamVerticalPantalla +
                ", tamPantalla=" + tamPantalla +
                '}';
    }
}
