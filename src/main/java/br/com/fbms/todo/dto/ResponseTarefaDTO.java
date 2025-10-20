package br.com.fbms.todo.dto;

import br.com.fbms.todo.models.EntTarefa;

public record ResponseTarefaDTO(
        Long id,
        String titulo
) {

    public static ResponseTarefaDTO convert(EntTarefa tarefa) {
        return new ResponseTarefaDTO(tarefa.getId(), tarefa.getTitulo());
    }
}
