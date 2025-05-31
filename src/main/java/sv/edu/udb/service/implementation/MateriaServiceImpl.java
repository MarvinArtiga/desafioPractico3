package sv.edu.udb.service.implementation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sv.edu.udb.controller.request.MateriaRequest;
import sv.edu.udb.controller.response.MateriaResponse;
import sv.edu.udb.repository.MateriaRepository;
import sv.edu.udb.repository.domain.Materia;
import sv.edu.udb.service.MateriaService;
import sv.edu.udb.service.mapper.MateriaMapper;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MateriaServiceImpl implements MateriaService {
    private final MateriaRepository repository;
    private final MateriaMapper mapper;

    @Override
    public MateriaResponse save(MateriaRequest request) {
        Materia materia = mapper.toMateria(request);
        return mapper.toMateriaResponse(repository.save(materia));
    }

    @Override
    public List<MateriaResponse> findAll() {
        return repository.findAll().stream()
                .map(mapper::toMateriaResponse)
                .toList();
    }

    @Override
    public MateriaResponse findById(Long id) {
        return mapper.toMateriaResponse(
                repository.findById(id)
                        .orElseThrow(() -> new EntityNotFoundException("Materia no encontrada"))
        );
    }

    @Override
    public MateriaResponse update(Long id, MateriaRequest request) {
        Materia materia = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Materia no encontrada"));
        materia.setNombre(request.getNombre());
        return mapper.toMateriaResponse(repository.save(materia));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}