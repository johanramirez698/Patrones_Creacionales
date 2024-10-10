package co.edu.uniquindio.patronesCreacionales.factoryMethod;

import co.edu.uniquindio.patronesCreacionales.factoryMethod.inter.IMaquinas;
import co.edu.uniquindio.patronesCreacionales.factoryMethod.inter.impl.*;

public class CorteTelas {
    public IMaquinas getMaquinas(String asignacion) {
        if(asignacion==null){
            return new MaquinaIndefinida();
        }
        if(asignacion.equals("MULTICUT")){
            return new MaquinaMultifuncional();
        }else if(asignacion.equals("CorpoTRIX")){
            return new MaquinaCuero();
        }else if (asignacion.equals("PRINTCUT")){
            return new MaquinaAlgodon();
        }
        return new MaquinaIndefinida();
    }
}
