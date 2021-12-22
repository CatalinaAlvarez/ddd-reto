package co.com.sofka.centroNeuropsicologico.domain.consulta;

import co.com.sofka.centroNeuropsicologico.domain.consulta.value.Duracion;
import co.com.sofka.centroNeuropsicologico.domain.consulta.value.Fecha;
import co.com.sofka.centroNeuropsicologico.domain.consulta.value.ReporteId;
import co.com.sofka.centroNeuropsicologico.domain.consulta.value.Tipo;
import co.com.sofka.domain.generic.Entity;

public class Reporte extends Entity<ReporteId> {

    protected Fecha fecha;
    protected Tipo tipo;
    protected Duracion duracion;

    public Reporte(ReporteId entityId) {
        super(entityId);
    }
}
