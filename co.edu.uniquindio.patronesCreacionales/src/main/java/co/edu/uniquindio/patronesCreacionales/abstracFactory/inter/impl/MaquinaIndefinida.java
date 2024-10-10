package co.edu.uniquindio.patronesCreacionales.abstracFactory.inter.impl;

import co.edu.uniquindio.patronesCreacionales.abstracFactory.inter.ICorteParametrizado;
import co.edu.uniquindio.patronesCreacionales.abstracFactory.inter.ICortePersonalizado;
import co.edu.uniquindio.patronesCreacionales.factoryMethod.inter.IMaquinas;

public class MaquinaIndefinida implements ICortePersonalizado, ICorteParametrizado{
    public void cortarTela(){
        System.out.println("No hay una maquina especificada para cortar la tela");
    }

}
