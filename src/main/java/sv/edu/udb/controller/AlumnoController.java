package sv.edu.udb.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.controller.request.AlumnoRequest;
import sv.edu.udb.controller.response.AlumnoResponse;
import sv.edu.udb.service.AlumnoService;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "alumnos")

public class AlumnoController {
    private final AlumnoService alumnoService;
    @GetMapping
    public List<AlumnoResponse> findAllAlumno() {
        return alumnoService.findAll();
    }
    @GetMapping(path = "{id}")
    public AlumnoResponse findAlumnoById(@PathVariable(name = "id") final Long id) {
        return alumnoService.findById(id);
    }
    @PostMapping
    @ResponseStatus(CREATED)
    public AlumnoResponse saveAlumno(@Valid @RequestBody final AlumnoRequest request) {
        return alumnoService.save(request);
    }
    @PutMapping(path = "{id}")
    public AlumnoResponse updateAlumno(@PathVariable(name = "id") final Long id,
                                   @Valid @RequestBody final AlumnoRequest request) {
        return alumnoService.update(id, request);
    }
    @DeleteMapping(path = "{id}")
    @ResponseStatus(NO_CONTENT)
    public void deleteAlumno(@PathVariable(name = "id") final Long id) {
        alumnoService.delete(id);
    }
}
