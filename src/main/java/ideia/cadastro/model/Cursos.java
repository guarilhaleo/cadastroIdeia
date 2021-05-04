package ideia.cadastro.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table

public class Cursos {
    @Id
    @GeneratedValue
    private Long id;

    @Column (nullable = false)
    private String nome;

    @Column (nullable = false)
    private Integer turma;
}
