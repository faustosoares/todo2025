package br.com.fbms.todo.dto;

import br.com.fbms.todo.models.EntTarefa;

public record ResponseTarefaDTO(
        Long id,
        String titulo
) {
}
