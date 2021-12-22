package co.com.sofka.centroNeuropsicologico.domain.consulta;

import co.com.sofka.centroNeuropsicologico.domain.consulta.value.ConsultorioId;
import co.com.sofka.domain.generic.Entity;

public class Consultorio extends Entity<ConsultorioId> {
    public Consultorio(ConsultorioId entityId) {
        super(entityId);
    }
}
