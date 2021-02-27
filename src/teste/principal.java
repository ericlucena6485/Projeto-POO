package teste;
import java.util.Scanner;


public class principal {

	package teste;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
		login usuario = new login();
		
		
		System.out.println("**************************************");
		
		System.out.println("Seja bem vindo ao seu Diário de Bordo:\n");
		
		System.out.println("**************************************");
		
		System.out.println("Escolha uma das opções para começar:");
		System.out.println("1-Cadastro");
		System.out.println("2-Escrever no seu diário");
		System.out.println("Escolha uma opção:");
		
		int op;
		
		op=entrada.nextInt();
		
		
		
		int i = 0;
		do {
	
			switch( op ) {
			
			case 1 :
				   login cadastro = new login();
				   System.out.println("CADASTRO:");
				   
				   System.out.println("Digite seu nome:");
				   String nome = entrada.nextLine();
				   cadastro.setNome(nome);
				   
				   System.out.println("Digite seu email:");
				   String e = entrada.nextLine();
				   cadastro.setEmail(e);
				   

				   System.out.println("Digite uma senha:");
				   String s = entrada.nextLine();
				   cadastro.setSenha(s);
				   

				   System.out.println("Digite seu endereço:");
				   String end = entrada.nextLine();
				   cadastro.setEndereco(end);
				   

				   System.out.println("Digite seu nome de usuário para entrar no Diário:");
				   String u = entrada.nextLine();
				   cadastro.setUsuario(u);
				   
			     
			       System.out.println("Deseja ir para seu diario?");
			       System.out.println("Se sim digite 2,se dejesa sair digite 3!");
			       op=entrada.nextInt();
			       
			       
			case 2:
		
			       System.out.println("Aperte 1 para continuar, caso contrário digite 2!");
			       op=entrada.nextInt();
					
			       i= entrada.nextInt();
			       
			case 3:
				 
					System.out.println("Obrigado por utilizar a plataforma.Até mais");
					i = 2;
					
			}
			
			
		}while(i == 1);
		

	}

}

}
