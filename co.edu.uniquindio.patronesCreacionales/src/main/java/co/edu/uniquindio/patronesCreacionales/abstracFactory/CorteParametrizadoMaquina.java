package co.edu.uniquindio.patronesCreacionales.abstracFactory;

import co.edu.uniquindio.patronesCreacionales.abstracFactory.inter.ICorteParametrizado;
import co.edu.uniquindio.patronesCreacionales.abstracFactory.inter.ICortePersonalizado;
import co.edu.uniquindio.patronesCreacionales.abstracFactory.inter.MaquinaAbstracta;
import co.edu.uniquindio.patronesCreacionales.abstracFactory.inter.impl.MaquinaAlgodon;
import co.edu.uniquindio.patronesCreacionales.abstracFactory.inter.impl.MaquinaCuero;
import co.edu.uniquindio.patronesCreacionales.abstracFactory.inter.impl.MaquinaIndefinida;
import co.edu.uniquindio.patronesCreacionales.factoryMethod.inter.impl.MetodoCorte;

public class CorteParametrizadoMaquina implements MaquinaAbstracta {

    @Override
    public ICortePersonalizado getPersonalizado(MetodoCorte asignacionEstablecida) {
        return null;
    }

    public ICorteParametrizado getParametrizado(MetodoCorte asignacionMetrica) {
        if (asignacionMetrica == null) {
            return new MaquinaIndefinida();
        }
        if (asignacionMetrica.equals(MetodoCorte.CIRCULAR)) {
            return new MaquinaCuero();
        } else if (asignacionMetrica.equals(MetodoCorte.VERTICAL_SIERRA)) {
            return new MaquinaAlgodon();
        }
        return new MaquinaIndefinida();
    }
}


