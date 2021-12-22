package co.com.sofka.centroNeuropsicologico.domain.consulta;

import co.com.sofka.centroNeuropsicologico.domain.consulta.value.ConsultorioId;
import co.com.sofka.centroNeuropsicologico.domain.consulta.value.Nomenclatura;
import co.com.sofka.centroNeuropsicologico.domain.consulta.value.Tipo;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Consultorio extends Entity<ConsultorioId> {

    protected Tipo tipo;
    protected Nomenclatura nomenclatura;

    public Consultorio(ConsultorioId entityId, Tipo tipo, Nomenclatura nomenclatura) {
        super(entityId);
        this.tipo = Objects.requireNonNull(tipo);
        this.nomenclatura = Objects.requireNonNull(nomenclatura);
    }

    public void actualizarTipo(Tipo tipo){
        this.tipo = Objects.requireNonNull(tipo);
    }

    public void actualizarNomenclatura(Nomenclatura nomenclatura){
        this.nomenclatura = Objects.requireNonNull(nomenclatura);
    }

    public Tipo tipo() {
        return tipo;
    }

    public Nomenclatura nomenclatura() {
        return nomenclatura;
    }
}
