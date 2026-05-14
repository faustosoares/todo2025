package br.com.fbms.todo.dto;

import br.com.fbms.todo.models.EntTarefa;

public record RequestTarefaDTO(
        String titulo,
        Long id_pessoa
) {

    public EntTarefa map() {
        return new EntTarefa(this.titulo);
    }

}
