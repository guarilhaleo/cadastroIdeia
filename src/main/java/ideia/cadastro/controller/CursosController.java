package ideia.cadastro.controller;


import ideia.cadastro.model.Aluno;
import ideia.cadastro.model.Cursos;
import ideia.cadastro.service.AlunoService;
import ideia.cadastro.service.CursosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/cadastro/cursos")

public class CursosController {
    private final CursosService cursosService;

    public CursosController( CursosService cursosService ) {
        this.cursosService = cursosService;
    }

    @GetMapping
    public ResponseEntity<List<Cursos>> findAll(){
        return new ResponseEntity<>(this.cursosService.findAll(), HttpStatus.OK);
    }

    @GetMapping ("/{id}")
    public ResponseEntity <Cursos> findById(@PathVariable Long id){
        return new ResponseEntity<>(this.cursosService.findById(id), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity <Cursos> create (@RequestBody Cursos cursos){
        return new ResponseEntity<>(this.cursosService.create(cursos), HttpStatus.CREATED);
    }

    @PutMapping ("/{id}")
    public ResponseEntity <Cursos> update (@PathVariable Long id, @RequestBody Cursos cursos){
        cursos = this.cursosService.findById(id);
        return new ResponseEntity<>(this.cursosService.update(cursos), HttpStatus.OK);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<String> delete (@PathVariable Long id){
        this.cursosService.delete(id);
        return new ResponseEntity<>("Deletado com êxito" , HttpStatus.OK);
    }
}
