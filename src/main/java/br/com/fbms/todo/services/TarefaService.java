package br.com.fbms.todo.services;

import br.com.fbms.todo.dto.RequestTarefaDTO;
import br.com.fbms.todo.dto.ResponseTarefaDTO;
import br.com.fbms.todo.models.EntTarefa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TarefaService {

    List<EntTarefa> tarefasBD = new ArrayList<>();
    Long contador = 1L;

    public List<EntTarefa> obterTarefas() {
        return tarefasBD;
    }

    public ResponseTarefaDTO salvar(RequestTarefaDTO nova) {

        EntTarefa tarefa = nova.map(contador++);
        tarefasBD.add(tarefa);

        return new ResponseTarefaDTO(tarefa.getId(), tarefa.getTitulo());
    }
}
