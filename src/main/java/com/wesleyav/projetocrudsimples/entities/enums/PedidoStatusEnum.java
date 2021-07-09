package com.wesleyav.projetocrudsimples.entities.enums;

public enum PedidoStatusEnum {

	AGUARDANDO_PAGAMENTO(1),
	PAGO(2),
	ENVIADO(3),
	ENTREGUE(4),
	CANCELADO(5);

	private int codigo;

	private PedidoStatusEnum(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public static PedidoStatusEnum valueOf(int codigo) {
		for (PedidoStatusEnum value : PedidoStatusEnum.values()) {
			if (value.getCodigo() == codigo) {
				return value;
			}
		}
		throw new IllegalArgumentException("Código de status do pedido inválido");
	}
}
