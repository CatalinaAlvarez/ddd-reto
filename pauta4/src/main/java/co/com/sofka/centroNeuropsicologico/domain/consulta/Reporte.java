package co.com.sofka.centroNeuropsicologico.domain.consulta;

import co.com.sofka.centroNeuropsicologico.domain.consulta.value.Comentario;
import co.com.sofka.centroNeuropsicologico.domain.consulta.value.ProfesionalId;
import co.com.sofka.centroNeuropsicologico.domain.consulta.value.ReporteId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Reporte extends Entity<ReporteId> {

    protected Comentario comentario;
    protected ProfesionalId profesionalId;

    public Reporte(ReporteId entityId, Comentario comentario, ProfesionalId profesionalId) {
        super(entityId);
        this.comentario = Objects.requireNonNull(comentario);
        this.profesionalId = Objects.requireNonNull(profesionalId);
    }

    public void actualizarComentario(Comentario comentario){
        this.comentario = Objects.requireNonNull(comentario);
    }

    public void actualizarProfesionalId(ProfesionalId profesionalId){
        this.profesionalId = Objects.requireNonNull(profesionalId);
    }

    public Comentario comentario() {
        return comentario;
    }

    public ProfesionalId profesionalId() {
        return profesionalId;
    }
}
