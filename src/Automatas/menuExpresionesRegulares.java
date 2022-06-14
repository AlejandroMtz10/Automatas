package Automatas;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class menuExpresionesRegulares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Matcher mat; 
		Pattern pat;
		int n = 0,opcion;
		String cadena;
		
		do {
			System.out.println("Escoge una opcion.");
			System.out.println("[0] Salir.");
			System.out.println("[1] Expresion regular 1.");
			System.out.println("[2] Expresion regular 2.");
			System.out.println("[3] Expresion regular 3.");
			System.out.println("[4] Expresion regular 4.");
			System.out.println("[5] Expresion regular 5.");
			System.out.print("Opcion escogida: ");
			n = sc.nextInt();
		
		switch(opcion = n) {
		case 0:
			System.out.println("\nSaliendo.\n");
			break;
			
		case 1:
			System.out.println("\nCadenas binarias, incluyendo la vacia comiencen con 1 y no haya 0´s seguidos.\n");
			pat = Pattern.compile("(1|10)*"); 
			
			System.out.print("Escribe la cadena de entrada: ");
			cadena = sc.next();
			
			mat = pat.matcher(cadena);
			
			if(mat.matches()) {
				System.out.println("Correcta\n");
			}else {
				System.out.println("Incorrecta\n");
			}
			break;
			
		case 2:
			System.out.println("\nCadenas que contienen solo 0´s o solo 1´s y cadena vacía.\n");
			pat = Pattern.compile("(0*|1*)"); 
			
			System.out.print("Escribe la cadena de entrada: ");
			cadena = sc.next();
			
			mat = pat.matcher(cadena);
			
			if(mat.matches()) {
				System.out.println("Correcta\n");
			}else {
				System.out.println("Incorrecta\n");
			}
			break;
			
		case 3:
			System.out.println("\nCadenas binarias que comiencen con un numero impar de 1´s.\n");
			pat = Pattern.compile("1(11)*((0)(1|0)*)*"); 
			
			System.out.print("Escribe la cadena de entrada: ");
			cadena = sc.next();
			
			mat = pat.matcher(cadena);
			
			if(mat.matches()) {
				System.out.println("Correcta\n");
			}else {
				System.out.println("Incorrecta\n");
			}
			break;
			
		case 4:
			System.out.println("\nCadenas que se pueden formar por el alfabeto {a, b, c} de longitud 4.\n");
			pat = Pattern.compile("[a-c]{4}"); 
			
			System.out.print("Escribe la cadena de entrada: ");
			cadena = sc.next();
			
			mat = pat.matcher(cadena);
			
			if(mat.matches()) {
				System.out.println("Correcta\n");
			}else {
				System.out.println("Incorrecta\n");
			}
			break;
		
		case 5:
			System.out.println("\nClaves ISBN de 12 digitos pero que\ninicien con los numeros 978 0 979.\n");
			pat = Pattern.compile("(978|979)[0-9]{9}"); 
			
			System.out.print("Escribe la cadena de entrada: ");
			cadena = sc.next();
			
			mat = pat.matcher(cadena);
			
			if(mat.matches()) {
				System.out.println("Correcta\n");
			}else {
				System.out.println("Incorrecta\n");
			}
			break;
			
		default:
			System.out.println("\nNo hay expresion regular.\n");
			break;
			}
		}while(n != 0);
	}

}
