package co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.event;

import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.Neuropsicologo;
import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.Psicologo;
import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.TerapeutaOcupacional;
import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.value.EquipoProfesionalId;
import co.com.sofka.domain.generic.DomainEvent;

public class EquipoProfesionalCreado extends DomainEvent {

    private final EquipoProfesionalId equipoProfesionalId;
    private final Psicologo psicologo;
    private final Neuropsicologo neuropsicologo;
    private final TerapeutaOcupacional terapeutaOcupacional;

    public EquipoProfesionalCreado(EquipoProfesionalId entityId, Psicologo psicologo, Neuropsicologo neuropsicologo, TerapeutaOcupacional terapeutaOcupacional) {
        super("sofka.equipoProfesional.equipoProfesionalCreado");
        this.equipoProfesionalId = entityId;
        this.psicologo = psicologo;
        this.neuropsicologo = neuropsicologo;
        this.terapeutaOcupacional = terapeutaOcupacional;
    }

    public EquipoProfesionalId getEquipoProfesionalId() {
        return equipoProfesionalId;
    }

    public Psicologo getPsicologo() {
        return psicologo;
    }

    public Neuropsicologo getNeuropsicologo() {
        return neuropsicologo;
    }

    public TerapeutaOcupacional getTerapeutaOcupacional() {
        return terapeutaOcupacional;
    }
}
