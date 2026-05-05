package br.com.fiapride.model;

public class Smartwatch {
	public String marca;
	public String corPlanoDeFundo;
	public int tamanho;
	public int nivelBateria;
	public int batimentosPorMinuto;
	public boolean estaNoPulso;
	
	public Smartwatch(String marca, String corPlanoDeFundo, int tamanho) {
		this.marca = marca;
		this.corPlanoDeFundo = corPlanoDeFundo;
		this.tamanho = tamanho;
		this.nivelBateria = 100;
		this.batimentosPorMinuto = 65;
		this.estaNoPulso = true;
	}
	public void informarFrequenciaCardiaca() {
		if (this.estaNoPulso == false &&  this.nivelBateria <= 0){
			System.out.println("Erro: O relógio não está no pulso ou nível insuficiente de bateria");
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
}
