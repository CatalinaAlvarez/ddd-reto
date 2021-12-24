package co.com.sofka.centroNeuropsicologico.useCases.disparadoPorComando.equipoProfesional;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.EquipoProfesional;
import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.command.AgregarPsicologo;
import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.value.EquipoProfesionalId;
import co.com.sofka.centroNeuropsicologico.domain.equipoProfesional.value.TipoEquipo;
import co.com.sofka.centroNeuropsicologico.domain.paciente.command.AgregarAcudiente;

public class AgregarPsicologoUseCase extends UseCase<RequestCommand<AgregarPsicologo>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarPsicologo> agregarPsicologoRequestCommand) {
        var command = agregarPsicologoRequestCommand.getCommand();

        EquipoProfesional equipoProfesional;

        equipoProfesional = new EquipoProfesional(
                new EquipoProfesionalId(),
                new TipoEquipo(TipoEquipo.Valor.INFANCIA)
        );

        equipoProfesional.agregarPsicologo(
                command.getNombre(),
                command.getEmail(),
                command.getTarjetaProfesional());

        emit().onResponse(new ResponseEvents(equipoProfesional.getUncommittedChanges()));
    }
}
