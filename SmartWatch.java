package com.ejercicioTema4;

public class SmartWatch extends SmartDevice {
    boolean SensorFrecCardio;
    boolean SensorPasos;
    boolean SensorFit;
    boolean SensorPreArterial;
    int duracionateriaWathc;

    public SmartWatch(){
    }
    public SmartWatch(String fabricante, String color, int nBotones, String tipoDeCarga, Double tamHorizontalPantalla, Double tamVerticalPantalla){
        super(fabricante, color, nBotones, tipoDeCarga, tamHorizontalPantalla, tamVerticalPantalla);
    }
    public SmartWatch(String fabricante, String color, int nBotones, String tipoDeCarga, Double tamHorizontalPantalla, Double tamVerticalPantalla, boolean SensorFrecCardio, boolean SensorPasos, boolean SensorFit, boolean SensorPreArterial, int duracionateriaWathc){
        super(fabricante, color, nBotones, tipoDeCarga, tamHorizontalPantalla, tamVerticalPantalla);
        this.SensorFrecCardio = SensorFrecCardio;
        this.SensorPasos = SensorPasos;
        this.SensorFit = SensorFit;
        this.SensorPreArterial = SensorPreArterial;
        this.duracionateriaWathc = duracionateriaWathc;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "SensorFrecCardio=" + SensorFrecCardio +
                ", SensorPasos=" + SensorPasos +
                ", SensorFit=" + SensorFit +
                ", SensorPreArterial=" + SensorPreArterial +
                ", duracionateriaWathc=" + duracionateriaWathc +
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
