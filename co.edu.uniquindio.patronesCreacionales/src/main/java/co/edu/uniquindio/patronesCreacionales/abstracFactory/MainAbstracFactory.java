package co.edu.uniquindio.patronesCreacionales.abstracFactory;

import co.edu.uniquindio.patronesCreacionales.abstracFactory.inter.ICorteParametrizado;
import co.edu.uniquindio.patronesCreacionales.abstracFactory.inter.MaquinaAbstracta;
import co.edu.uniquindio.patronesCreacionales.factoryMethod.inter.impl.MetodoCorte;

public class MainAbstracFactory {
    public static void main(String[] args) {
        MaquinaAbstracta maquinaParametrizada= AsignacionCorteMaquina.getFactory(MetodoCorte.CIRCULAR);
        ICorteParametrizado corte1= maquinaParametrizada.getParametrizado(MetodoCorte.CIRCULAR);

        corte1.cortarTela();
    }
}
