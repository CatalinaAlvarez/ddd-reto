package co.com.sofka.centroNeuropsicologico.domain.consulta.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Tipo implements ValueObject<String> {

    private final String value;

    public Tipo(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El tipo no puede estar vacío");
        }
        if(this.value.length()<4){
            throw new IllegalArgumentException("El tipo no puede tener menos de cuatro caracteres");
        }
        if(this.value.length()>50){
            throw new IllegalArgumentException("El tipo no puede tener más de cincuenta caracteres");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
