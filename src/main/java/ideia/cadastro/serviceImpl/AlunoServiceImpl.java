package ideia.cadastro.serviceImpl;

import ideia.cadastro.model.Aluno;
import ideia.cadastro.repository.AlunoRepository;
import ideia.cadastro.service.AlunoService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service

public class AlunoServiceImpl implements AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoServiceImpl( AlunoRepository alunoRepository ) {
        this.alunoRepository = alunoRepository;
    }

    @Override
    public List<Aluno> findAll() {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno findById( Long id ) {
        String message = String.format("Resource id %s not found", id);
        return this.alunoRepository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException(message));
    }

    @Override
    public Aluno create( Aluno aluno ) {
        return alunoRepository.save(aluno);
    }

    @Override
    public Aluno update( Aluno aluno ) {
        return alunoRepository.save(aluno);
    }

    @Override
    public void delete( Long id ) {

        Aluno aluno = this.findById(id);
        this.alunoRepository.delete(aluno);
    }
}
