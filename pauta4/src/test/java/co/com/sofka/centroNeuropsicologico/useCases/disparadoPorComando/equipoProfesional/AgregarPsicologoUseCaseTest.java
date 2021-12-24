package co.com.sofka.centroNeuropsicologico.useCases.disparadoPorComando.equipoProfesional;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.command.AgregarPsicologo;
import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.event.PsicologoAgregado;
import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.value.EquipoProfesionalId;
import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.value.PsicologoId;
import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.value.TarjetaProfesional;
import co.com.sofka.centroNeuropsicologico.domain.generics.Email;
import co.com.sofka.centroNeuropsicologico.domain.generics.Nombre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgregarPsicologoUseCaseTest {

    @Test
    void psicologoAgregadoUseCaseTest(){

        //arrange
        EquipoProfesionalId equipoProfesionalId = EquipoProfesionalId.of("xxxx");
        PsicologoId psicologoId = new PsicologoId();
        Nombre nombre = new Nombre("Claudia");
        Email email = new Email("claudia@gmail.com");
        TarjetaProfesional tarjetaProfesional = new TarjetaProfesional("15987455");

        var command = new AgregarPsicologo(equipoProfesionalId, psicologoId, nombre, email, tarjetaProfesional);
        var useCase = new AgregarPsicologoUseCase();

        //act

        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

        //asserts

        var event = (PsicologoAgregado)events.getDomainEvents().get(1);
        Assertions.assertEquals("Claudia", event.getNombre().value());
        Assertions.assertEquals("claudia@gmail.com", event.getEmail().value());
        Assertions.assertEquals("15987455", event.getTarjetaProfesional().value());
    }

}