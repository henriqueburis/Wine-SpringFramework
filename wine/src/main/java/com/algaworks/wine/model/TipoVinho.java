package com.algaworks.wine.model;

public enum TipoVinho {

	TINTO("Tinto"), BRANCO("Branco"), ROSE("Rose");

	private String descricao;

	TipoVinho(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
