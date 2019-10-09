// Brevetecno
// Java
// 2019

import java.util.Scanner;

class Cripih{
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		
		while (true){
			System.out.println("--------------------------------------------------------------");
			System.out.println("Criptografia com Java - Desenvolvedor Brevetecno");
			System.out.println("--------------------------------------------------------------");
			
			System.out.println("(1) - Criptografar");
			System.out.println("(2) - Decifrar");
			System.out.println("(3) - Sair");
			
			System.out.println("--------------------------------------------------------------");
			System.out.print("Resposta: "); 
			int resposta = scanner.nextInt();
			
			if (resposta == 1){
				// Essa parte Criptografa o Texto
				System.out.println("--------------------------------------------------------------");
				System.out.println("Criptografar");
				System.out.println("--------------------------------------------------------------");
				System.out.print("Digite o texto: "); 
				String texto_recebido = scanner.nextLine();
				System.out.println("--------------------------------------------------------------");
				
				String texto = "";
		
				// Enquanto n for maior ou igual 0
				// a variável texto irá guardar o valor CIFRADO, sendo letra por letra.
				for(int n = texto_recebido.length() - 1; n >= 0; n--){
					char letra = texto_recebido.charAt(n);
					letra += 5;
					texto += letra;
				}
				
			}else if (resposta == 2){
				// Essa parte Decifra o texto
				System.out.println("--------------------------------------------------------------");
				System.out.println("Decifrar");
				System.out.println("--------------------------------------------------------------");
				System.out.print("Digite o texto: "); 
				String texto_recebido = scanner.nextLine();
				System.out.println("--------------------------------------------------------------");
				
				String texto = "";
		
				// Enquanto n for maior ou igual 0
				// a variável texto irá guardar o valor DECIFRADO, sendo letra por letra.
				for(int n = texto_recebido.length() - 1; n >= 0; n--){
					char letra = texto_recebido.charAt(n);
					letra -= 5;
					texto += letra;
				}
				
			}else if (resposta == 3){
				// Encerra aplicação
				System.exit(0);
				
			}else{
				System.out.println("Valor inválido.");
			}
		}
		
	}
}