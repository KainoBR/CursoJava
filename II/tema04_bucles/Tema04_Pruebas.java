package tema04_bucles;

public class Tema04_Pruebas {
	/**
	 * Esta clase realiza las pruebas
	 */
	private static int resultadoAlumno;
	private static int resultadoEsperado;

	protected static String evaluaTema04_Ejercicio1(int n) {
		
		resultadoAlumno=(Tema04_Ejercicio1.sumatorio(n));
		resultadoEsperado=sumatorio(n);
		
		return  "para n = " + n; 
	}
	
	protected static String evaluaTema04_Ejercicio2(int n) {
			
		resultadoAlumno=(Tema04_Ejercicio2.fibonacci(n));
		resultadoEsperado=fibonacci(n);
		
		return  "para n = " + n; 		
	}
			

	public static int getResultadoEsperado() {
		return resultadoEsperado;
	}

	public static int getResultadoAlumno() {
		return resultadoAlumno;
	}

	
	private static int sumatorio(int n) {
		int res = 0;
		for (int i = 0; i < n; i ++) {
			res+=i;
		}
		return res; 
	}
	
	private static int fibonacci(int n) {
		int a = 1;
		int b = 1;
		
		for (int i = 0; i < n; i++) {
			int swap = b;
			b=a+b;
			a=swap;
		}
		return b; 
	}
	
	
}
