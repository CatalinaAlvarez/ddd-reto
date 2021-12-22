package co.com.sofka.centroNeuropsicologico.domain.consulta;

import co.com.sofka.centroNeuropsicologico.domain.consulta.event.*;
import co.com.sofka.domain.generic.EventChange;

public class ConsultaChange extends EventChange {
    public ConsultaChange(Consulta consulta) {

        apply((ConsultaCreada event)->{
            consulta.equipoProfesionalId = event.getEquipoProfesionalId();
            consulta.cita = event.getCita();
            consulta.consultorio = event.getConsultorio();
            consulta.reporte = event.getReporte();
        });

        apply((ConsultorioCambiado event)->{ //REVISAR
            consulta.consultorio.tipo = event.getTipo();
            consulta.consultorio.nomenclatura = event.getNomenclatura();
        });

        apply((CitaCambiada event)->{ //REVISAR
            consulta.cita.fecha = event.getFecha();
            consulta.cita.tipo = event.getTipo();
            consulta.cita.duracion = event.getDuracion();
        });

        apply((TipoCitaActualizado event)->{
            consulta.cita.tipo = event.getTipo();
        });

        apply((DuracionCitaActualizada event)->{
            consulta.cita.duracion = event.getDuracion();
        });

        apply((TipoConsultorioActualizado event)->{
            consulta.consultorio.tipo = event.getTipo();
        });

        apply((NomenclaturaConsultorioActualizada event)->{
            consulta.consultorio.nomenclatura = event.getNomenclatura();
        });

        apply((ComentarioReporteActualizado event)->{
            consulta.reporte.comentario = event.getComentario();
        });

        apply((ProfesionalIdReporteReporteActualizado event)->{
            consulta.reporte.profesionalId = event.getProfesionalId();
        });

    }
}
