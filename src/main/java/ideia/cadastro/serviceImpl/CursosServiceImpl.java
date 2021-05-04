package ideia.cadastro.serviceImpl;

import ideia.cadastro.model.Cursos;
import ideia.cadastro.repository.CursosRepository;
import ideia.cadastro.service.CursosService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
@Service



public class CursosServiceImpl implements CursosService {

    private final CursosRepository cursosRepository;

    public CursosServiceImpl( CursosRepository cursosRepository ) {
        this.cursosRepository = cursosRepository;
    }


    @Override
    public List<Cursos> findAll() {
        return cursosRepository.findAll();
    }

    @Override
    public Cursos findById( Long id ) {
        String message = String.format("Resource id %s not found", id);
        return this.cursosRepository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException(message));
    }

    @Override
    public Cursos create( Cursos cursos ) {
        return cursosRepository.save(cursos);
    }

    @Override
    public Cursos update( Cursos cursos ) {
        return cursosRepository.save(cursos);
    }

    @Override
    public void delete( Long id ) {

        Cursos cursos = this.findById(id);
        this.cursosRepository.delete(cursos);

    }
}
