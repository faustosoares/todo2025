package br.com.fbms.todo.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "TB_TAREFA")
public class EntTarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;


    public EntTarefa(String titulo) {
        this.titulo = titulo;
    }
}
