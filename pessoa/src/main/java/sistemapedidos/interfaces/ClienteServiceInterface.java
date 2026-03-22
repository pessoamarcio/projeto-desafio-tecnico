package sistemapedidos.interfaces;

import sistemapedidos.model.Cliente;
import sistemapedidos.model.StatusCliente;

import java.util.UUID;

public interface ClienteServiceInterface {
	Cliente cadastrar(String nome, String email, String cpf, StatusCliente status);
	Cliente buscarPorId(UUID id);
}
