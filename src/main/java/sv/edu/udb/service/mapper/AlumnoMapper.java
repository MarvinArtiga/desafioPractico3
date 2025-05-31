package sv.edu.udb.service.mapper;

import org.mapstruct.Mapper;
//import sv.edu.udb.controller.request.AlumnoRequest;
//import sv.edu.udb.controller.response.AlumnoResponse;
//import sv.edu.udb.repository.domain.Alumno;
//
//import java.util.List;
//@Mapper(componentModel = "spring")
//public interface AlumnoMapper {
//    AlumnoResponse toAlumnoResponse(final Alumno data);
//    List<AlumnoResponse> toAlumnoResponseList(final List<Alumno> AlumnoList);
//    Alumno toAlumno(final AlumnoRequest alumnoRequest);
//}

//package sv.edu.udb.service.mapper;

import org.mapstruct.*;
import sv.edu.udb.controller.request.AlumnoRequest;
import sv.edu.udb.controller.response.AlumnoResponse;
import sv.edu.udb.repository.domain.Alumno;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AlumnoMapper {

    // Mapeo de Alumno (Entidad) -> AlumnoResponse (DTO)
    @Mapping(source = "nombre", target = "nombre")   // Campo a campo (opcional si coinciden nombres)
    @Mapping(source = "apellido", target = "apellido")
    AlumnoResponse toAlumnoResponse(Alumno alumno);

    // Mapeo de lista de Alumnos -> Lista de AlumnoResponse
    List<AlumnoResponse> toAlumnoResponseList(List<Alumno> alumnos);

    // Mapeo de AlumnoRequest (DTO) -> Alumno (Entidad)
    @Mapping(target = "id", ignore = true)  // Ignora el ID porque es auto-generado
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "apellido", target = "apellido")
    Alumno toAlumno(AlumnoRequest alumnoRequest);
}