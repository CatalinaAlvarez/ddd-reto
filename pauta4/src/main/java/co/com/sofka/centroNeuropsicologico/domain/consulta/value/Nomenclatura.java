package co.com.sofka.centroNeuropsicologico.domain.consulta.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nomenclatura implements ValueObject<String> {

    private final String value;

    public Nomenclatura(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La nomenclatura no puede estar vacía");
        }
        if(this.value.length()>10){
            throw new IllegalArgumentException("La nomenclatura no puede tener más de diez caracteres");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nomenclatura that = (Nomenclatura) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String value() {
        return value;
    }
}
