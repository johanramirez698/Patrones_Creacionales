package co.edu.uniquindio.patronesCreacionales.factoryMethod.inter.impl;

import co.edu.uniquindio.patronesCreacionales.factoryMethod.inter.IMaquinas;

public class MaquinaAlgodon implements IMaquinas {
    private String nombre;
    private String modelo;
    private MetodoCorte metodoCorte;

    public MaquinaAlgodon() {
        this.nombre = "PRINTCUT";
        this.modelo = "PRINTFX90";
        this.metodoCorte=(MetodoCorte.VERTICAL_SIERRA);
    }
    public void cortarTela(){
        System.out.println("La tela ha sido cortada con la maquina de Algodón");
    }

    @Override
    public String toString() {
        return "MaquinaAlgodon{" +
                "metodoCorte=" + metodoCorte +
                ", nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
