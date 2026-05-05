package br.com.fiapride.model;

public class GalaxyWatch extends Smartwatch{
	
	private int armazenamento;
	
	public GalaxyWatch(String marca, Dono usuario, int armazenamento) {
		super(marca, usuario);
		this.setArmazenamento(armazenamento);
		
	}
	
	public int getArmazenamento() {
		return this.armazenamento;
	}
	
	private void setArmazenamento(int armazenamento) {
		this.armazenamento = armazenamento;
	}
}
