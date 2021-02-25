package teste;
import java.util.Scanner;


public class principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		login usuario = new login();
		
		usuario.setNome("Deusdedit");
		
		usuario.setUsuario("Deusdedit99");
		
		System.out.println(usuario.getNome());
		
		System.out.println(usuario.getUsuario());
		
		
		
		
		

	}

}
