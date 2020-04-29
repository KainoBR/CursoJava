package tema03_condicionales;

public class Tema03_Evaluador {
	
	private static boolean resultadoAlumno;
	private static boolean resultadoEsperado;
	private static String metodo;
	private static String tema="Tema03";

	//* --- EVALUADOR ---- *//
	protected static void evaluaTema03_Ejercicios(int ejercicio){
		
		String prueba ="";//prueba es el valor a probar
		String imprimir ="";
		
		for(int i = 1; i <= 30; i++) {
							
			switch(ejercicio) {
				case 1:
					prueba += evaluaTema03_Ejercicio1(
							(int) (Math.random()*30)
							);
					break;
				case 2:
					prueba += evaluaTema03_Ejercicio2(
							(int) (Math.random()*30+1),
							(int) (Math.random()*30+1)
							);
					break;
				case 3:
					prueba += evaluaTema03_Ejercicio3(
							(int) (Math.random()*30+1)
							);
					break;
				default:
					return; //error
			
			}
			
			if(resultadoAlumno!=resultadoEsperado) {
				imprimir += "\n " + i + ") : "
						+ para(prueba) 
						+ seObtiene("" + resultadoAlumno)
						+ deberiaSer("" + resultadoEsperado);
			} 
			
			prueba =""; 
		}
		
		System.out.print(imprimir);
		
	}
	
	// --- imprime resultado --- //
	
	private static String para (String s) {
		return "¿" + s + "?";
	}
	
	private static String seObtiene(String alumno) {
		return " se obtiene que es " + alumno;
	}
	
	private static String deberiaSer(String respuesta) {
		return " y debería ser " + respuesta;
	}
	
	// --- Metodos --- // 
	
	protected static String evaluaTema03_Ejercicio1(int n) {
		
		resultadoAlumno = Tema03_Ejercicio1.esPar(n);
		resultadoEsperado = (n%2==0)? true : false;
		
		return  n + metodo; 
				
	}
	
	protected static String evaluaTema03_Ejercicio2(int a, int b) {
			
		resultadoAlumno = Tema03_Ejercicio2.esMultiplo(a,b);
		resultadoEsperado = (a%b==0)? true : false;
		
		return a + "\t" + metodo + "\t" + b; 		
	}
	
	protected static String evaluaTema03_Ejercicio3(int n) {
		
		resultadoAlumno = Tema03_Ejercicio3.esDivisiblePor(n);
		resultadoEsperado = (n%2==0 && n%5==0)? true : false;
		
		return  n + metodo; 
				
	}
	
	
	// --- Imprime por consola --- //
	
	protected static void iniciarPruebas(String nombreMetodo) {
		metodo = nombreMetodo;
		
		System.out.print(""
				+ "Pruebas " + tema
				+ "\nAutor: Miguel Ángel Berciano"
				+ "\n=============================="
				+ " Ejercicio: " + nombreMetodo
				+ " =============================="
				+ "\niniciando pruebas aleatorias ...\n");
	}
	
	
	
	
	
}
