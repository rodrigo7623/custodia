package controller;

import com.cavapy.custodia.util.CustodiaResponse;
import entity.Deposito;
import entity.Titular;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

@CrossOrigin
@RestController
@RequestMapping(value = "/v1/titular")
@Tag(name = "Operaciones del Titular", description = "Operaciones relacionadas el Titular")
public class TitularController {

    @Operation(summary = "Agregar Titular", description = "Agrega un nuevo titular.")
    @ApiResponse(responseCode = "200", description = "Operación exitosa",
            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = String.class)))
    @PostMapping(value = "/agregar", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> altaTitular(@RequestBody Titular titular) {
        return new ResponseEntity<>(new CustodiaResponse(titular.successMessage()), HttpStatus.OK);
    }

    @Operation(summary = "Modificar Titular", description = "Modifica un titular existente.")
    @ApiResponse(responseCode = "200", description = "Operación exitosa",
            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = String.class)))
    @PutMapping(value = "/modificar")
    public ResponseEntity<?> modificarTitular(@RequestBody Titular titular) {
        return new ResponseEntity<>(new CustodiaResponse(titular.modifyMessage()), HttpStatus.OK);
    }

    @Operation(summary = "Eliminar Titular", description = "Elimina un titular existente.")
    @ApiResponse(responseCode = "200", description = "Operación exitosa",
            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = String.class)))
    @DeleteMapping(value = "/eliminar")
    public ResponseEntity<?> eliminarTitular(@RequestBody Titular titular) {
        return new ResponseEntity<>(new CustodiaResponse(titular.deleteMessage()), HttpStatus.OK);
    }

    @Operation(summary = "Consultar Titular", description = "Consulta un titular existente.")
    @ApiResponse(responseCode = "200", description = "Operación exitosa",
            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = Titular.class)))
    @GetMapping(value = "/consultar")
    public ResponseEntity<Titular> consultarTitular(@RequestBody Titular titular) {
        return new ResponseEntity<>(titular, HttpStatus.OK);
    }

}
