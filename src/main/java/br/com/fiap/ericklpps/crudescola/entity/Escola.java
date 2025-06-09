package br.com.fiap.ericklpps.crudescola.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "escola")
public class Escola {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private String id;
    private String nome;
    private String cidade;
    private String estado;
    private Character ativo;
}