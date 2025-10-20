package br.com.fbms.todo.services;

import br.com.fbms.todo.dto.RequestTarefaDTO;
import br.com.fbms.todo.dto.ResponseTarefaDTO;
import br.com.fbms.todo.exceptions.BadRequest;
import br.com.fbms.todo.models.EntTarefa;
import br.com.fbms.todo.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository repository;

    public List<ResponseTarefaDTO> obterTarefas() {
       return repository.findAll().stream()
               .map(t ->new ResponseTarefaDTO(t.getId(), t.getTitulo()))
               .toList();
    }

    public ResponseTarefaDTO salvar(RequestTarefaDTO nova) {
        EntTarefa tarefa = nova.map();
        var tarefaSalva = repository.save(tarefa);

        return new ResponseTarefaDTO(tarefaSalva.getId(), tarefaSalva.getTitulo());
    }

    public ResponseTarefaDTO obterTarefaPorId(Long id) {
        var tarefaEncontrada = repository.findById(id)
                .orElseThrow(() -> new BadRequest("Tarefa não encontrada"));

        return ResponseTarefaDTO.convert(tarefaEncontrada);
    }


}
