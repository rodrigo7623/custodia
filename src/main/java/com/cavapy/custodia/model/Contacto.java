package com.cavapy.custodia.model;

import lombok.Data;

@Data
public class Contacto {

    private String direccion;

    private String callePrincipal;

    private String calleTransversal;

    private String telefonoParticular;

    private String telefonoLaboral;

    private String correoElectronico;
}
