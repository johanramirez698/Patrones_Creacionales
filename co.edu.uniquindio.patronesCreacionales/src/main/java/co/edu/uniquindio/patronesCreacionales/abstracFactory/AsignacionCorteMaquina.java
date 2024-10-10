package co.edu.uniquindio.patronesCreacionales.abstracFactory;

import co.edu.uniquindio.patronesCreacionales.abstracFactory.inter.MaquinaAbstracta;
import co.edu.uniquindio.patronesCreacionales.factoryMethod.inter.impl.MetodoCorte;

public class AsignacionCorteMaquina {
    public static MaquinaAbstracta getFactory (MetodoCorte metodoCorte) {
        if(metodoCorte.equals(MetodoCorte.CIRCULAR)){
            return new CorteParametrizadoMaquina();

            }else if(metodoCorte.equals(MetodoCorte.CIZALLAMIENTO)){
            return new CortePersonalizadoMaquina();
        }
        return null;
    }
}
