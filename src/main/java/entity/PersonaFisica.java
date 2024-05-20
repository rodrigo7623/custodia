package entity;

import lombok.Data;

@Data
public class PersonaFisica extends Titular {

    private String fechaNacimiento;

    private String nombre;

    private String apellido;

    @Override
    public void setTipoDocumento(String tipoDocumento) {
        super.setTipoDocumento(tipoDocumento);
    }

    @Override
    public String successMessage() {
        return "Persona Física creada exitosamente.";
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
