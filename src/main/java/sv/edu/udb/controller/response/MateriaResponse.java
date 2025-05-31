package sv.edu.udb.controller.response;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MateriaResponse {
    private Long id;
    private String nombre;
}