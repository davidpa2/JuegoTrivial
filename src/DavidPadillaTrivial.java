import javax.swing.JOptionPane;

public class DavidPadillaTrivial {

	public static void main(String[] args) {
	
		System.out.println("\r\n"
				+ "  ____  _                           _     _                 \r\n"
				+ " |  _ \\(_)                         (_)   | |              _ \r\n"
				+ " | |_) |_  ___ _ ____   _____ _ __  _  __| | ___     __ _(_)\r\n"
				+ " |  _ <| |/ _ \\ '_ \\ \\ / / _ \\ '_ \\| |/ _` |/ _ \\   / _` |  \r\n"
				+ " | |_) | |  __/ | | \\ V /  __/ | | | | (_| | (_) | | (_| |_ \r\n"
				+ " |____/|_|\\___|_| |_|\\_/ \\___|_| |_|_|\\__,_|\\___/   \\__,_(_)\r\n"
				+ "");
		System.out.println("\r\n"
				+ "   _   _   _   _   _   _   _  \r\n"
				+ "  / \\ / \\ / \\ / \\ / \\ / \\ / \\ \r\n"
				+ " ( T | r | i | v | i | a | l )\r\n"
				+ "  \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \r\n"
				+ "");
		
		int entrada;
		double score = 0;
		
		System.out.println("Esto es Trivial, el juego en el que se te hacen preguntas y debes responderlas para conseguir puntos.");
		System.out.println("El tema de las preguntas es...      ¡PERSONAJES DE VIDEOJUEGOS!");
		
		do {	
			String str = JOptionPane.showInputDialog("Por favor introduce 1 para comenzar.");
			entrada = Integer.parseInt(str);
			
			if (entrada != 1) {
				System.out.println("Tecla incorrecta.");
			}
		}while (entrada != 1);

		System.out.println("Comenzamos:");
		System.out.println(" ");
		
		System.out.println("Lleva bigote y va saltando por su mundo de champiñones...");
		System.out.println("1) Doctor Eggman");
		System.out.println("2) Mario");
		System.out.println("3) Wario");
		String str = JOptionPane.showInputDialog("Escribe la respuesta correcta:");
		int respuesta1 = Integer.parseInt(str);
		
		if (respuesta1 == 2) {
			System.out.println(" ");
			System.out.println("¡Enhorabuena has acertado!");
			score =+ 1;
		}else {
			System.out.println(" ");
			System.out.println("Vaya, lo siento has fallado...");
			score =- 0.5;
		}
		
	}

}
