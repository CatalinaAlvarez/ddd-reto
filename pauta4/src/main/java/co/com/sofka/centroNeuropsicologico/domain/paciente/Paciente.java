package co.com.sofka.centroNeuropsicologico.domain.paciente;

import co.com.sofka.centroNeuropsicologico.domain.consulta.value.ConsultaId;
import co.com.sofka.centroNeuropsicologico.domain.generics.Email;
import co.com.sofka.centroNeuropsicologico.domain.generics.Nombre;
import co.com.sofka.centroNeuropsicologico.domain.paciente.event.*;
import co.com.sofka.centroNeuropsicologico.domain.paciente.value.AcudienteId;
import co.com.sofka.centroNeuropsicologico.domain.paciente.value.Edad;
import co.com.sofka.centroNeuropsicologico.domain.paciente.value.PacienteId;
import co.com.sofka.centroNeuropsicologico.domain.paciente.value.PacientePrincipalId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.*;

public class Paciente extends AggregateEvent<PacienteId> {

    protected Set<ConsultaId> consultas;
    protected Acudiente acudiente;
    protected PacientePrincipal pacientePrincipal;
    protected HistoriaClinica historiaClinica;


    public Paciente(PacienteId entityId, Acudiente acudiente, PacientePrincipal pacientePrincipal, HistoriaClinica historiaClinica) {
        super(entityId);
        this.acudiente = Objects.requireNonNull(acudiente);
        this.pacientePrincipal = Objects.requireNonNull(pacientePrincipal);
        this.historiaClinica = Objects.requireNonNull(historiaClinica);
        this.consultas = new HashSet<>();
        appendChange(new PacienteCreado(entityId, acudiente, pacientePrincipal, historiaClinica)).apply();
    }

    private Paciente(PacienteId pacienteId){
        super(pacienteId);
        subscribe(new PacienteChange(this));

    }

    public static Paciente from(PacienteId entityId, List<DomainEvent> events){
        var paciente = new Paciente(entityId);
        events.forEach(paciente::applyEvent);
        return paciente;
    }

    public void cambiarAcudiente(AcudienteId entityId, Nombre nombre, Email email){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(email);
        appendChange(new AcudienteCambiado(entityId, nombre, email)).apply();
    }

    public void agregarConsultaId(ConsultaId consultaId){
        Objects.requireNonNull(consultaId);
        appendChange(new ConsultaAgregada(consultaId)).apply();
    }

    public void actualizarNombreAcudiente(AcudienteId entityId, Nombre nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreAcudienteActualizado(entityId, nombre)).apply();
    }

    public void actualizarEmailAcudiente(AcudienteId entityId, Email email){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(email);
        appendChange(new EmailAcudienteActualizado(entityId, email)).apply();
    }

    public void actualizarNombrePacientePrincipal(PacientePrincipalId entityId, Nombre nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new NombrePacientePrincipalActualizado(entityId, nombre)).apply();
    }

    public void actualizarEdadPacientePrincipal(PacientePrincipalId entityId, Edad edad){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(edad);
        appendChange(new EdadPacientePrincipalActualizada(entityId, edad)).apply();
    }

    public void actualizarDiagnosticoHistoriaClinica(PacientePrincipalId entityId, Edad edad){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(edad);
        appendChange(new DiagnosticoHistoriaClinicaActualizado(entityId, edad)).apply();
    }

    public Optional<ConsultaId> getVendedorPorId(ConsultaId entityId){
        return consultas
                .stream()
                .filter(consulta -> consulta.equals(entityId))
                .findFirst();
    }

    public Set<ConsultaId> getConsultas() {
        return consultas;
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
