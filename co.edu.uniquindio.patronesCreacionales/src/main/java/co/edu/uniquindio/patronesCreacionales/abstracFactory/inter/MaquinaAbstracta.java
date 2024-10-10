package co.edu.uniquindio.patronesCreacionales.abstracFactory.inter;

import co.edu.uniquindio.patronesCreacionales.factoryMethod.inter.impl.MetodoCorte;

public interface MaquinaAbstracta {
    ICortePersonalizado getPersonalizado(MetodoCorte asignacionEstablecida);
    ICorteParametrizado getParametrizado(MetodoCorte asignacionMetrica);

}
