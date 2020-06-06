package tema05_arrays;

public class Tema05_Evaluador {
	
	private static String tema="Tema03";
	
	//* --- EVALUADOR ---- *//
	
	protected static void evaluaTema05_Ejercicios(int ejercicio){
		
		//los métodos de testeo devolverán que se probó en cada iteracion
		//en formato String 
		String prueba ="";
		
		int [] v = new int[(int) (Math.random()*4 + 3)];
		
		for(int i = 1; i <= 25; i++) {
			
			rellenaVector(v);
							
			switch(ejercicio) {
				case 1:
					prueba += Tema05_Pruebas.evaluaTema05_Ejercicio1(v);
					break;
				case 2: 
					prueba += Tema05_Pruebas.evaluaTema05_Ejercicio2(v);
					break;
				case 3: 
					prueba += Tema05_Pruebas.evaluaTema05_Ejercicio3(v);
					break;
				case 4: 
					prueba += Tema05_Pruebas.evaluaTema05_Ejercicio4(v,
							(int) (Math.random()*10+1)
							);
					break;
				default:
					return; //error
			
			}
			imprimirPrueba(i , prueba);
			
			prueba ="";  // reset
		}
		
		System.out.print("\n\nFin del programa");
	}
	
	
	private static void rellenaVector(int [] v) {
		for(int i = 0; i < v.length; i++) {
			v[i] = (int) (Math.random()*10);
		}
	}
		
	// --- cabecera --- //
	
	protected static void cabecera(String metodo) {
		
		
		System.out.print(""
				+ "Pruebas " + tema
				+ "\nAutor: Miguel Ángel Berciano Rodríguez"
				+ "\n=================="
				+ " Ejercicio: " + metodo
				+ " ==================="
				+ "\niniciando pruebas aleatorias ...\n"
				+ "\nNº \t Prueba \t resultado Alumno \t Correccion\n");
	}
	
	// --- imprime resultado --- //
	
	protected static void imprimirPrueba(int i, String prueba) {
		String aux=  "\n " + i + ")\t"
				+ para(prueba) 
				+ seObtiene("" + Tema05_Pruebas.getResultadoAlumno());
	
			if(Tema05_Pruebas.getResultadoAlumno()!=Tema05_Pruebas.getResultadoEsperado()) {
				aux += deberiaSer("" + Tema05_Pruebas.getResultadoEsperado());
			} else { 		
				aux += "\t OK!";
			}
		System.out.print(aux);
	}
	
	
	private static String para (String s) {
		return " " + s;
	}
	
	private static String seObtiene(String alumno) {
		return "\t se obtiene  " + alumno;
	}
	
	private static String deberiaSer(String respuesta) {
		return "\t y es  " + respuesta;
	}	
	
}
