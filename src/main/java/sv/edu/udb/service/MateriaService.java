package sv.edu.udb.service;

import sv.edu.udb.controller.response.MateriaResponse;
import sv.edu.udb.controller.request.MateriaRequest;
import java.util.List;

public interface MateriaService {
    MateriaResponse save(MateriaRequest request);
    List<MateriaResponse> findAll();
    MateriaResponse findById(Long id);
    MateriaResponse update(Long id, MateriaRequest request);
    void delete(Long id);
}