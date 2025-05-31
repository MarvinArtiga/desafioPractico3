package sv.edu.udb.service.mapper;

import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import sv.edu.udb.controller.response.AlumnoResponse;
import sv.edu.udb.repository.domain.Alumno;

@MapperConfig(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE  // Ignora campos no mapeados
)
public interface MapStructConfig {
    // Configuración global para mapeos personalizados
    @Mapping(source = "nombre", target = "Nombre")  // Ejemplo si usas mayúsculas en DTO
    @Mapping(source = "apellido", target = "Apellido")
    AlumnoResponse globalMapping(Alumno alumno);
}