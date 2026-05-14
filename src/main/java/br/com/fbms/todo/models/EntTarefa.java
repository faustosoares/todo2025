package br.com.fbms.todo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "TB_TAREFA")
public class EntTarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private EntPessoa executor;

    public EntTarefa(){}

    public EntTarefa(Long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public EntTarefa(String titulo, EntPessoa executor) {
        this.titulo = titulo;
        this.executor = executor;
    }

    public EntTarefa(String titulo) {
        this.titulo = titulo;
    }
}
