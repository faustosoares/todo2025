package br.com.fbms.todo.dto;

import br.com.fbms.todo.models.EntTarefa;

public record ResponsePessoaDTO(
        Long id,
        String nome
) {

    public static ResponsePessoaDTO convert(EntTarefa tarefa) {
        return new ResponsePessoaDTO(tarefa.getId(), tarefa.getTitulo());
    }
}
