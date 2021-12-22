package co.com.sofka.centroNeuropsicologico.domain.equipoProfesional;

import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.value.Estudio;
import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.value.PsicologoId;
import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.value.TarjetaProfesional;
import co.com.sofka.centroNeuropsicologico.domain.generics.Email;
import co.com.sofka.centroNeuropsicologico.domain.generics.Nombre;
import co.com.sofka.domain.generic.Entity;

import java.util.Set;

public class Psicologo extends Entity<PsicologoId> {

    protected Nombre nombre;
    protected Email email;
    protected Set<Estudio> estudios;
    protected TarjetaProfesional tarjetaProfesional;

    public Psicologo(PsicologoId entityId) {
        super(entityId);
    }
}
