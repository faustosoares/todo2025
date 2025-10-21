package br.com.fbms.todo.mappers;


import br.com.fbms.todo.dto.RequestTarefaDTO;
import br.com.fbms.todo.dto.ResponseTarefaDTO;
import br.com.fbms.todo.models.EntTarefa;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(
        nullValueMapMappingStrategy = NullValueMappingStrategy.RETURN_NULL,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface TarefaMapper {

    ResponseTarefaDTO mapResponseFromTarefa(EntTarefa tarefa);

    EntTarefa toEntTarefa(RequestTarefaDTO request);

}
