package ideia.cadastro.controller;

import ideia.cadastro.model.Professor;
import ideia.cadastro.service.ProfessorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/cadastro/professor")

public class ProfessorController {
    private final ProfessorService professorService;

    public ProfessorController( ProfessorService professorService ) {
        this.professorService = professorService;
    }

    @GetMapping
    public ResponseEntity<List<Professor>> findAll(){
        return new ResponseEntity<>(this.professorService.findAll(), HttpStatus.OK);
    }

    @GetMapping ("/{id}")
    public ResponseEntity <Professor> findById(@PathVariable Long id){
        return new ResponseEntity<>(this.professorService.findById(id), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity <Professor> create (@RequestBody Professor professor){
        return new ResponseEntity<>(this.professorService.create(professor), HttpStatus.CREATED);
    }

    @PutMapping ("/{id}")
    public ResponseEntity <Professor> update (@PathVariable Long id, @RequestBody Professor professor){
        professor = this.professorService.findById(id);
        return new ResponseEntity<>(this.professorService.update(professor), HttpStatus.OK);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<String> delete (@PathVariable Long id) {
        this.professorService.delete(id);
        return new ResponseEntity<>("Deletado com êxito", HttpStatus.OK);

    }
}
