package sv.edu.udb.controller.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MateriaRequest {
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;
}