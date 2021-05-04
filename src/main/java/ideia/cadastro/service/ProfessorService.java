package ideia.cadastro.service;

import ideia.cadastro.model.Professor;

import java.util.List;

public interface ProfessorService {

    List<Professor> findAll();

    Professor findById ( Long id);

    Professor create ( Professor professor);

    Professor update ( Professor professor);

    void delete (Long id);
}
