package br.com.fiapride.main;
import br.com.fiapride.model.Smartwatch;
import br.com.fiapride.model.Email;
import br.com.fiapride.model.Notificavel;
import br.com.fiapride.model.Dono;
import br.com.fiapride.model.AppleWatch;
import br.com.fiapride.model.GalaxyWatch;
import java.util.ArrayList;
import java.util.List;


public class TesteSmartwatch {

	public static void main(String[] args) {
		
		Dono bia = new Dono("Bia", 18);
		AppleWatch meuapplewatch = new AppleWatch("Apple", bia, "iPhone");
		meuapplewatch.informarFrequenciaCardiaca();
		meuapplewatch.mudarCorPlanoDeFundo("amarelo");
		System.out.println("Smartwatch - " + " Cor do plano de fundo: " + meuapplewatch.getCorPlanoDeFundo() + " | Marca: " + meuapplewatch.getMarca() + " | Tamanho: " + meuapplewatch.getTamanho() + " | Batimentos Cardíacos: " + meuapplewatch.getBatimentosPorMinuto() + "ppm" + " | Bateria: " + meuapplewatch.getNivelBateria() + "%" + " | Está no pulso: " + meuapplewatch.isNoPulso());
		System.out.println();
		meuapplewatch.exibirResumo();
		
		
		Dono gabriel = new Dono("Gabriel", 18);
		Dono daniel = new Dono("Daniel", 19);

        List<Smartwatch> smartwatches = new ArrayList<>();
        smartwatches.add(new AppleWatch("Apple", gabriel, "iPhone"));
        smartwatches.add(new GalaxyWatch("Samsung", daniel, 32));
        System.out.println("---🔋 RELATÓRIO DA AUTONOMIA DA BATERIA DOS SMARTWATCHES 🔋---");
        
        for (Smartwatch smartwatch : smartwatches) {
        	 System.out.println("Smartwatch: " + smartwatch.getMarca());
        	 System.out.println(smartwatch.calcularAutonomiaDaBateria());
             System.out.println("----------------------------------------");
 
        }
        
        //Smartwatch smartwatch1 = new Smartwatch("Apple", gabriel);
		
        Smartwatch applewatch1 = new AppleWatch("Apple", gabriel, "iPhone");
        Smartwatch galaxywatch1 = new GalaxyWatch("Samsung", gabriel, 32);
        
        System.out.println();
        System.out.println("Sistema Operacional dos Smartwatches:");
        System.out.println(applewatch1.exibirSistemaOperacional());      
        System.out.println(galaxywatch1.exibirSistemaOperacional());
		
        AppleWatch applewatch2 = new AppleWatch("Apple", gabriel, "iPhone");
        Email email = new Email("gabriel@email.com");
        GalaxyWatch galaxywatch2 = new GalaxyWatch("Samsung", gabriel, 32);
        
        Notificavel[] notificaveis = new Notificavel[] {
                applewatch2,
                galaxywatch2,
                email
        };
        
        System.out.println("\n=== Enviando Notificação ===");
        for (Notificavel n : notificaveis) {
            n.enviarNotificacao("Bom dia!");
            System.out.println("---");
        }
	}
}
