package br.com.fiapride.model;

public class Smartwatch {
	private String marca;
	private String corPlanoDeFundo;
	private int tamanho;
	private int nivelBateria;
	private int batimentosPorMinuto;
	private boolean estaNoPulso;
	private Dono usuario;
	
	public Smartwatch(String marca, String corPlanoDeFundo, Dono usuario) {
		this.setMarca(marca);
		this.setCorPlanoDeFundo(corPlanoDeFundo);
		this.setTamanho(44);
		this.setNivelBateria(100);
		this.setBatimentosPorMinuto(65);
		this.setEstaNoPulso(true);
		this.usuario = usuario;
	}
	public void informarFrequenciaCardiaca() {
		if (this.estaNoPulso == false){
			System.out.println("Erro: O relógio precisa estar no pulso");
			return;
		} else if(this.nivelBateria <= 0) {
			System.out.println("Erro: O nível de bateria deve ser suficiente");
			return;
		}
		System.out.println("Medindo a frequência cardíaca...");
		System.out.println("Sua frequência cardíaca é de: " + this.batimentosPorMinuto + "ppm");
		
	}
	public void mudarCorPlanoDeFundo(String corPlanoDeFundo) {
		if(this.nivelBateria <=0) {
			System.out.println("Erro: Nível de bateria insuficiente");
			return;
		}
		System.out.println("Mudando a cor do plano de fundo...");
		this.corPlanoDeFundo = corPlanoDeFundo;
		System.out.println("Cor alterada para: " + corPlanoDeFundo);
		
	}
	public String getMarca() {
		return this.marca;
	}
	
	private void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getCorPlanoDeFundo() {
		return this.corPlanoDeFundo;
	}
	
	private void setCorPlanoDeFundo(String corPlanoDeFundo) {
		this.corPlanoDeFundo = corPlanoDeFundo;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	private void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public int getNivelBateria() {
		return this.nivelBateria;
	}
	
	private void setNivelBateria(int nivelBateria) {
		if(nivelBateria >= 0 && nivelBateria <= 100) {
			this.nivelBateria = nivelBateria;
		} else {
			System.out.println("Erro de Segurança: Tentativa de definir bateria com valor negativo e acima de 100% bloqueada!");
		}
	}
	
	public int getBatimentosPorMinuto() {
		return this.batimentosPorMinuto;
	}
	
	private void setBatimentosPorMinuto(int batimentosPorMinuto) {
		if(batimentosPorMinuto >= 30 && batimentosPorMinuto <= 220) {
			this.batimentosPorMinuto = batimentosPorMinuto;
		} else {
			System.out.println("Erro de Segurança: Tentativa de definir valor de batimentos cardíacos fora do intervalo (30 - 220 ppm) bloqueada!");
		}
		
	}
	
	public boolean getEstaNoPulso() {
		return this.estaNoPulso;
	}
	
	private void setEstaNoPulso(boolean estaNoPulso) {
		this.estaNoPulso = estaNoPulso;
	}
	public void exibirResumo() {
	    System.out.println("\n--- RESUMO DO SMARTWATCH ---");
	    System.out.println("Marca: " + this.marca);
	    System.out.println("Usuário: " + this.usuario.getNome());
	    System.out.println("Idade do Usuário: " + this.usuario.getIdade());
	    System.out.println("----------------------------\n");
	}
}
