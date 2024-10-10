package co.edu.uniquindio.patronesCreacionales.factoryMethod.inter.impl;

import co.edu.uniquindio.patronesCreacionales.factoryMethod.inter.IMaquinas;

public class MaquinaCuero implements IMaquinas {
    private String nombre;
    private String modelo;
    private MetodoCorte metodoCorte;

    public MaquinaCuero() {
        this.nombre = "CorpoTRIX";
        this.modelo = "CT980";
        this.metodoCorte=(MetodoCorte.CIRCULAR);
    }
    public void cortarTela(){
        System.out.println("La tela ha sido cortada con la maquina de Cuero");
    }

    @Override
    public String toString() {
        return "MaquinaCuero{" +
                "metodoCorte=" + metodoCorte +
                ", nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
