package co.com.sofka.centroNeuropsicologico.domain.paciente;

import co.com.sofka.centroNeuropsicologico.domain.generics.Email;
import co.com.sofka.centroNeuropsicologico.domain.generics.Nombre;
import co.com.sofka.centroNeuropsicologico.domain.paciente.value.AcudienteId;
import co.com.sofka.domain.generic.Entity;

public class Acudiente extends Entity<AcudienteId> {

    protected Nombre nombre;
    protected Email email;

    public Acudiente(AcudienteId entityId) {
        super(entityId);
    }
}
