package ideia.cadastro.repository;

import ideia.cadastro.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AlunoRepository extends JpaRepository <Aluno,Long>{

}
