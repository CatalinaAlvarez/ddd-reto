package co.com.sofka.centroNeuropsicologico.domain.consulta.value;

import co.com.sofka.domain.generic.Identity;

public class ConsultorioId extends Identity {

    public ConsultorioId(){

    }

    public ConsultorioId(String id) {
        super(id);
    }

    public static ConsultorioId of(String id){
        return new ConsultorioId(id);
    }
}
