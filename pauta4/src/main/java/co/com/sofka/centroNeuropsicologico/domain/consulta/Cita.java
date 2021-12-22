package co.com.sofka.centroNeuropsicologico.domain.consulta;

import co.com.sofka.centroNeuropsicologico.domain.consulta.value.CitaId;
import co.com.sofka.domain.generic.Entity;

public class Cita extends Entity<CitaId> {
    public Cita(CitaId entityId) {
        super(entityId);
    }
}
