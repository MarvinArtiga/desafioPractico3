package sv.edu.udb.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.controller.request.MateriaRequest;
import sv.edu.udb.controller.response.MateriaResponse;
import sv.edu.udb.service.MateriaService;
import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/materias")
@RequiredArgsConstructor
public class MateriaController {
    private final MateriaService service;

    @PostMapping
    @ResponseStatus(CREATED)
    public MateriaResponse save(@Valid @RequestBody MateriaRequest request) {
        return service.save(request);
    }

    @GetMapping
    public List<MateriaResponse> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public MateriaResponse findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public MateriaResponse update(
            @PathVariable Long id,
            @Valid @RequestBody MateriaRequest request
    ) {
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}