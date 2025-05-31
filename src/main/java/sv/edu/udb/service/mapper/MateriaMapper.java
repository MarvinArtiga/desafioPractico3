package sv.edu.udb.service.mapper;

import org.mapstruct.*;
import sv.edu.udb.controller.request.MateriaRequest;
import sv.edu.udb.controller.response.MateriaResponse;
import sv.edu.udb.repository.domain.Materia;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MateriaMapper {
    List<MateriaResponse> toMateriaResponseList(List<Materia> MateriaList);

    Materia toMateria(MateriaRequest request);
    MateriaResponse toMateriaResponse(Materia materia);
}