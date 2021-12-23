package co.com.sofka.centroNeuropsicologico.domain.consulta.command;

import co.com.sofka.centroNeuropsicologico.domain.consulta.value.ConsultaId;
import co.com.sofka.centroNeuropsicologico.domain.consulta.value.ConsultorioId;
import co.com.sofka.centroNeuropsicologico.domain.consulta.value.Tipo;
import co.com.sofka.domain.generic.Command;

public class ActualizarTipoConsultorio extends Command {

    private final ConsultaId consultaId;
    private final ConsultorioId consultorioId;
    private final Tipo tipo;

    public ActualizarTipoConsultorio(ConsultaId consultaId, ConsultorioId entityId, Tipo tipo){

        this.consultaId = consultaId;
        this.consultorioId = entityId;
        this.tipo = tipo;
    }

    public ConsultaId getConsultaId() {
        return consultaId;
    }

    public ConsultorioId getConsultorioId() {
        return consultorioId;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
