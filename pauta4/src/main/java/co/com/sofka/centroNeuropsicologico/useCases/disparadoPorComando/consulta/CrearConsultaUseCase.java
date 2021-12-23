package co.com.sofka.centroNeuropsicologico.useCases.disparadoPorComando.consulta;

import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.centroNeuropsicologico.domain.consulta.command.CrearConsulta;
import co.com.sofka.business.generic.UseCase;


public class CrearConsultaUseCase extends UseCase<RequestCommand<CrearConsulta>, ResponseEvents>{


    @Override
    public void executeUseCase(RequestCommand<CrearConsulta> crearConsultaRequestCommand) {

    }
}
