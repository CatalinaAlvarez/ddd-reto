package co.com.sofka.centroNeuropsicologico.domain.consulta.event;

import co.com.sofka.centroNeuropsicologico.domain.consulta.Cita;
import co.com.sofka.centroNeuropsicologico.domain.consulta.Consultorio;
import co.com.sofka.centroNeuropsicologico.domain.consulta.Reporte;
import co.com.sofka.centroNeuropsicologico.domain.consulta.value.ConsultaId;
import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.value.EquipoProfesionalId;
import co.com.sofka.domain.generic.DomainEvent;

public class ConsultaCreada extends DomainEvent {

    private final ConsultaId consultaId;
    private final EquipoProfesionalId equipoProfesionalId;
    private final Cita cita;
    private final Consultorio consultorio;
    private final Reporte reporte;

    public ConsultaCreada(ConsultaId entityId, EquipoProfesionalId equipoProfesionalId, Cita cita, Consultorio consultorio, Reporte reporte) {
        super("sofka.consulta.consultaCreada");

        this.consultaId = entityId;
        this.equipoProfesionalId = equipoProfesionalId;
        this.cita = cita;
        this.consultorio = consultorio;
        this.reporte = reporte;
    }

    public ConsultaId getConsultaId() {
        return consultaId;
    }

    public EquipoProfesionalId getEquipoProfesionalId() {
        return equipoProfesionalId;
    }

    public Cita getCita() {
        return cita;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public Reporte getReporte() {
        return reporte;
    }
}
