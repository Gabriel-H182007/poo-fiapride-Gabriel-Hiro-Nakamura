package br.com.fiapride.main;
import br.com.fiapride.model.Smartwatch;
import br.com.fiapride.model.Dono;
import br.com.fiapride.model.AppleWatch;
import br.com.fiapride.model.GalaxyWatch;

public class TesteSmartwatch {

	public static void main(String[] args) {
		
		Dono gabriel = new Dono("Gabriel", 18);
		
		Smartwatch meusmartwatch = new Smartwatch("Apple",gabriel);
		meusmartwatch.informarFrequenciaCardiaca();
		meusmartwatch.mudarCorPlanoDeFundo("Amarelo");
 
 
		System.out.println("Meu Smartwatch é da cor: " + meusmartwatch.getCorPlanoDeFundo() + " | Marca: " + meusmartwatch.getMarca() + " | Tamanho: " + meusmartwatch.getTamanho() + " | Batimentos Cardíacos: " + meusmartwatch.getBatimentosPorMinuto() + "ppm" + " | Bateria: " + meusmartwatch.getNivelBateria() + "%" + " | Está no pulso: " + meusmartwatch.isNoPulso());
		
		meusmartwatch.exibirResumo();
		
		AppleWatch appleSmartwatch = new AppleWatch("Apple", gabriel, "iPhone");
        GalaxyWatch sansungSmartwatch = new GalaxyWatch("Samsung", gabriel, 32);
        
        System.out.println("Marca: " + appleSmartwatch.getMarca() + " | Compatibilidade: " + appleSmartwatch.getCompatibilidade());
        System.out.println("Marca: " +sansungSmartwatch.getMarca() + " | Armazenamento: " + sansungSmartwatch.getArmazenamento() + "GB");
	}

}
