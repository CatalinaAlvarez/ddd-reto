package co.com.sofka.centroNeuropsicologico.domain.paciente.event;

import co.com.sofka.centroNeuropsicologico.domain.paciente.Acudiente;
import co.com.sofka.centroNeuropsicologico.domain.paciente.HistoriaClinica;
import co.com.sofka.centroNeuropsicologico.domain.paciente.PacientePrincipal;
import co.com.sofka.centroNeuropsicologico.domain.paciente.value.PacienteId;
import co.com.sofka.centroNeuropsicologico.domain.paciente.value.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class PacienteCreado extends DomainEvent {

    private final PacienteId pacienteId;
    private final Telefono telefono;


    public PacienteCreado(PacienteId entityId, Telefono telefono) {
        super("sofka.paciente.pacienteCreado");
        this.pacienteId = entityId;
        this.telefono = telefono;
    }

    public PacienteId getPacienteId() {
        return pacienteId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
