package br.com.fiapride.main;
import br.com.fiapride.model.Smartwatch;
public class TesteSmartwatch {

	public static void main(String[] args) {
		Smartwatch meusmartwatch = new Smartwatch("Apple", "Azul", 44);
		meusmartwatch.informarFrequenciaCardiaca();
		meusmartwatch.mudarCorPlanoDeFundo("amarelo");
 
		Smartwatch smartwatch2 = new Smartwatch("Technos", "rosa", 44);
		smartwatch2.informarFrequenciaCardiaca();
		smartwatch2.mudarCorPlanoDeFundo("verde");
 
		System.out.println("Meu Smartwatch é da cor: " + meusmartwatch.getCorPlanoDeFundo() + " | Marca: " + meusmartwatch.getMarca() + " | Tamanho: " + meusmartwatch.getTamanho() + " | Batimentos Cardíacos: " + meusmartwatch.getBatimentosPorMinuto() + "ppm" + " | Bateria: " + meusmartwatch.getNivelBateria() + "%" + " | Está no pulso: " + meusmartwatch.getEstaNoPulso());
		System.out.println("O Smartwatch2 é da cor: " + smartwatch2.getCorPlanoDeFundo() + " | Marca: " + smartwatch2.getMarca() + " | Tamanho: " + smartwatch2.getTamanho() + " | Batimentos Cardíacos: " + smartwatch2.getBatimentosPorMinuto() + "ppm" + " | Bateria: " + smartwatch2.getNivelBateria() + "%" + " | Está no pulso: " + smartwatch2.getEstaNoPulso());

		//meusmartwatch.batimentosPorMinuto = 101;
		//meusmartwatch.nivelBateria = -1;

	}

}
