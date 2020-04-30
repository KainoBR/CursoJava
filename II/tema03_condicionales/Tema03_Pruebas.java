package tema03_condicionales;

public class Tema03_Pruebas {
	/**
	 * Esta clase realiza las pruebas
	 */
	private static boolean resultadoAlumno;
	private static boolean resultadoEsperado;

	protected static String evaluaTema03_Ejercicio1(int n) {
		
		resultadoAlumno=(Tema03_Ejercicio1.esPar(n));
		resultadoEsperado=(n%2==0)? true : false;
		
		return  "¿" + n + " es par?"; 
	}
	
	protected static String evaluaTema03_Ejercicio2(int a, int b) {
			
		resultadoAlumno=(Tema03_Ejercicio2.esMultiplo(a,b));
		resultadoEsperado=(a%b==0)? true : false;
		
		return "¿" + a + " múltiplo de " + b + "?" ; 		
	}
	
	protected static String evaluaTema03_Ejercicio3(int n) {
		
		resultadoAlumno=(Tema03_Ejercicio3.esDivisiblePor(n));
		resultadoEsperado=(n%2==0 && n%5==0)? true : false;
		
		return  "¿" + n + " divisible por 2 y 5" + "?"; 
	}
	
	protected static String evaluaTema03_Ejercicio4(int a, int b, int c) {

		resultadoAlumno=(Tema03_Ejercicio4.esMayor(a, b, c));
		resultadoEsperado=(a > b && c > b)? true : false;
		
		
		return "¿" + a + " > " + b + " < " + c +"?";
	}
		

	public static boolean getResultadoEsperado() {
		return resultadoEsperado;
	}

	public static boolean getResultadoAlumno() {
		return resultadoAlumno;
	}

}
