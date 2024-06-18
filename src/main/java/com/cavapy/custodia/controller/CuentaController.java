package com.cavapy.custodia.controller;

import com.cavapy.custodia.util.CustodiaResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/cuentas")
@Tag(name = "Operaciones de cuentas", description = "Operaciones relacionadas con cuentas")
public class CuentaController {


    @Operation(summary = "Cobro de depósito",
            description = "Realiza el cobro de depósito en la cuenta.")
    @ApiResponse(responseCode = "200",
            description = "Operación realizada con éxito",
            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = String.class)))
    @PostMapping(value = "/cobro-deposito", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> cobroDeposito() {
        return new ResponseEntity<>(new CustodiaResponse("Operación realizada con éxito."), HttpStatus.OK);
    }
}
