package br.com.fiapride.main;
import br.com.fiapride.model.Smartwatch;
import br.com.fiapride.model.Dono;

public class TesteSmartwatch {

	public static void main(String[] args) {
		
		Dono gabriel = new Dono("Gabriel", 18);
		
		Smartwatch meusmartwatch = new Smartwatch("Apple", "Azul", gabriel);
		meusmartwatch.informarFrequenciaCardiaca();
		meusmartwatch.mudarCorPlanoDeFundo("amarelo");
 
 
		System.out.println("Meu Smartwatch é da cor: " + meusmartwatch.getCorPlanoDeFundo() + " | Marca: " + meusmartwatch.getMarca() + " | Tamanho: " + meusmartwatch.getTamanho() + " | Batimentos Cardíacos: " + meusmartwatch.getBatimentosPorMinuto() + "ppm" + " | Bateria: " + meusmartwatch.getNivelBateria() + "%" + " | Está no pulso: " + meusmartwatch.getEstaNoPulso());
		
		meusmartwatch.exibirResumo();
	}

}
