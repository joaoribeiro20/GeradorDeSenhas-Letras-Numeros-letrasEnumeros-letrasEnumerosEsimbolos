package principal.main.com.br;
import java.util.*;

public class RodarTeste {
	public static Scanner lert ;
	public static Random gerador = new Random();
	
	
public static void main(String[] args) {
	lert = new Scanner(System.in);
	gerador = new Random();
	int nur;

	/**********************************************/
	String letra[] = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	
	String[] especiais  = {"+","*","#","$","@","&"};
	
	int[] numero = new int[30];
	
	String conj[] = new String[30];
	
	/**************************************************/
	System.out.println("                    -*-*-* Bem vindo ao gerador de senha -*-*-*-\n"
			+ "        antes de obter sua senha novinha e segura precisamos saber algumas coisa antes\n"
			+ "                  primeiro digite qual tipo de caracteres deseja usar \n"
			+ "------- letras ---- numeros ---- numeros e letras ---- numeros e letras e caracteres especiais -------\n"
			+ "        Por favor Escreva a opção que deseja (Segui o padrao de escrita como acima)");
	String escolha1 = lert.next();
	int nu ;
	int n = 0;
	int lu ;
	 /*****************************************************/   	
    if (escolha1.equals("numeros")) {
    	System.out.println("de quantas digitos deseja que sua senha tenha?");
    	int digitos = lert.nextInt();
    	for (int i = 0; i < digitos; i++) {
            nu = gerador.nextInt(9);
    		numero[i] = nu;
    		System.out.print(numero[i]);
    	}
    	
    }
    /*****************************************************/   	
    	if (escolha1.equals("letra")) { 
    		System.out.println("de quantas digitos deseja que sua senha tenha?");
        	int letraen = lert.nextInt();
    		while (n < letraen) {    			
           	 nur = gerador.nextInt(23);                    	
           	System.out.print(letra[nur]);
           	n++;
           	} 
    	}
 /*****************************************************/   		
    	if(escolha1.equals("conj")) {
    		System.out.println("de quantas digitos deseja que sua senha tenha?");
        	int dois = lert.nextInt();
    		int y = 0;
    		for (int u = 0; u < dois; u++) {
    			
                nu = gerador.nextInt(9);
        		numero[u] = nu;
        		
        	}
    		
    		while (y < dois) {    			
           	 nur = gerador.nextInt(23);                    	
           	y++;
           	} 
    		int l = 0;
    		while(y == 9  && l < 4) {
    		System.out.print(letra[l] );
    		System.out.print(numero[l]);
    		l++;
    		}
    	}
/*****************************************************/   	
    		if(escolha1.equals("cara")) {
    			System.out.println("de quantas digitos deseja que sua senha tenha?");
            	int tres = lert.nextInt();
        		int y = 0;
        		for (int u = 0; u < tres; u++) {
        			
                    nu = gerador.nextInt(9);
            		numero[u] = nu;
            		
            	}
        		
        		while (y < tres) {    			
               	 nur = gerador.nextInt(23);                    	               
               	y++;
               	} 
        		while (y < tres) {    			
                  	 lu = gerador.nextInt(23);                    	
                  	lu++;
        		}
        		int l = 0;
        		while(y == 9  && l < tres) {
        		System.out.print(letra[l] );
        		System.out.print(numero[l]);
        		System.out.print(especiais[l]);
        		l++;
        		}
              }
/*******************************************/
 }//main       
}//Rodarteste






