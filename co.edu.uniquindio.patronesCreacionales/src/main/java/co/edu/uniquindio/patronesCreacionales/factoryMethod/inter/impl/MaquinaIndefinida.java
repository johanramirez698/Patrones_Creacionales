package co.edu.uniquindio.patronesCreacionales.factoryMethod.inter.impl;

import co.edu.uniquindio.patronesCreacionales.factoryMethod.inter.IMaquinas;

public class MaquinaIndefinida implements IMaquinas {
    public void cortarTela(){
        System.out.println("No hay una maquina especificada para cortar la tela");
    }

}
