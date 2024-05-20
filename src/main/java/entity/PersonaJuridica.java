package entity;

import lombok.Data;

@Data
public class PersonaJuridica extends Titular {

    private String denominacion;

    private String nombreFantasia;

    private String fechaConstitucion;

    @Override
    public String successMessage() {
        return "Persona Jurídica creada exitosamente";
    }

    @Override
    public String modifyMessage() {
        return null;
    }

    @Override
    public String deleteMessage() {
        return null;
    }
}
