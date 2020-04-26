package tema07_Strings;

public class Frases {
	
	
	
	protected final static String[] frases = { //NO TOCAR
			//Frases a utilizar para los ejercicios de Strings
			//(se puede editar añdiendo las frases que quieras; cuidado con las comas y las "")
			//para no complicarnos demasiado solo trabajaremos con frases con caracteres del alfabeto
			//y en minúsuclas
			// FRASES //
			"",
			"Hoy hace un buen dia",
			"Estamos en el tema del manejo de Strings",
			"Hola soy una frase, "
			
			// FIN FRASES //
			};
	
	protected char caracter = (char) (Math.random());
	
	/**
	 * 
	 * @return devuelve una String aleatoria 
	 */
	public static String getFraseAleatoria() {		
			return frases[(int) (Math.random()*(frases.length-1))];
	}
	
}
