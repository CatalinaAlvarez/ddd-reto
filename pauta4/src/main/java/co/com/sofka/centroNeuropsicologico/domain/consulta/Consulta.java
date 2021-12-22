package co.com.sofka.centroNeuropsicologico.domain.consulta;

import co.com.sofka.centroNeuropsicologico.domain.consulta.value.ConsultaId;
import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.value.EquipoProfesionalId;
import co.com.sofka.domain.generic.AggregateEvent;

public class Consulta extends AggregateEvent<ConsultaId> {

    protected EquipoProfesionalId equipoProfesionalId;
    protected Cita cita;
    protected Consultorio consultorio;
    protected Reporte reporte;

    public Consulta(ConsultaId entityId) {
        super(entityId);
    }
}
