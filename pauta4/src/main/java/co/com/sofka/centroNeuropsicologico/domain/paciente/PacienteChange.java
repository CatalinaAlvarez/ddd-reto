package co.com.sofka.centroNeuropsicologico.domain.paciente;

import co.com.sofka.centroNeuropsicologico.domain.consulta.value.ConsultaId;
import co.com.sofka.centroNeuropsicologico.domain.paciente.event.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class PacienteChange extends EventChange {
    public PacienteChange(Paciente paciente) {

        apply((PacienteCreado event)->{
            paciente.acudiente = event.getAcudiente();
            paciente.pacientePrincipal = event.getPacientePrincipal();
            paciente.historiaClinica = event.getHistoriaClinica();
            paciente.consultas = new HashSet<>();
        });

        apply((AcudienteCambiado event)->{
            paciente.acudiente.nombre = event.getNombre();
            paciente.acudiente.email = event.getEmail();
        });

        apply((ConsultaAgregada event)->{
            paciente.consultas.add(new ConsultaId()); //REVISAR. ENVIAR ARGUMENTO

        });

        apply((NombreAcudienteActualizado event)->{
            paciente.acudiente.nombre = event.getNombre();

        });

        apply((EmailAcudienteActualizado event)->{
            paciente.acudiente.email = event.getEmail();
        });

        apply((NombrePacientePrincipalActualizado event)->{
            paciente.pacientePrincipal.nombre = event.getNombre();
        });

        apply((EdadPacientePrincipalActualizada event)->{
            paciente.pacientePrincipal.edad = event.getEdad();
        });

        apply((DiagnosticoHistoriaClinicaActualizado event)->{
            paciente.historiaClinica.diagnostico = event.getDiagnostico();
        });
    }
}
