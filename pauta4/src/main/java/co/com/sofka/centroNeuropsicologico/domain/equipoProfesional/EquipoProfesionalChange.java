package co.com.sofka.centroNeuropsicologico.domain.equipoProfesional;

import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.event.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class EquipoProfesionalChange extends EventChange {
    public EquipoProfesionalChange(EquipoProfesional equipoProfesional) {

        apply((EquipoProfesionalCreado event)->{
            equipoProfesional.psicologo = event.getPsicologo();
            equipoProfesional.neuropsicologo = event.getNeuropsicologo();
            equipoProfesional.terapeutaOcupacional = event.getTerapeutaOcupacional();
        });

        apply((PsicologoCambiado event)->{
            equipoProfesional.psicologo.identity() ;
            equipoProfesional.psicologo.nombre = event.getNombre();
            equipoProfesional.psicologo.email = event.getEmail();
            equipoProfesional.psicologo.tarjetaProfesional = event.getTarjetaProfesional();
            equipoProfesional.psicologo.estudios = new HashSet<>();
        });

        apply((NeuropsicologoCambiado event)->{
            equipoProfesional.neuropsicologo.nombre = event.getNombre();
            equipoProfesional.neuropsicologo.email = event.getEmail();
            equipoProfesional.neuropsicologo.tarjetaProfesional = event.getTarjetaProfesional();
            equipoProfesional.neuropsicologo.estudios = new HashSet<>();
        });

        apply((TerapeutaOcupacionalCambiado event)->{
            equipoProfesional.terapeutaOcupacional.nombre = event.getNombre();
            equipoProfesional.terapeutaOcupacional.email = event.getEmail();
            equipoProfesional.terapeutaOcupacional.tarjetaProfesional = event.getTarjetaProfesional();
            equipoProfesional.terapeutaOcupacional.estudios = new HashSet<>();
        });

        apply((EmailPsicologoActualizado event)->{
            equipoProfesional.psicologo.email = event.getEmail();
        });

        apply((EstudioPsicologoAgregado event)->{ //REVISAR
            equipoProfesional.psicologo.estudios.add(event.getEstudio());
        });

        apply((EmailNeuropsicologoActualizado event)->{
            equipoProfesional.neuropsicologo.email = event.getEmail();
        });

        apply((EstudioNeuropsicologoAgregado event)->{ //REVISAR
            equipoProfesional.neuropsicologo.estudios.add(event.getEstudio());
        });

        apply((EmailTerapeutaOcupacionalActualizado event)->{
            equipoProfesional.terapeutaOcupacional.email = event.getEmail();
        });

        apply((EstudioTerapeutaOcupacionalAgregado event)->{ //REVISAR
            equipoProfesional.terapeutaOcupacional.estudios.add(event.getEstudio());
        });
    }
}
