package co.com.sofka.centroNeuropsicologico.domain.consulta.command;

import co.com.sofka.centroNeuropsicologico.domain.consulta.value.ConsultaId;
import co.com.sofka.centroNeuropsicologico.domain.consulta.value.ConsultorioId;
import co.com.sofka.centroNeuropsicologico.domain.consulta.value.Nomenclatura;
import co.com.sofka.centroNeuropsicologico.domain.consulta.value.Tipo;
import co.com.sofka.domain.generic.Command;

public class AgregarConsultorio extends Command {

    private final ConsultaId consultaId;
    private final ConsultorioId consultorioId;
    private final Tipo tipo;
    private final Nomenclatura nomenclatura;

    public AgregarConsultorio(ConsultaId consultaId, ConsultorioId entityId, Tipo tipo, Nomenclatura nomenclatura){

        this.consultaId = consultaId;
        this.consultorioId = entityId;
        this.tipo = tipo;
        this.nomenclatura = nomenclatura;
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

    public Nomenclatura getNomenclatura() {
        return nomenclatura;
    }
}
