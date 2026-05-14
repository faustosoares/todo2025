package br.com.fbms.todo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

@Entity
@Table(name = "TB_PESSOA")
public class EntPessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "executor")
    private List<EntTarefa> tarefas;

    public EntPessoa() {}

    public EntPessoa(String nome) {
        this.nome = nome;
    }
}