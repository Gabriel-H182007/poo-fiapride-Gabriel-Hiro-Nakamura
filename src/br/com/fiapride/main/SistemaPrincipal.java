package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Smartwatch;

public class SistemaPrincipal {

	public static void main(String[] args) {
		 // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
        //Passageiro passageiro1 = new Passageiro();
        //passageiro1.nome = "Ana Silva";
        //passageiro1.saldo = 50.0;

        // Criando o segundo passageiro (Objeto 2)
        //Passageiro passageiro2 = new Passageiro();
        //passageiro2.nome = "Carlos Souza";
        //passageiro2.saldo = 12.50;

        // Exibindo os dados no Console
        //System.out.println("--- Sistema FiapRide ---");
        //System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
        //System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);
        
        // Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?
		
		Smartwatch meusmartwatch = new Smartwatch();
		meusmartwatch.marca = "Technos";
		meusmartwatch.cor = "Cinza";
		meusmartwatch.tamanho = 44;
 
		Smartwatch smartwatch2 = new Smartwatch();
		smartwatch2.marca = "Apple";
		smartwatch2.cor = "Branco";
		smartwatch2.tamanho = 44;
 
		System.out.println("Meu Smartwatch é da cor: " + meusmartwatch.cor + " | Marca: " + meusmartwatch.marca
				+ " | Tamanho: " + meusmartwatch.tamanho);
		System.out.println("O Smartwatch2 é da cor: " + smartwatch2.cor + " | Marca: " + smartwatch2.marca
				+ " | Tamanho: " + smartwatch2.tamanho);
	}

}
