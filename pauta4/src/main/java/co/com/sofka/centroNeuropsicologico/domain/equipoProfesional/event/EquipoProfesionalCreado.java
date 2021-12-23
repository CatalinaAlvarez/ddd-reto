package co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.event;

import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.Neuropsicologo;
import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.Psicologo;
import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.TerapeutaOcupacional;
import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.value.EquipoProfesionalId;
import co.com.sofka.centroNeuropsicologico.domain.generics.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class EquipoProfesionalCreado extends DomainEvent {

    private final EquipoProfesionalId equipoProfesionalId;
    private final Nombre nombre;

    public EquipoProfesionalCreado(EquipoProfesionalId entityId, Nombre nombre) {
        super("sofka.equipoProfesional.equipoProfesionalCreado");
        this.equipoProfesionalId = entityId;
        this.nombre = nombre;
    }

    public EquipoProfesionalId getEquipoProfesionalId() {
        return equipoProfesionalId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
