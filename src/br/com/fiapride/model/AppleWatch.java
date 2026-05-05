package br.com.fiapride.model;

public class AppleWatch extends Smartwatch implements Notificavel{
	
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
	
	@Override
	// Para calcular a autonomia da bateria, utilizamos a fórmula:
	// Autonomia (em horas) = Nível atual da bateria (%) / Consumo médio por hora (%/h)
	public String calcularAutonomiaDaBateria() {
		double horasRestantes = this.getNivelBateria() / 12.0;
		return "Apple Watch - Estimativa da autonomia da bateria: " + horasRestantes + " horas de uso";
	}
	
	@Override
	// Método abstrato, pois obriga que todas as subclasses informem o sistema operacional que utilizam.
	public String exibirSistemaOperacional() {
        return "Sistema Operacional: " + "watchOS";
    }
	
	@Override
	public void enviarNotificacao(String mensagem) {
		if (mensagem.length() < Notificavel.TAMANHO_MINIMO_NOTIFICACAO || mensagem.length() > Notificavel.TAMANHO_MAXIMO_NOTIFICACAO) {
			System.out.println("Erro: Tamanho da notificação inválido");
			return;
		}
		System.out.println("Smartwatch " + getMarca() + " enviou notificação: " + mensagem);
	}
}
