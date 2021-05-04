package ideia.cadastro.repository;

import ideia.cadastro.model.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CursosRepository extends JpaRepository<Cursos,Long> {
}
