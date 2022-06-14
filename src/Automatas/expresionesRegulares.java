package Automatas;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class expresionesRegulares {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		//cc Todas las cadenas binarias
		//Pattern pat = Pattern.compile("1(11)*0"); Todas las cadenas binarias que empiezan con 1 y terminan con 0
		//Pattern pat = Pattern.compile("(1)(11)*((0)(1|0)*)*"); Cadenas binarias que inicien con impar de 1's
		//Pattern pat = Pattern.compile("(1|10)*"); Cadenas que no tengan dos 0's seguidos
		//Pattern pat = Pattern.compile("c[A-Z][a-z]{4}"); Cadenas que empiezan con una mayuscula y con longitud total de 5 caracteres
		Pattern pat = Pattern.compile("(ba)*b|(ab)*a|(ab|ba)"); 
		
		String cadena;
		
		System.out.print("Escribe la cadena de entrada: ");
		cadena = sc.next();
		
		Matcher mat = pat.matcher(cadena);
		
		if(mat.matches()) {
			System.out.println("Correcta");
		}else {
			System.out.println("Incorrecta");
		}
   }
}
