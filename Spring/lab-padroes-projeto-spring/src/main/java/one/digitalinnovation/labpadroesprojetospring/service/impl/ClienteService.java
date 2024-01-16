package one.digitalinnovation.labpadroesprojetospring.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import one.digitalinnovation.labpadroesprojetospring.model.Cliente;

@Component
public interface ClienteService {

	Iterable<Cliente> buscarTodos();
	Cliente buscarPorId(Long id);
	void inserir(Cliente cliente);
	void atualizar(Long id, Cliente cliente);
	void deletar(Long id);

}
