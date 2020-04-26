package tema07_Strings;

/**
* @author miki
* @date 26-04-2020
* @version 1.0.0
* Clase Tema07_Evaulador
* 
* Evalua los ejercicios desarrollados en el paquete "tema7_Strings"
* 
* Nota importante: el código NO está simplificado de cara a que sea más simple
* de leer para alguien que no esté familiarizado con la programación
*/
public class Tema07_Evaluador {
	
	
	/**
	 * Ejercicio 1: 
	 * 
	 *  
	 */	
	protected static void evaluaTema7_Ejercicios(int ejercicio){
		
		 String cadena = ""; 
		 char caracter = ' '; 
		 int indice = 0;
		
		
		for (int i = 0; i < 20; i ++) {
			
			cadena = Frases.getFraseAleatoria(); 
			caracter = (char) (Math.random()*25+97);//devuelve un caracter aleatorio minuscula
			indice = (int) (Math.random()*(cadena.length()+6));
			
			
			switch(ejercicio) {
			case 1:
				evaluaTema7_Ejercicio1(cadena,caracter,indice);
				break;
			case 2:
				break;
			}
			
			
			
			
			
		}
	}
	
	protected static void evaluaTema7_Ejercicio1 (String s, char c, int i) {
		
		
		int resultadoAlumno = Tema07_Ejercicio1.Indice(s, c, i);
		int resultadoCorrecto = s.indexOf(c,i);
		
		if(resultadoAlumno != resultadoCorrecto) {
			System.out.print("\n Para la string \"" + s + "\"" 
					+ "\n al buscar el caracter " + c
					+ "\n a partir de la posición " + i
					+ "\nse obtiene " + resultadoAlumno + " y debería ser " + resultadoCorrecto);
		}
		
	}		
				
		
}	
	