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
		System.out.println("_______________________________________________________________");
		
		//Primera pregunta
		System.out.println("Pregunta 2: Lleva bigote y va saltando por su mundo de champiñones...");
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
		
		//Segunda pregunta
		System.out.println("_______________________________________________________________");		
		System.out.println("Pregunta 2: Él y su banda de forajidos cabalgan todo el oeste.");
		System.out.println("1) Geralt de Rivia");
		System.out.println("2) Nathan Drake");
		System.out.println("3) Arthur Morgan");
		str = JOptionPane.showInputDialog("Escribe la respuesta correcta:");
		int respuesta2 = Integer.parseInt(str);
		
		if (respuesta2 == 3) {
			System.out.println(" ");
			System.out.println("¡Enhorabuena has acertado!");
			score =+ 1;
		}else {
			System.out.println(" ");
			System.out.println("Vaya, lo siento has fallado...");
			score =- 0.5;
		}
		
		//Tercera pregunta
		System.out.println("_______________________________________________________________");		
		System.out.println("Pregunta 3: Un espadachín que vive en la ciudad de Hyrule.");
		System.out.println("1) Bowser");
		System.out.println("2) Link");
		System.out.println("3) Kirby");
		str = JOptionPane.showInputDialog("Escribe la respuesta correcta:");
		int respuesta3 = Integer.parseInt(str);
		
		if (respuesta3 == 2) {
			System.out.println(" ");
			System.out.println("¡Enhorabuena has acertado!");
			score =+ 1;
		}else {
			System.out.println(" ");
			System.out.println("Vaya, lo siento has fallado...");
			score =- 0.5;
		}
		
		//Cuarta pregunta
		System.out.println("_______________________________________________________________");		
		System.out.println("Pregunta 4: Es un brujo que emprende un largo viaje a través de Los reinos del norte..");
		System.out.println("1) John Marston");
		System.out.println("2) Solid Snake");
		System.out.println("3) Geralt de Rivia");
		str = JOptionPane.showInputDialog("Escribe la respuesta correcta:");
		int respuesta4 = Integer.parseInt(str);
		
		if (respuesta4 == 3) {
			System.out.println(" ");
			System.out.println("¡Enhorabuena has acertado!");
			score =+ 1;
		}else {
			System.out.println(" ");
			System.out.println("Vaya, lo siento has fallado...");
			score =- 0.5;
		}
		
		//Quinta pregunta
		System.out.println("_______________________________________________________________");		
		System.out.println("Pregunta 5: Huye con su compañera de los infectados con el fin de sobrevivir.");
		System.out.println("1) Joel Miller");
		System.out.println("2) Captain Falcon");
		System.out.println("3) Nathan Drake");
		str = JOptionPane.showInputDialog("Escribe la respuesta correcta:");
		int respuesta5 = Integer.parseInt(str);
		
		if (respuesta5 == 1) {
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
