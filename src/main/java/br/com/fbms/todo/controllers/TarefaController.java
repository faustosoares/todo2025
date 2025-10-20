package br.com.fbms.todo.controllers;

import br.com.fbms.todo.dto.RequestTarefaDTO;
import br.com.fbms.todo.dto.ResponseTarefaDTO;
import br.com.fbms.todo.services.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<ResponseTarefaDTO> listar() {
        return service.obterTarefas();
    }

    @PostMapping
    public ResponseTarefaDTO gravar(@RequestBody RequestTarefaDTO tarefaNova) {
        return service.salvar(tarefaNova);
    }

    @GetMapping("/{id}")
    public ResponseTarefaDTO buscarPorId(@PathVariable(name = "id") Long idTarefa) {
        return service.obterTarefaPorId(idTarefa);
    }


}
