package co.edu.uniquindio.patronesCreacionales.factoryMethod.inter.impl;

import co.edu.uniquindio.patronesCreacionales.factoryMethod.inter.IMaquinas;

public class MaquinaMultifuncional implements IMaquinas {
    private String nombre;
    private String modelo;
    private MetodoCorte metodoCorte;

    public MaquinaMultifuncional() {
        this.nombre = "MULTICUT";
        this.modelo = "MULTI3000";
        this.metodoCorte=(MetodoCorte.CIZALLAMIENTO);
    }
    public void cortarTela(){
        System.out.println("La tela ha sido cortada con la maquina Multifuncional");
    }

    @Override
    public String toString() {
        return "MaquinaMultifuncional{" +
                "metodoCorte=" + metodoCorte +
                ", nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
