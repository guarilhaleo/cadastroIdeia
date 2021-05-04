package ideia.cadastro.controller;

import ideia.cadastro.model.Aluno;
import ideia.cadastro.service.AlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/cadastro/aluno")

public class AlunoController {
    private final AlunoService alunoService;

    public AlunoController( AlunoService alunoService ) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public ResponseEntity <List<Aluno>> findAll(){
        return new ResponseEntity<>(this.alunoService.findAll(),HttpStatus.OK);
    }

    @GetMapping ("/{id}")
    public ResponseEntity <Aluno> findById(@PathVariable Long id){
        return new ResponseEntity<>(this.alunoService.findById(id), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity <Aluno> create (@RequestBody Aluno aluno){
        return new ResponseEntity<>(this.alunoService.create(aluno), HttpStatus.CREATED);
    }

    @PutMapping ("/{id}")
    public ResponseEntity <Aluno> update (@PathVariable Long id, @RequestBody Aluno aluno){
        aluno = this.alunoService.findById(id);
        return new ResponseEntity<>(this.alunoService.update(aluno), HttpStatus.OK);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<String> delete (@PathVariable Long id){
        this.alunoService.delete(id);
        return new ResponseEntity<>("Deletado com êxito" , HttpStatus.OK);
    }

}
