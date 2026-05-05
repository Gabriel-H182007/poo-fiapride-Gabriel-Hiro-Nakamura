package br.com.fiapride.main;
//import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Smartwatch;
public class SistemaPrincipal {

	public static void main(String[] args) {
		
		//Passageiro passageiro1 = new Passageiro("Ana Silva", "222");
		//System.out.println("Regarga passageiro 1");
        //passageiro1.adicionarSaldo(50.0);
        
        //Passageiro passageiro2 = new Passageiro("Carlos Souza", "333");
        //System.out.println("Regarga passageiro 2");
        //passageiro2.adicionarSaldo(12.5);
 
        //System.out.println("--- Sistema FiapRide ---");
        //System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$ " + passageiro1.saldo + " | CPF: " + passageiro1.cpf);
        //System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$ " + passageiro2.saldo + " | CPF: " + passageiro2.cpf);
        
        //System.out.println("Pagando viagem do passageiro 1");
        //passageiro1.pagarViagem(20);
        //System.out.println("Pagando viagem do passageiro 2");
        //passageiro2.pagarViagem(20);
		
		
		// Desafio Prático - Smartwatch
        
        
		Smartwatch meusmartwatch = new Smartwatch("Apple", "Azul", 44);
		meusmartwatch.informarFrequenciaCardiaca();
		meusmartwatch.mudarCorPlanoDeFundo("amarelo");
 
		Smartwatch smartwatch2 = new Smartwatch("Technos", "rosa", 44);
		smartwatch2.informarFrequenciaCardiaca();
		smartwatch2.mudarCorPlanoDeFundo("verde");
 
		System.out.println("Meu Smartwatch é da cor: " + meusmartwatch.corPlanoDeFundo + " | Marca: " + meusmartwatch.marca + " | Tamanho: " + meusmartwatch.tamanho + " | Batimentos Cardíacos: " + meusmartwatch.batimentosPorMinuto + "ppm" + " | Bateria: " + meusmartwatch.nivelBateria + "%" + " | Está no pulso: " + meusmartwatch.estaNoPulso);
		System.out.println("O Smartwatch2 é da cor: " + smartwatch2.corPlanoDeFundo + " | Marca: " + smartwatch2.marca + " | Tamanho: " + smartwatch2.tamanho + " | Batimentos Cardíacos: " + smartwatch2.batimentosPorMinuto + "ppm" + " | Bateria: " + smartwatch2.nivelBateria + "%" + " | Está no pulso: " + smartwatch2.estaNoPulso);
	}

}
