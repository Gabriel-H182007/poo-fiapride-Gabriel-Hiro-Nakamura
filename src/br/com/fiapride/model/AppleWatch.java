package br.com.fiapride.model;

public class AppleWatch extends Smartwatch {
	
	private String compatibilidade;
	
	public AppleWatch(String marca, Dono usuario, String compatibilidade) {
		super(marca, usuario);
		this.setCompatibilidade(compatibilidade);
	}
	
	public String getCompatibilidade() {
		return this.compatibilidade;
	}
	
	private void setCompatibilidade(String compatibilidade) {
		this.compatibilidade = compatibilidade;
	}
}
