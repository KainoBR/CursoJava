package tema01_variables;

public class Tema1_Evaluador {
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
	protected static void evaluaTema1_Ejercicio1(int A, int B, int C, int D){
		
		String test="";
		
		test += "El valor de 'A' es " + A;
		if(A!= 5) {
			test += " y debería ser 5";
		}
		test += "\nEl valor de 'B' es " + B;
		if(A!= 3) {
			test += " y debería ser 3";
		}
		test += "\nEl valor de 'C' es " + C;
		if(A!= 2) {
			test += " y debería ser 2";
		}
		test += "\nEl valor de 'D' es " + D;
		if(A!= 0) {
			test += " y debería ser 0";
		}
		
		System.out.print(test);
	
		
	}
	/**
	 * Ejercicio 2: declarar 2 variables enteras (int) A, B de tal forma que: 
	 *  A = 5, B = 3
	 * 
	 * declarar otras 2 variables enteras (int) llamadas res1 y res 2
	 * realizar las siguientes operaciones 
	 * 
	 * A * B + A 	>>guardar el resultado en res1  
	 * A - (B / A) 	>> guardar el resultado en res2
	 * 
	 */	
	protected static void evaluaTema2_Ejercicio2(int res1, int res2) {
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
