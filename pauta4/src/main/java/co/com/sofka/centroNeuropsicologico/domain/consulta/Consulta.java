package co.com.sofka.centroNeuropsicologico.domain.consulta;

import co.com.sofka.centroNeuropsicologico.domain.consulta.event.*;
import co.com.sofka.centroNeuropsicologico.domain.consulta.value.*;
import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.value.EquipoProfesionalId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class Consulta extends AggregateEvent<ConsultaId> {

    protected EquipoProfesionalId equipoProfesionalId;
    protected Cita cita;
    protected Consultorio consultorio;
    protected Reporte reporte;
    protected Fecha fecha;

    public Consulta(ConsultaId entityId, EquipoProfesionalId equipoProfesionalId, Fecha fecha) {
        super(entityId);
        this.fecha = fecha;
        appendChange(new ConsultaCreada(entityId, equipoProfesionalId, fecha)).apply();
    }

    private Consulta(ConsultaId consultaId){
        super(consultaId);
        subscribe(new ConsultaChange(this));

    }

    public static Consulta from(ConsultaId consultaId, List<DomainEvent> events){
        var consulta = new Consulta(consultaId);
        events.forEach(consulta::applyEvent);
        return consulta;
    }

    public void agregarConsultorio(ConsultorioId entityId, Tipo tipo, Nomenclatura nomenclatura){
        appendChange(new ConsultorioAgregado(entityId, tipo, nomenclatura)).apply();
    }

    public void agregarCita(CitaId entityId, Tipo tipo, Duracion duracion){
        appendChange(new CitaAgregada(entityId, tipo, duracion)).apply();
    }

    public void agregarReporte(ReporteId entityId, Comentario comentario){
        appendChange(new ReporteAgregado(entityId, comentario)).apply();
    }

    public void actualizarTipoCita(CitaId entityId, Tipo tipo){
        appendChange(new TipoCitaActualizado(entityId, tipo)).apply();
    }

    public void actualizarDuracionCita(CitaId entityId, Duracion duracion){
        appendChange(new DuracionCitaActualizada(entityId, duracion)).apply();
    }

    public void actualizarTipoConsultorio(ConsultorioId entityId, Tipo tipo){
        appendChange(new TipoConsultorioActualizado(entityId, tipo)).apply();
    }

    public void actualizarNomenclaturaConsultorio(ConsultorioId entityId, Nomenclatura nomenclatura){
        appendChange(new NomenclaturaConsultorioActualizada(entityId, nomenclatura)).apply();
    }

    public void actualizarComentarioReporte(ReporteId entityId, Comentario comentario){
        appendChange(new ComentarioReporteActualizado(entityId, comentario)).apply();
    }


    public EquipoProfesionalId equipoProfesionalId() {
        return equipoProfesionalId;
    }

    public Cita cita() {
        return cita;
    }

    public Consultorio consultorio() {
        return consultorio;
    }

    public Reporte reporte() {
        return reporte;
    }

    public Fecha fecha() {
        return fecha;
    }
}
