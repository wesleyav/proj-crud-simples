package com.wesleyav.projetocrudsimples.entities;

import java.time.Instant;
import java.util.Objects;

import com.wesleyav.projetocrudsimples.entities.enums.PedidoStatusEnum;

public class Pedido {

	private Long id;
	private Instant momento;
	private Integer pedidoStatusEnum;

	private Usuario usuario;

	public Pedido() {
	}

	public Pedido(Long id, Instant momento, PedidoStatusEnum pedidoStatusEnum, Usuario usuario) {
		super();
		this.id = id;
		this.momento = momento;
		setPedidoStatusEnum(pedidoStatusEnum);
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMomento() {
		return momento;
	}

	public void setMomento(Instant momento) {
		this.momento = momento;
	}

	public PedidoStatusEnum getPedidoStatusEnum() {
		return PedidoStatusEnum.valueOf(pedidoStatusEnum);
	}

	public void setPedidoStatusEnum(PedidoStatusEnum pedidoStatusEnum) {
		if (pedidoStatusEnum != null) {
			this.pedidoStatusEnum = pedidoStatusEnum.getCodigo();
		}
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(id, other.id);
	}

}
