package co.com.sofka.centroNeuropsicologico.domain.consulta.event;

import co.com.sofka.centroNeuropsicologico.domain.consulta.value.ConsultorioId;
import co.com.sofka.centroNeuropsicologico.domain.consulta.value.Nomenclatura;
import co.com.sofka.domain.generic.DomainEvent;

public class NomenclaturaConsultorioActualizada extends DomainEvent {

    private final ConsultorioId consultorioId;
    private final Nomenclatura nomenclatura;

    public NomenclaturaConsultorioActualizada(ConsultorioId entityId, Nomenclatura nomenclatura) {
        super("sofka.consulta.nomenclaturaConsultorioActualizada");
        this.consultorioId = entityId;
        this.nomenclatura = nomenclatura;
    }

    public ConsultorioId getConsultorioId() {
        return consultorioId;
    }

    public Nomenclatura getNomenclatura() {
        return nomenclatura;
    }
}
