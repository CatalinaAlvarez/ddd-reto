package co.com.sofka.centroNeuropsicologico.domain.consulta.command;

import co.com.sofka.centroNeuropsicologico.domain.consulta.value.ConsultaId;
import co.com.sofka.centroNeuropsicologico.domain.consulta.value.ConsultorioId;
import co.com.sofka.centroNeuropsicologico.domain.consulta.value.Nomenclatura;
import co.com.sofka.domain.generic.Command;

public class ActualizarNomenclaturaConsultorio extends Command {

    private ConsultaId consultaId;
    private ConsultorioId consultorioId;
    private Nomenclatura nomenclatura;

    public ActualizarNomenclaturaConsultorio(ConsultaId consultaId, ConsultorioId entityId, Nomenclatura nomenclatura){

        this.consultaId = consultaId;
        this.consultorioId = entityId;
        this.nomenclatura = nomenclatura;
    }

    public ConsultaId getConsultaId() {
        return consultaId;
    }

    public ConsultorioId getConsultorioId() {
        return consultorioId;
    }

    public Nomenclatura getNomenclatura() {
        return nomenclatura;
    }
}
