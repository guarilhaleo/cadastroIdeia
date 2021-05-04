package ideia.cadastro.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table

public class Aluno {
    @Id
    @GeneratedValue
    private Long id;

    @Column (nullable = false)
    private String nome;

    @Column (nullable = false)
    private Long cpf;

    @Column (nullable = false)
    private String endereco;

    @Column (nullable = false)
    private Long telefone;
}
