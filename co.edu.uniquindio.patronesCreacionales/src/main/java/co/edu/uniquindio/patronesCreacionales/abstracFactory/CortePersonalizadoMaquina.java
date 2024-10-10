package co.edu.uniquindio.patronesCreacionales.abstracFactory;

import co.edu.uniquindio.patronesCreacionales.abstracFactory.inter.ICorteParametrizado;
import co.edu.uniquindio.patronesCreacionales.abstracFactory.inter.ICortePersonalizado;
import co.edu.uniquindio.patronesCreacionales.abstracFactory.inter.MaquinaAbstracta;
import co.edu.uniquindio.patronesCreacionales.abstracFactory.inter.impl.MaquinaIndefinida;
import co.edu.uniquindio.patronesCreacionales.abstracFactory.inter.impl.MaquinaMultifuncional;
import co.edu.uniquindio.patronesCreacionales.factoryMethod.inter.impl.MetodoCorte;

public class CortePersonalizadoMaquina implements MaquinaAbstracta {

    public ICortePersonalizado getPersonalizado(MetodoCorte asignacionEstablecida) {
        if (asignacionEstablecida == null) {
            return new MaquinaIndefinida();
        }
        if(asignacionEstablecida.equals(MetodoCorte.CIZALLAMIENTO)){
            return new MaquinaMultifuncional();
        }
        return new MaquinaIndefinida();
    }

    @Override
    public ICorteParametrizado getParametrizado(MetodoCorte asignacionMetrica) {
        return null;
    }
}



