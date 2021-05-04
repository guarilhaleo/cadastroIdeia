package ideia.cadastro.serviceImpl;

import ideia.cadastro.model.Professor;
import ideia.cadastro.repository.ProfessorRepository;
import ideia.cadastro.service.ProfessorService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service

public class ProfessorServiceImpl implements ProfessorService {

    private final ProfessorRepository professorRepository;

    public ProfessorServiceImpl( ProfessorRepository professorRepository ) {
        this.professorRepository = professorRepository;
    }

    @Override
    public List<Professor> findAll() {
        return professorRepository.findAll();
    }

    @Override
    public Professor findById( Long id ) {
        String message = String.format("Resource id %s not found", id);
        return professorRepository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException(message));
    }

    @Override
    public Professor create( Professor professor ) {
        return professorRepository.save(professor);
    }

    @Override
    public Professor update( Professor professor ) {
        return professorRepository.save(professor);
    }

    @Override
    public void delete( Long id ) {
        Professor professor = this.findById(id);
        this.professorRepository.delete(professor);


    }
}
