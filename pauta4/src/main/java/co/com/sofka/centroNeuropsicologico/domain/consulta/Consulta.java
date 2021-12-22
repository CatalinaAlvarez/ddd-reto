package co.com.sofka.centroNeuropsicologico.domain.consulta;

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

    public Consulta(ConsultaId entityId, EquipoProfesionalId equipoProfesionalId, Cita cita, Consultorio consultorio, Reporte reporte) {
        super(entityId);
        this.equipoProfesionalId = equipoProfesionalId;
        this.cita = cita;
        this.consultorio = consultorio;
        this.reporte = reporte;
        appendChange(new ConsultaCreada(entityId, equipoProfesionalId, cita, consultorio, reporte)).apply();
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

    public void cambiarConsultorio(ConsultorioId entityId, Tipo tipo, Nomenclatura nomenclatura){
        appendChange(new ConsultorioCambiado(entityId, tipo, nomenclatura)).apply();
    }

    public void cambiarCita(CitaId entityId, Fecha fecha, Tipo tipo, Duracion duracion){
        appendChange(new CitaCambiada(entityId, fecha, tipo, duracion)).apply();
    }

    public void actualizarTipoCita(CitaId entityId, Tipo tipo){
        appendChange(new TipoCitaActualizado(entityId, tipo)).apply();
    }

    public void actualizarDuracionCita(CitaId entityId, Duracion duracion){
        appendChange(new DuracionCitaActualizado(entityId, duracion)).apply();
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

    public void actualizarProfesionalIdReporte(ReporteId entityId, ProfesionalId profesionalId){
        appendChange(new ProfesionalIdReporteReporteActualizado(entityId, profesionalId)).apply();
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
}
