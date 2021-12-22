package co.com.sofka.centroNeuropsicologico.domain.consulta.event;

import co.com.sofka.centroNeuropsicologico.domain.consulta.value.ProfesionalId;
import co.com.sofka.centroNeuropsicologico.domain.consulta.value.ReporteId;
import co.com.sofka.domain.generic.DomainEvent;

public class ProfesionalIdReporteReporteActualizado extends DomainEvent {

    private final ReporteId reporteId;
    private final ProfesionalId profesionalId;

    public ProfesionalIdReporteReporteActualizado(ReporteId entityId, ProfesionalId profesionalId) {
        super("sofka.consulta.profesionalIdReporteActualizado");

        reporteId = entityId;
        this.profesionalId = profesionalId;
    }

    public ReporteId getReporteId() {
        return reporteId;
    }

    public ProfesionalId getProfesionalId() {
        return profesionalId;
    }
}
