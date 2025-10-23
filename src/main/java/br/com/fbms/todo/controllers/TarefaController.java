package br.com.fbms.todo.controllers;

import br.com.fbms.todo.dto.RequestTarefaDTO;
import br.com.fbms.todo.dto.ResponseTarefaDTO;
import br.com.fbms.todo.services.TarefaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tarefas")
@Tag(name = "Tarefas", description = "Operações relacionadas a criacao de tarefas")
public class TarefaController {

    @Autowired
    private TarefaService service;

    @GetMapping("/texto")
    public String obterTarefas() {
        return "Minha Lista";
    }

    @Operation(
            summary = "Listar tarefas",
            description = "Retorna uma lista com todas as tarefas cadastrads."
    )
    @ApiResponse(
            responseCode = "200",
            description = "Lista de tarefas retornada com sucesso"
    )
    @GetMapping
    public List<ResponseTarefaDTO> listar() {
        return service.obterTarefas();
    }

    @PostMapping
    public ResponseEntity<ResponseTarefaDTO> gravar(@RequestBody RequestTarefaDTO tarefaNova) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.salvar(tarefaNova));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseTarefaDTO> buscarPorId(@PathVariable(name = "id") Long idTarefa) {
        var tarefaEncontrada = service.obterTarefaPorId(idTarefa);
        return ResponseEntity.ok(tarefaEncontrada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluir(@PathVariable Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }


}
