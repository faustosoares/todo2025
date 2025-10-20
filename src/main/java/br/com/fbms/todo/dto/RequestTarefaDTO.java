package br.com.fbms.todo.dto;

import br.com.fbms.todo.models.EntTarefa;

public record RequestTarefaDTO(
        String titulo
) {

    public EntTarefa map() {
        return new EntTarefa(this.titulo);
    }

}
