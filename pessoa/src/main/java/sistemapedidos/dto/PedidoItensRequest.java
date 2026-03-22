package sistemapedidos.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record PedidoItensRequest(
        @NotEmpty(message = "itens Ã© obrigatÃ³rio")
        List<@NotNull PedidoItemRequest> itens
) {
}