package co.edu.uniquindio.patronesCreacionales.factoryMethod;

import co.edu.uniquindio.patronesCreacionales.factoryMethod.inter.IMaquinas;
import co.edu.uniquindio.patronesCreacionales.factoryMethod.inter.impl.MetodoCorte;

public class MainMethod {
    public static void main(String[] args) {
        CorteTelas tela = new CorteTelas();

        IMaquinas corte1= tela.getMaquinas("PRINTCUT");
        corte1.cortarTela();
    }
}