package co.com.sofka.centroNeuropsicologico.domain.paciente;

import co.com.sofka.centroNeuropsicologico.domain.paciente.value.Anamnesis;
import co.com.sofka.centroNeuropsicologico.domain.paciente.value.Diagnostico;
import co.com.sofka.centroNeuropsicologico.domain.paciente.value.HistoriaClinicaId;
import co.com.sofka.domain.generic.Entity;

public class HistoriaClinica extends Entity<HistoriaClinicaId> {

    protected Diagnostico diagnostico;
    protected Anamnesis anamnesis;

    public HistoriaClinica(HistoriaClinicaId entityId) {
        super(entityId);
    }
}
