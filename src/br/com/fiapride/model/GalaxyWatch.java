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
	
	@Override
	// Para calcular a autonomia da bateria, utilizamos a fórmula:
	// Autonomia (em horas) = Nível atual da bateria (%) / Consumo médio por hora (%/h)
	public String calcularAutonomiaDaBateria() {
		double horasRestantes = this.getNivelBateria() / 9.0;
		return "Galaxy Watch - Estimativa da autonomia da bateria: " + horasRestantes + " horas de uso";
	}
	
	@Override
	// Método abstrato, pois obriga que todas as subclasses informem o sistema operacional que utilizam.
	public String exibirSistemaOperacional() {
        return "Sistema Operacional: " + "Wear OS";
    }
}
