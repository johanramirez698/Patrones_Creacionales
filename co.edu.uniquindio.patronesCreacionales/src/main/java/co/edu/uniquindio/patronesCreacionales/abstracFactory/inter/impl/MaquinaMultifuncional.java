package co.edu.uniquindio.patronesCreacionales.abstracFactory.inter.impl;

import co.edu.uniquindio.patronesCreacionales.abstracFactory.inter.ICortePersonalizado;
import co.edu.uniquindio.patronesCreacionales.factoryMethod.inter.IMaquinas;
import co.edu.uniquindio.patronesCreacionales.factoryMethod.inter.impl.MetodoCorte;

public class MaquinaMultifuncional implements ICortePersonalizado {
    private String nombre;
    private String modelo;
    private MetodoCorte metodoCorte;

    public MaquinaMultifuncional() {
        this.nombre = "MULTICUT";
        this.modelo = "MULTI3000";
        this.metodoCorte=(MetodoCorte.CIZALLAMIENTO);
    }
    public void cortarTela(){
        System.out.println(" El corte se asignó a la maquina Multifuncional");
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
