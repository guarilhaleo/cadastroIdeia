package ideia.cadastro.service;

import ideia.cadastro.model.Cursos;

import java.util.List;

public interface CursosService {

    List<Cursos> findAll();

    Cursos findById (Long id);

    Cursos create (Cursos cursos);

    Cursos update (Cursos cursos);

    void delete (Long id);
}
