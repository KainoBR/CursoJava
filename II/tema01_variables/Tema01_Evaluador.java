package tema01_variables;
/**
 * @author miki
 * @date 22-04-2020
 * @version 1.0.0
 * Clase Tema01_Evaulador
 * 
 * Evalua los ejercicios desarrollados en el paquete "tema01_variables"
 */
public class Tema01_Evaluador {
	/**
	 * Ejercicio 1: declarar 4 variables enteras (int) A, B, C y D de tal forma que: 
	 *  A = 5, B = 3, C = 2, D = 0;
	 *  
	 */
	protected static void evaluaTema1_Ejercicio1(int A, int B, int C, int D){
		
		String test="";
		
		test += "El valor de 'A' es " + A;
		if(A!= 5) {
			test += " y debería ser 5";
		}
		test += "\nEl valor de 'B' es " + B;
		if(B!= 3) {
			test += " y debería ser 3";
		}
		test += "\nEl valor de 'C' es " + C;
		if(C!= 2) {
			test += " y debería ser 2";
		}
		test += "\nEl valor de 'D' es " + D;
		if(D!= 0) {
			test += " y debería ser 0";
		}
		System.out.print(test);
	}
	/**
	 * Ejercicio 1: declarar 4 variables enteras (int) A, B, C y D de tal forma que: 
	 *  A = 5, B = 3, C = 2, D = 0;
	 *  
	 *  Tras esto realiza las instrucciones necesarias para que:
	 * 
	 *  B tome el valor de C 
	 *  C tome el valor de A 
	 *  A tome el valor de D 
	 *  D tome el valor de B
	 */
	protected static void evaluaTema1_Ejercicio2(int A, int B, int C, int D){
		
		String test="";
		
		test += "El valor de 'A' es " + A;
		if(A!= 0) {
			test += " y debería ser 0";
		}
		test += "\nEl valor de 'B' es " + B;
		if(B!= 2) {
			test += " y debería ser 2";
		}
		test += "\nEl valor de 'C' es " + C;
		if(C!= 5) {
			test += " y debería ser 5";
		}
		test += "\nEl valor de 'D' es " + D;
		if(D!= 3) {
			test += " y debería ser 3";
		}
		System.out.print(test);
	}
	/**
	 * 
	 * Ejercicio 3: declarar 4 variables enteras (int) llamadas A, B, C y D 
	 * de tal forma que: A = 5, B = 3, C = 2, D = 0
	 * 
	 * Tras esto declarar una variable llamada 'result' que almacene
	 * la suma de A+B+C+D
	 * 
	 */
	protected static void evaluaTema1_Ejercicio3(int result) {
		String test="";
		
		test += "Al sumar A+B+C+D da " + result;
		if(result!= 10) {
			test += " y debería ser 10";
		}
		System.out.print(test);
	}
	/**
	 * Ejercicio 4: declarar 2 variables enteras (int) A, B de tal forma que: 
	 *  A = 5, B = 3
	 * 
	 * declarar otras 2 variables enteras (int) llamadas res1 y res 2
	 * realizar las siguientes operaciones 
	 * 
	 * A * B + A 	>>guardar el resultado en res1  
	 * A - (B / A) 	>> guardar el resultado en res2
	 * 
	 */	
	protected static void evaluaTema1_Ejercicio4(int res1, int res2) {
		String test="";
		
		test += "El valor de 'A * B + A' es " + res1;
		if(res1!= 18) {
			test += " y debería ser 18";
		}
				
		test += "El valor de 'A - (B / A)' es " + res2;
		if(res2!= 4) {
			test += " y debería ser 4";
		}
		
		System.out.print(test);
	}
}
