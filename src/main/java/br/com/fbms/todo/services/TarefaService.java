package br.com.fbms.todo.services;

import br.com.fbms.todo.dto.RequestTarefaDTO;
import br.com.fbms.todo.dto.ResponseTarefaDTO;
import br.com.fbms.todo.exceptions.BadRequest;
import br.com.fbms.todo.mappers.TarefaMapper;
import br.com.fbms.todo.models.EntTarefa;
import br.com.fbms.todo.repository.TarefaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TarefaService {

    private final TarefaRepository repository;
    private final TarefaMapper mapper;

    public List<ResponseTarefaDTO> obterTarefas() {
       return repository.findAll().stream()
               .map(mapper::mapResponseFromTarefa)
               .toList();
    }

    public ResponseTarefaDTO salvar(RequestTarefaDTO nova) {
        EntTarefa tarefa = mapper.toEntTarefa(nova);
        var tarefaSalva = repository.save(tarefa);

        return mapper.mapResponseFromTarefa(tarefaSalva);
    }

    public ResponseTarefaDTO obterTarefaPorId(Long id) {
        var tarefaEncontrada = repository.findById(id)
                .orElseThrow(() -> new BadRequest("Tarefa não encontrada"));

        return mapper.mapResponseFromTarefa(tarefaEncontrada);
    }

    public void remover(Long id) {
        var tarefa = repository.findById(id)
                .orElseThrow(() -> new BadRequest("Tarefa não encontrado"));

        repository.delete(tarefa);
    }


}
