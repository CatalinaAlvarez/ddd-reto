package co.com.sofka.centroNeuropsicologico.domain.consulta;

import co.com.sofka.centroNeuropsicologico.domain.consulta.event.*;
import co.com.sofka.domain.generic.EventChange;

public class ConsultaChange extends EventChange {
    public ConsultaChange(Consulta consulta) {

        apply((ConsultaCreada event)->{
            consulta.equipoProfesionalId = event.getEquipoProfesionalId();
            consulta.fecha = event.getFecha();

        });

        apply((ConsultorioAgregado event)->{
            consulta.consultorio = new Consultorio(event.getConsultorioId(),
                    event.getTipo(),
                    event.getNomenclatura());

        });

        apply((CitaAgregada event)->{
            consulta.cita = new Cita(event.getCitaId(),
                    event.getTipo(),
                    event.getDuracion());
        });

        apply((ReporteAgregado event)->{
            consulta.reporte = new Reporte(event.getReporteId(),
                    event.getComentario());
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


    }
}
