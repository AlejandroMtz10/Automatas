package Automatas;
import java.util.*;

public class Uso_de_split {
	public static void main(String[]args) {
		String palabra = "entero n1, n2, res;";
		String[] pal = palabra.split(" |, |;");
		System.out.println("Cadena "+pal[3]);
	}
}
