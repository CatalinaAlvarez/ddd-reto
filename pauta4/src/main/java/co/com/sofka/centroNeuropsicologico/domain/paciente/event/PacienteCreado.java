package co.com.sofka.centroNeuropsicologico.domain.paciente.event;

import co.com.sofka.centroNeuropsicologico.domain.paciente.Acudiente;
import co.com.sofka.centroNeuropsicologico.domain.paciente.HistoriaClinica;
import co.com.sofka.centroNeuropsicologico.domain.paciente.PacientePrincipal;
import co.com.sofka.centroNeuropsicologico.domain.paciente.value.PacienteId;
import co.com.sofka.domain.generic.DomainEvent;

public class PacienteCreado extends DomainEvent {

    private final PacienteId pacienteId;
    private final Acudiente acudiente;
    private final PacientePrincipal pacientePrincipal;
    private final HistoriaClinica historiaClinica;

    public PacienteCreado(PacienteId entityId, Acudiente acudiente, PacientePrincipal pacientePrincipal, HistoriaClinica historiaClinica) {
        super("sofka.paciente.pacienteCreado");
        this.pacienteId = entityId;
        this.acudiente = acudiente;
        this.pacientePrincipal = pacientePrincipal;
        this.historiaClinica = historiaClinica;
    }

    public PacienteId getPacienteId() {
        return pacienteId;
    }

    public Acudiente getAcudiente() {
        return acudiente;
    }

    public PacientePrincipal getPacientePrincipal() {
        return pacientePrincipal;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

}
