package co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.event;

import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.value.TarjetaProfesional;
import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.value.TerapeutaOcupacionalId;
import co.com.sofka.centroNeuropsicologico.domain.generics.Email;
import co.com.sofka.centroNeuropsicologico.domain.generics.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class TerapeutaOcupacionalCambiado extends DomainEvent {

    private final TerapeutaOcupacionalId terapeutaOcupacionalId;
    private final Nombre nombre;
    private final Email email;
    private final TarjetaProfesional tarjetaProfesional;

    public TerapeutaOcupacionalCambiado(TerapeutaOcupacionalId entityId, Nombre nombre, Email email, TarjetaProfesional tarjetaProfesional) {
        super("sofka.equipoProfesional.terapeutaOcupacionalCambiado");
        this.terapeutaOcupacionalId = entityId;
        this.nombre = nombre;
        this.email = email;
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public TerapeutaOcupacionalId getTerapeutaOcupacionalId() {
        return terapeutaOcupacionalId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Email getEmail() {
        return email;
    }

    public TarjetaProfesional getTarjetaProfesional() {
        return tarjetaProfesional;
    }
}
