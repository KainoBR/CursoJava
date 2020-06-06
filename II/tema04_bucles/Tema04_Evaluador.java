package tema04_bucles;

public class Tema04_Evaluador {
	
	private static String tema="Tema03";
	
	//* --- EVALUADOR ---- *//
	
	protected static void evaluaTema04_Ejercicios(int ejercicio){
		
		//los métodos de testeo devolverán que se probó en cada iteracion
		//en formato String 
		String prueba ="";
		
		
		for(int i = 1; i <= 25; i++) {
							
			switch(ejercicio) {
				case 1:
					prueba += Tema04_Pruebas.evaluaTema04_Ejercicio1(
							(int) (Math.random()*20+1)
							);
					break;
				case 2: // care rendimiento (random < 15) 
					prueba += Tema04_Pruebas.evaluaTema04_Ejercicio2(
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
				+ seObtiene("" + Tema04_Pruebas.getResultadoAlumno());
	
			if(Tema04_Pruebas.getResultadoAlumno()!=Tema04_Pruebas.getResultadoEsperado()) {
				aux += deberiaSer("" + Tema04_Pruebas.getResultadoEsperado());
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
