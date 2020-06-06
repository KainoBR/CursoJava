package tema05_arrays;

public class Tema05_Pruebas {
	/**
	 * Esta clase realiza las pruebas
	 */
	private static int resultadoAlumno;
	private static int resultadoEsperado;

	protected static String evaluaTema05_Ejercicio1(int [] v) {
		
		resultadoAlumno=(Tema05_Ejercicio1.sumarVector(v));
		resultadoEsperado=sumarVector(v);
		
		return  "para v = " + printVector(v); 
	}
	
	protected static String evaluaTema05_Ejercicio2(int[] v) {
			
		resultadoAlumno=(Tema05_Ejercicio2.sumarPares(v));
		resultadoEsperado=sumarPares(v);
		
		return  "para v = " + printVector(v); 
	}
	
	protected static String evaluaTema05_Ejercicio3(int[] v) {
		
		resultadoAlumno=(Tema05_Ejercicio3.sumarPosicionesPares(v));
		resultadoEsperado=sumarPosicionesPares(v);
		
		return  "para v = " + printVector(v); 
	}
	protected static String evaluaTema05_Ejercicio4(int[] v, int n) {
		
		resultadoAlumno=(Tema05_Ejercicio4.sumarImparesMenores(v,n));
		resultadoEsperado=sumarImparesMenores(v,n);
		
		return  "para v = " + printVector(v); 
	}
	
	protected static String printVector(int[] v) {
		String s = "["; 
		for (int i = 0; i < v.length; i ++) {
			s += " " +  v[i];
		}
		return s +" ]"; 
	}
	
			

	public static int getResultadoEsperado() {
		return resultadoEsperado;
	}

	public static int getResultadoAlumno() {
		return resultadoAlumno;
	}

	
	private static int sumarVector(int[] v) {
		int res = 0;
		for (int i = 0; i < v.length; i ++) {
			res+=v[i];
		}
		return res; 
	}
	
	private static int sumarPares(int[] v) {
		int res = 0;
		for (int i = 0; i < v.length; i ++) {
			if(v[i]%2 == 0) {
				res+=v[i];
			}
		}
		return res; 
	}
	
	private static int sumarPosicionesPares(int[] v) {
		int res = 0;
		for (int i = 0; i < v.length; i=i+2) {
			res+=v[i];
		}
		return res; 
	}
	
	private static int sumarImparesMenores(int[] v, int n) {
		int res = 0;
		for (int i = 1; i < v.length; i=i+2) {
			if(v[i] < n) {
				res+=v[i];
			}
		}
		return res; 
	}
	
	
}
