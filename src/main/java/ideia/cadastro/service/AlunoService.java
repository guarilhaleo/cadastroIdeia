package ideia.cadastro.service;

import ideia.cadastro.model.Aluno;

import java.util.List;

public interface AlunoService {

    List<Aluno> findAll();

    Aluno findById (Long id);

    Aluno create (Aluno aluno);

    Aluno update (Aluno aluno);

    void delete (Long id);

}
