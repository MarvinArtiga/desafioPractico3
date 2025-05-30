package sv.edu.udb.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.controller.request.MateriaRequest;
import sv.edu.udb.controller.response.MateriaResponse;
import sv.edu.udb.service.MateriaService;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "materias")

public class MateriaController {
    private final MateriaService materiaService;
    @GetMapping
    public List<MateriaResponse> findAllMateria() {
        return materiaService.findAll();
    }
    @GetMapping(path = "{id}")
    public MateriaResponse findMateriaById(@PathVariable(name = "id") final Long id) {
        return materiaService.findById(id);
    }
    @PostMapping
    @ResponseStatus(CREATED)
    public MateriaResponse saveMateria(@Valid @RequestBody final MateriaRequest request) {
        return materiaService.save(request);
    }
    @PutMapping(path = "{id}")
    public MateriaResponse updateMateria(@PathVariable(name = "id") final Long id,
                                       @Valid @RequestBody final MateriaRequest request) {
        return materiaService.update(id, request);
    }
    @DeleteMapping(path = "{id}")
    @ResponseStatus(NO_CONTENT)
    public void deleteMateria(@PathVariable(name = "id") final Long id) {
        materiaService.delete(id);
    }
}
