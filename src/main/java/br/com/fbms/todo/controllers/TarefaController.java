package br.com.fbms.todo.controllers;

import br.com.fbms.todo.models.EntTarefa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("tarefas")
public class TarefaController {

    @GetMapping("/texto")
    public String obterTarefas() {
        return "Minha Lista";
    }

    @GetMapping
    public List<EntTarefa> obterLista() {

        var t1 = new EntTarefa(1L, "Estudar para prova");
        var t2 = new EntTarefa(2L, "Gravar podcast");

        return Arrays.asList(t1, t2);
    }



}
