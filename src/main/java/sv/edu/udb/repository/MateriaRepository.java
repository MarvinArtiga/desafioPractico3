package sv.edu.udb.repository;

import sv.edu.udb.repository.domain.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface MateriaRepository extends JpaRepository<Materia, Long> {
    Optional<Materia> findByNombre(String nombre);
}