package entity;

import com.cavapy.custodia.model.Contacto;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

@Data
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)
@JsonSubTypes(
        {
                @JsonSubTypes.Type(value = PersonaFisica.class, name = "personaFisica"),
                @JsonSubTypes.Type(value = PersonaJuridica.class, name = "personaJuridica")
        }
)
public abstract class Titular {

    private String tipoDocumento;

    private String nroDocumento;

    private Contacto contacto;


    public abstract String successMessage();

    public abstract String modifyMessage();

    public abstract String deleteMessage();
}