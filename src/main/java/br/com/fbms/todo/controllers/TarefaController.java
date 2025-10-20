package br.com.fbms.todo.controllers;

import br.com.fbms.todo.models.EntTarefa;
import br.com.fbms.todo.services.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("tarefas")
public class TarefaController {

    @Autowired
    private TarefaService service;

    @GetMapping("/texto")
    public String obterTarefas() {
        return "Minha Lista";
    }

    @GetMapping
    public List<EntTarefa> listar() {
        return service.obterTarefas();
    }


}
