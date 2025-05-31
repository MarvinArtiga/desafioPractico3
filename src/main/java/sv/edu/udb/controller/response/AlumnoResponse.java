package sv.edu.udb.controller.response;

import lombok.*;
import lombok.experimental.FieldNameConstants;
@Getter
@Setter
@Builder(toBuilder = true) //Es para poder modificar el objeto luego de creado
@AllArgsConstructor
@NoArgsConstructor
@FieldNameConstants //Para generar constantes con los nombres de las propiedades
@Data
public class AlumnoResponse {
    private String nombre;
    private String apellido;
//    private Long idMateria;
}