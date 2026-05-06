package br.com.fiapride.model;

public class Email implements Notificavel{
	private String endereco;
	
	 public Email(String endereco) {
	        this.endereco = endereco;
	 }

	@Override
	//Implementa método abstrato da interface, pois as classes GalaxyWatch, AppleWatch e Email, possuem o mesmo método (enviarNotificacao)
    public void enviarNotificacao(String mensagem) {
		if (mensagem.length() < Notificavel.TAMANHO_MINIMO_NOTIFICACAO || mensagem.length() > Notificavel.TAMANHO_MAXIMO_NOTIFICACAO) {
			System.out.println("Erro: Tamanho da notificação inválido");
			return;
		}
        System.out.println("Email enviado para " + endereco + ": " + mensagem);
    }
}
