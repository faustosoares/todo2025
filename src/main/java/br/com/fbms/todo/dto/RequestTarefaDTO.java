package br.com.fbms.todo.dto;

import br.com.fbms.todo.models.EntTarefa;

public record RequestTarefaDTO(
        String titulo
) {

    public EntTarefa map(Long id) {
        return new EntTarefa(id, this.titulo);
    }

}
