package br.com.fbms.todo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_TAREFA")
public class EntTarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    public EntTarefa(){}

    public EntTarefa(Long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public EntTarefa(String titulo) {
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
