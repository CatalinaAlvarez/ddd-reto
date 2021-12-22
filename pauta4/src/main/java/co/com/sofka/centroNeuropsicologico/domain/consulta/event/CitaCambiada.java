package co.com.sofka.centroNeuropsicologico.domain.consulta.event;

import co.com.sofka.centroNeuropsicologico.domain.consulta.value.CitaId;
import co.com.sofka.centroNeuropsicologico.domain.consulta.value.Duracion;
import co.com.sofka.centroNeuropsicologico.domain.consulta.value.Fecha;
import co.com.sofka.centroNeuropsicologico.domain.consulta.value.Tipo;
import co.com.sofka.domain.generic.DomainEvent;

public class CitaCambiada extends DomainEvent {

    private final CitaId citaId;
    private final Fecha fecha;
    private final Tipo tipo;
    private final Duracion duracion;

    public CitaCambiada(CitaId entityId, Fecha fecha, Tipo tipo, Duracion duracion) {
        super("sofka.consultorio.citaCambiada");
        this.citaId = entityId;
        this.fecha = fecha;
        this.tipo = tipo;
        this.duracion = duracion;
    }

    public CitaId getCitaId() {
        return citaId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Duracion getDuracion() {
        return duracion;
    }
}
