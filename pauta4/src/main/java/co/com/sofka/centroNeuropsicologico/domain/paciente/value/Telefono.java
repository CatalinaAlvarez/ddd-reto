package co.com.sofka.centroNeuropsicologico.domain.paciente.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Telefono implements ValueObject<String> {

    private final String value;

    public Telefono(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El teléfono no puede estar vacío");
        }
        if(this.value.length()<7){
            throw new IllegalArgumentException("El teléfono no puede tener menos de cinco caracteres");
        }
        if(this.value.length()>200){
            throw new IllegalArgumentException("El estudio no puede tener más de doscientos caracteres");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
