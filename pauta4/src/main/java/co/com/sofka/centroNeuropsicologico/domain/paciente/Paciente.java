package co.com.sofka.centroNeuropsicologico.domain.paciente;

import co.com.sofka.centroNeuropsicologico.domain.consulta.value.ConsultaId;
import co.com.sofka.centroNeuropsicologico.domain.paciente.value.PacienteId;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Set;

public class Paciente extends AggregateEvent<PacienteId> {

    protected Set<ConsultaId> consultas;
    protected Acudiente acudiente;
    protected PacientePrincipal pacientePrincipal;
    protected HistoriaClinica historiaClinica;


    public Paciente(PacienteId entityId) {
        super(entityId);
    }
}
