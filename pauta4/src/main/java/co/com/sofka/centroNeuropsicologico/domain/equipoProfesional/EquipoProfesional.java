package co.com.sofka.centroNeuropsicologico.domain.equipoProfesional;

import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.value.EquipoProfesionalId;
import co.com.sofka.domain.generic.AggregateEvent;

public class EquipoProfesional extends AggregateEvent<EquipoProfesionalId> {

    protected Psicologo psicologo;
    protected Neuropsicologo neuropsicologo;
    protected TerapeutaOcupacional terapeutaOcupacional;

    public EquipoProfesional(EquipoProfesionalId entityId) {
        super(entityId);
    }
}
