package br.com.fbms.todo.services;

import br.com.fbms.todo.models.EntTarefa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TarefaService {

    List<EntTarefa> tarefasBD = new ArrayList<>();

    public List<EntTarefa> obterTarefas() {
        return tarefasBD;
    }

    public EntTarefa salvar(EntTarefa tarefa) {
        tarefasBD.add(tarefa);

        return tarefa;
    }
}
