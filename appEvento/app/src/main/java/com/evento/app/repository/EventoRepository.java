package com.evento.app.repository;

import org.springframework.data.repository.CrudRepository;
import com.evento.app.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{
	Evento findByCodigo(long codigo);
}
