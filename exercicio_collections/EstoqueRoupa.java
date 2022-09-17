package exercicio_heranca;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueRoupa {

	public static void main(String[] args) {
		int op; 
		Scanner ler = new Scanner(System.in); 
		
		ArrayList<String> estoque = new ArrayList(); 
		
		do {
			System.out.println("\n\tOpções de seleção do estoque"); 
			System.out.println("\n(1) Quais modelos de camiseta deseja adicionar ao estoque?"); 
			System.out.println("\n(2) Qual modelo deseja remover do estoque?");
			System.out.println("\n(3) Deseja atualizar algum modelo de camiseta do estoque?"); 
			System.out.println("\n(4) Deseja mostrar todos os produtos disponíveis em estoque?"); 
			System.out.println("\n(0) Deseja encerrar o programa?"); 
			System.out.println("\nPor favor, digite sua opção: ");
			op = ler.nextInt();
			
			switch(op) {
			case 1:
				ler.nextLine(); 
				System.out.println("\nDigite o modelo para adicionar no estoque: "); 
				String produto = ler.nextLine();
				estoque.add(produto); 
				break; 
			case 2: 
				ler.nextLine(); 
				System.out.println("\nDigite o modelo que deseja remover do estoque: "); 
				String produto1 = ler.nextLine();
				if(estoque.contains(produto1)) {
					estoque.remove(produto1);
			
			} else {
				System.out.println("\nModelo não existe no estoque! ");
			}
			System.out.println(estoque);
			break;	
		case 3: 
			ler.nextLine();
			System.out.println("\nDigite o modelo que deseja atualizar: "); 
			String verifica = ler.nextLine(); 
			System.out.println("\nDigite o modelo que entrará no lugar "+verifica+" :"); 
			String novo = ler.nextLine(); 
			if(estoque.contains(verifica)) { 
				estoque.remove(verifica);
				estoque.add(novo); 
				
			}else {
				System.out.println("\nModelo não existente no estoque!");
			}
			System.out.println(estoque);
			break;
		case 4: 
			System.out.println("\nModelos disponíveis no estoque são: "); 
			System.out.println(estoque); 
			break; 
		case 0: 
			System.out.println("\nMuito obrigada por utilizar o nosso sistema, volte sempre! ");
			break; 
			default: 
				System.out.println("\nOpção indisponível!");
			
		}
	}
	while(op!=0); 

}

} 
