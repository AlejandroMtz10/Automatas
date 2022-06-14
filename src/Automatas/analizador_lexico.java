package Automatas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class analizador_lexico {
	static String pal="";

	public static void main(String[] args) throws FileNotFoundException {
		File prog = new File ("C:\\Codigo.txt");
		
		Scanner programa = new Scanner (prog);
		int ban = 0;
		while(programa.hasNext()) {
			
			pal = programa.next();
			ban=0;
			
			if (pal.contains(";") || pal.contains(",")) {
								 
			} else {
			
			System.out.println(pal + "");
			
			
			}
			
			Pattern n1= Pattern.compile("[0-9]*");			
			Matcher num1 = n1.matcher(pal);			
			if (num1.matches()) {	
				if(ban==0) {
				System.out.println("El número es correcto\n");
				ban = 1;
				}
			}
			
			//Coma
			Pattern coma = Pattern.compile(",");			
			Matcher com = coma.matcher(pal);			
			if (com.matches()) {
				if(ban==0) {
				System.out.println(",");
				System.out.println("La coma es correcta\n");
				ban = 1;
				}
			}
			
			
			//Punto y coma
			Pattern pComa = Pattern.compile(";");			
			Matcher pCom = pComa.matcher(pal);			
			if (pCom.matches()) {	
				if(ban==0) {
				System.out.println(";");
				System.out.println("El punto y coma es correcto\n");
				ban = 1;
				}
			}			
			
			
						
			
			//Palabras reservadas y variables solas, con punto y coma y coma	
					
			Pattern inicio = Pattern.compile("inicio");			
			Matcher i = inicio.matcher(pal);
			
			
			if (i.matches()) {
				
				System.out.println("La palabra inicio es correcta\n");			
				ban=1;
			}else{
				
				Pattern decVar = Pattern.compile("entero|real");				
				Matcher i2 = decVar.matcher(pal);
				
				
				if (i2.matches()) {
					
					System.out.println("La palabra entero o real es correcta\n");
					ban=1;
				} else {
					
					Pattern leer = Pattern.compile("La palabra leer es correcta\n");
					
					Matcher i3 = leer.matcher(pal);
					
					if (i3.matches()) {
						
						System.out.println("Correcta leer");
					} else {
						
						Pattern puntoycoma = Pattern.compile("\\W");
						
						Matcher i4 = puntoycoma.matcher(pal);
						
						if (i4.matches()) {		
							
							Pattern signos = Pattern.compile("\\+|\\-|\\/|\\*|\\=");
							
							Matcher sig = signos.matcher(pal);
							
							if (sig.matches()) {	
							
							System.out.println("El signo aritmetico es correcto\n");
							ban=1;
							
							}
							
						} else {
							
							
							Pattern fin = Pattern.compile("fin.");	
							Matcher i7 = fin.matcher(pal);
							
							
							
							if (i7.matches()) {
								
								System.out.println("La palabra fin. es correcta\n");
								ban=1;
							}else {
								
								Pattern escribir = Pattern.compile("escribir");
								
								Matcher i9 = escribir.matcher(pal);
								

								if (i9.matches()) {
									
									System.out.println("La palabra escribir es correcta\n");
									ban=1;
									
								} else {
									
									Pattern var = Pattern.compile("^[a-z][0-9]{1,8}|[a-z]{1,8}|^[a-z][A-Z][0-9]{1,8}");
									Matcher i8 = var.matcher(pal);
									if (i8.matches()) {
										
										System.out.println("La variable es correcta\n");
										ban=1;
									
									}else {	
										if(ban==0) {
											if(pal.contains(";")) {												
												
												String[] np =pal.split(";");
												
											
												System.out.println(np [0]);									
												Matcher ii = var.matcher(np [0]);
												if (ii.matches()) {
													
													System.out.println("La variable es correcta\n");
													ban=1;
												}else if(ban==0) {
													Pattern numeros = Pattern.compile("[0-9]*");
													Matcher nume = numeros.matcher(np[0]);
													if(nume.matches()) {
														System.out.println("El numero es correcto\n");
														ban=1;
													}else if(ban==0){
													
													System.out.println("La palabra " + np[0] + " es incorrecta.\n");	
													ban=1;
												}									
												}

												String palabra= ";";
												System.out.println(";");
												
												Matcher iii = puntoycoma.matcher(palabra);
												
												if (iii.matches()) {
													
													System.out.println("El punto y coma es correcto\n");
													ban=1;
													
												}
																																
												
											} else if (pal.contains(",")) {
												String[] np =pal.split(",");
												System.out.println(np [0]);
												
												Matcher ii = var.matcher(np [0]);
												if (ii.matches()) {
													
													System.out.println("La variable es correcta\n");
													ban=1;
												} else if(ban==0) {
													Pattern numeros = Pattern.compile("[0-9]*");
													Matcher nume = numeros.matcher(np[0]);
													if(nume.matches()) {
														System.out.println("El numero es correcto\n");
														ban=1;
													}else if(ban==0){
													
													System.out.println("La palabra " + np[0] + " es incorrecta.\n");	
													ban=1;
												}									
												}											
												
												String palabra= ",";
												System.out.println(",");
												Matcher iii = puntoycoma.matcher(palabra);
												
												if (iii.matches()) {
													
													System.out.println("La coma es correcta\n");
													
												}
												
											}
											
									}
										
									}
								}//*
								
							
							}
							
							
						}				
						
					}	

			  }//
			}
			if(ban==0) {
				System.out.println("La palabra " + pal + " es incorrecta.\n");	
			}
		}
	
	}
}

