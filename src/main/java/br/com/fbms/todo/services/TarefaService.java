package br.com.fbms.todo.services;

import br.com.fbms.todo.models.EntTarefa;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TarefaService {

    public List<EntTarefa> obterTarefas() {
        var t1 = new EntTarefa(1L, "Estudar para prova");
        var t2 = new EntTarefa(2L, "Gravar podcast");

        return Arrays.asList(t1, t2);
    }
}
