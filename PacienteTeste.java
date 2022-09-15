package Classe_objeto;

public class PacienteTeste {

	public static void main(String[] args) {
		
		//instanciar a minha classe Paciente
		
		
		System.out.println("\t\tInformações básicas dos pacientes: ");
		
		
		Paciente paciente1 = new Paciente("Victória Melo", "Feminino", 78, 165);
		Paciente paciente2 = new Paciente("Edna Melo", "Feminino" ,77 ,162);
				
		
		paciente1.imprimirInfo();
		paciente2.imprimirInfo(); 
		

	}

}
