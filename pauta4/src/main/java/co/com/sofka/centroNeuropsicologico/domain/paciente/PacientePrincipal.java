package co.com.sofka.centroNeuropsicologico.domain.paciente;

import co.com.sofka.centroNeuropsicologico.domain.generics.Nombre;
import co.com.sofka.centroNeuropsicologico.domain.paciente.value.Edad;
import co.com.sofka.centroNeuropsicologico.domain.paciente.value.PacientePrincipalId;
import co.com.sofka.domain.generic.Entity;

public class PacientePrincipal extends Entity<PacientePrincipalId> {

    protected Nombre nombre;
    protected Edad edad;

    public PacientePrincipal(PacientePrincipalId entityId) {
        super(entityId);
    }
}
