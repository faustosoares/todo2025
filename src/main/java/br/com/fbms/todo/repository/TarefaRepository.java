package br.com.fbms.todo.repository;

import br.com.fbms.todo.models.EntTarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<EntTarefa, Long> {
}
