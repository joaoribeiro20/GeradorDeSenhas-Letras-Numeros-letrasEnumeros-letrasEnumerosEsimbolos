package principal.main.com.br;
import java.util.Random;
import java.util.Scanner;
public class Numero implements opcoes {
	
	public void senhaNumeros() {
		int[] numero = new int[30];
	    int nu ;
	    Scanner lert = new Scanner(System.in);
	    Random gerador = new Random();
	System.out.println("de quantas digitos deseja que sua senha tenha?");
    	int digitos = lert.nextInt();
    	for (int i = 0; i < digitos; i++) {
            nu = gerador.nextInt(9);
            
    		numero[i] = nu;
    		
    		System.out.print(numero[i]);
    	}
	}

	
}
