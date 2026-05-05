package br.com.fiapride.model;

public interface Notificavel {
	
	void enviarNotificacao(String mensagem);
	
	int TAMANHO_MINIMO_NOTIFICACAO = 1;
    int TAMANHO_MAXIMO_NOTIFICACAO = 100;
}
