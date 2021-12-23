package co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.command;

import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.value.EquipoProfesionalId;
import co.com.sofka.centroNeuropsicologico.domain.generics.Nombre;
import co.com.sofka.domain.generic.Command;

public class CrearEquipoProfesional extends Command {

    private final EquipoProfesionalId equipoProfesionalId;
    private final Nombre nombre;

    public CrearEquipoProfesional(EquipoProfesionalId entityId, Nombre nombre){

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
