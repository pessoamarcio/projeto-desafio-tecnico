package sistemapedidos.dto;

import sistemapedidos.model.StatusCliente;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record ClienteCreateRequest(
		@NotBlank(message = "nome Ã© obrigatÃ³rio")
		String nome,
		@NotBlank(message = "email Ã© obrigatÃ³rio")
		@Email(message = "email invÃ¡lilido")
		String email,
		@NotBlank(message = "cpf Ã© obrigatÃ³rio")
		String cpf,
		StatusCliente status
){}
