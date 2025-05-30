package sv.edu.udb.repository.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@Entity //Anotacion para marcar que es una entidad de negocio
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id //definicion del id (es una anotacion obligatoria si se usa entity)
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //Generacion automatica de id
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private LocalDate postDate;
}