package co.edu.uniquindio.patronesCreacionales.abstracFactory.inter.impl;

import co.edu.uniquindio.patronesCreacionales.abstracFactory.inter.ICorteParametrizado;
import co.edu.uniquindio.patronesCreacionales.factoryMethod.inter.IMaquinas;
import co.edu.uniquindio.patronesCreacionales.factoryMethod.inter.impl.MetodoCorte;

public class MaquinaCuero implements ICorteParametrizado {
    private String nombre;
    private String modelo;
    private MetodoCorte metodoCorte;

    public MaquinaCuero() {
        this.nombre = "CorpoTRIX";
        this.modelo = "CT980";
        this.metodoCorte=(MetodoCorte.CIRCULAR);
    }
    public void cortarTela(){
        System.out.println("El corte es parametrizado( circulaar) y se le asignó a la maquina de cuero");
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
