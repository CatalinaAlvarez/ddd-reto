package co.com.sofka.centroNeuropsicologico.domain.consulta.event;

import co.com.sofka.centroNeuropsicologico.domain.consulta.value.ConsultorioId;
import co.com.sofka.centroNeuropsicologico.domain.consulta.value.Nomenclatura;
import co.com.sofka.centroNeuropsicologico.domain.consulta.value.Tipo;
import co.com.sofka.domain.generic.DomainEvent;

public class ConsultorioAgregado extends DomainEvent {

    private final ConsultorioId consultorioId;
    private final Tipo tipo;
    private final Nomenclatura nomenclatura;

    public ConsultorioAgregado(ConsultorioId entityId, Tipo tipo, Nomenclatura nomenclatura) {
        super("sofka.consulta.consultorioCambiado");

        this.consultorioId = entityId;
        this.tipo = tipo;
        this.nomenclatura = nomenclatura;
    }

    public ConsultorioId getConsultorioId() {
        return consultorioId;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Nomenclatura getNomenclatura() {
        return nomenclatura;
    }
}
