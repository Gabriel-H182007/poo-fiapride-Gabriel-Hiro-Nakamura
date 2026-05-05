package br.com.fiapride.main;
import br.com.fiapride.model.Smartwatch;
import br.com.fiapride.model.Dono;
import br.com.fiapride.model.AppleWatch;
import br.com.fiapride.model.GalaxyWatch;
import java.util.ArrayList;
import java.util.List;


public class TesteSmartwatch {

	public static void main(String[] args) {
		
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
	}

}
