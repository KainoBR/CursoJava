package tema03_condicionales;

public class Tema03_Evaluador {
	
	
	private static boolean resultadoAlumno;
	private static boolean resultadoEsperado;

	protected static void evaluaTema03_Ejercicios(int ejercicio){
		
		int a,b;
		boolean resultadoAlumno;
		
		for(int i = 0; i < 10; i++) {
				
			a=(int) (Math.random()*30-10);
			b=(int) (Math.random()*30-10);
			
			
			switch(ejercicio) {
				case 1:
					evaluaTema03_Ejercicio1(a);
					break;
				case 2:
					evaluaTema03_Ejercicio2(a,b);
			
			}
		}
		
		
	}
	
	protected static void evaluaTema03_Ejercicio1(int n) {
		
		resultadoAlumno = Tema03_Ejercicio1.esPar(n);
		resultadoEsperado = (n%2==0)? true : false;
		
		if(resultadoAlumno != resultadoEsperado) {
			System.out.print("\n m�todo �es Par? "
					+ "\n para el n�mero " + n 
					+ " se obtiene que es " + resultadoAlumno
					+ " y deber�a ser " + resultadoEsperado);
		}
				
	}
	
	protected static void evaluaTema03_Ejercicio2(int a, int b) {
			
		resultadoAlumno = Tema03_Ejercicio2.esMultiplo(a,b);
		resultadoEsperado = (a%b==0)? true : false;
		
		if(resultadoAlumno != resultadoEsperado) {
			System.out.print("\n m�todo �es M�ltiplo? "
					+ "\n para el n�mero " + a +  " y " + b 
					+ " se obtiene que es " + resultadoAlumno
					+ " y deber�a ser " + resultadoEsperado);
		}
					
	}
	
	

}
