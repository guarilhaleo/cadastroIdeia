package ideia.cadastro.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data

public class Professor {

    @Id
    @GeneratedValue
    private Long id;

    @Column (nullable = false)
    private String nome;


}
