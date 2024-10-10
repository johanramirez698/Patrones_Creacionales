package co.edu.uniquindio.patronesCreacionales.abstracFactory.inter.impl;

import co.edu.uniquindio.patronesCreacionales.abstracFactory.inter.ICorteParametrizado;
import co.edu.uniquindio.patronesCreacionales.factoryMethod.inter.IMaquinas;
import co.edu.uniquindio.patronesCreacionales.factoryMethod.inter.impl.MetodoCorte;

public class MaquinaAlgodon implements ICorteParametrizado {
    private String nombre;
    private String modelo;
    private MetodoCorte metodoCorte;

    public MaquinaAlgodon() {
        this.nombre = "PRINTCUT";
        this.modelo = "PRINTFX90";
        this.metodoCorte=(MetodoCorte.VERTICAL_SIERRA);
    }
    public void cortarTela(){
        System.out.println("la Tela ");
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
