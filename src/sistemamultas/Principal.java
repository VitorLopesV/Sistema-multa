package sistemamultas;

import java.util.Scanner;

import inflação.Motorista;
import inflação.Multa;

public class Principal {
	
public static void main(String[] args) {
		
		Motorista motorista = new Motorista();
		Multa multa = new Multa();
		Scanner scanner = new Scanner(System.in);
		
		
		//OBJETOS MOTORISTA (NOME, NUMERO DE REGISTRO E NUMERO DA PLACA)
		System.out.println("MOTORISTA: ");
		motorista.setnome((scanner.nextLine()));
		
		System.out.println("NR: ");
		motorista.setnumeroRegistro(scanner.nextLine());
		
		System.out.println("PLACA: ");
		motorista.setnumeroPlaca(scanner.nextLine());
		
		// OBJETOS MULTA (INFLAÇÃO COMETIDA, TIPO DA INFLAÇÃO, LOCAL E DATA)
		System.out.println("INFLACAO: ");
		multa.setInflacao((scanner.nextLine()));
		
		System.out.println("VALOR: ");
		multa.setValor((Double.parseDouble(scanner.nextLine())));
	
		System.out.println("LOCAL: ");
		multa.setLocal((scanner.nextLine()));
		
		System.out.println("DATA: ");
		multa.setData((scanner.nextLine()));
		System.out.println("\n\n\n");
		
		//IMPRESSÃO DA MULTA 
		System.out.println("NOME DO CONDUTOR: " + motorista.getnome() + "\n");
		System.out.println("NUMERO DE REGISTRO: " + motorista.getnumeroRegistro() + "\n");
		System.out.println("PLACA DO VEICULO: " + motorista.getnumeroPlaca() + "\n");
		System.out.println("INFLACAO COMETIDA: " + multa.getInflacao() + "\n");
		System.out.println("VALOR A SER PAGO: " + multa.getValor() + "\n");
		System.out.println("LOCAL ONDE OCORREU: " + multa.getLocal() + "\n");
		System.out.println("DATA: "+ multa.getData() + "\n");
		
	}	

}
