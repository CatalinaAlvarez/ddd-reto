package co.com.sofka.centroNeuropsicologico.domain.equipoProfesional;

import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.value.Estudio;
import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.value.NeuropsicologoId;
import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.value.TarjetaProfesional;
import co.com.sofka.centroNeuropsicologico.domain.generics.Email;
import co.com.sofka.centroNeuropsicologico.domain.generics.Nombre;
import co.com.sofka.domain.generic.Entity;

import java.util.Set;

public class Neuropsicologo extends Entity<NeuropsicologoId> {

    protected Nombre nombre;
    protected Email email;
    protected Set<Estudio> estudios;
    protected TarjetaProfesional tarjetaProfesional;

    public Neuropsicologo(NeuropsicologoId entityId) {
        super(entityId);
    }
}
