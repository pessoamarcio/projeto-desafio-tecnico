package sistemapedidos.dto;

import sistemapedidos.model.StatusProduto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public record ProdutoCreateRequest(
		@NotBlank(message = "nome obrigatÃ³rio")
		String nome,
		@NotNull(message = "preÃ§o Ã© obrigatÃ³rio")
		BigDecimal preco,
		@PositiveOrZero(message = "Quantidade em estoque deve ser maior ou igual a 0")
		int quantidadeEmEstoque,
		StatusProduto status
) {
}

