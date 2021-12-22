package co.com.sofka.centroNeuropsicologico.domain.consulta.event;

import co.com.sofka.centroNeuropsicologico.domain.consulta.value.ConsultorioId;
import co.com.sofka.centroNeuropsicologico.domain.consulta.value.Tipo;
import co.com.sofka.domain.generic.DomainEvent;

public class TipoConsultorioActualizado extends DomainEvent {

    private final ConsultorioId consultorioId;
    private final Tipo tipo;

    public TipoConsultorioActualizado(ConsultorioId entityId, Tipo tipo) {
        super("sofka.consulta.tipoConsultorioActualizado");

        this.consultorioId = entityId;
        this.tipo = tipo;
    }

    public ConsultorioId getConsultorioId() {
        return consultorioId;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
