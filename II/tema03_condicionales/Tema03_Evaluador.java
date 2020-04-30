package tema03_condicionales;

public class Tema03_Evaluador {
	
	private static String tema="Tema03";
	
	//* --- EVALUADOR ---- *//
	
	protected static void evaluaTema03_Ejercicios(int ejercicio){
		
		String prueba ="";//prueba es el valor a probar
		
		
		for(int i = 1; i <= 25; i++) {
							
			switch(ejercicio) {
				case 1:
					prueba += Tema03_Pruebas.evaluaTema03_Ejercicio1(
							(int) (Math.random()*20+1)
							);
					break;
				case 2:
					prueba += Tema03_Pruebas.evaluaTema03_Ejercicio2(
							(int) (Math.random()*10+1),
							(int) (Math.random()*6+1)
							);
					break;
				case 3:
					prueba += Tema03_Pruebas.evaluaTema03_Ejercicio3(
							(int) (Math.random()*20+1)
							);
					break;
				case 4: 
					prueba += Tema03_Pruebas.evaluaTema03_Ejercicio4(
							(int) (Math.random()*10+1),
							(int) (Math.random()*10+1),
							(int) (Math.random()*10+1)
							);
					break;
				default:
					return; //error
			
			}
			imprimirPrueba(i , prueba);
			
			prueba =""; 
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
				+ seObtiene("" + Tema03_Pruebas.getResultadoAlumno());
	
			if(Tema03_Pruebas.getResultadoAlumno()!=Tema03_Pruebas.getResultadoEsperado()) {
				aux += deberiaSer("" + Tema03_Pruebas.getResultadoEsperado());
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
