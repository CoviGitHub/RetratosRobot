package packRobot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.NumberFormatException;

public class RetratoRobot {
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		char rep=' ';
		do {
		System.out.println("ROBOTIN\n");
		System.out.println("Aquí está nuestro ROBOTIN\n\n" + pelo() + "\n"+ ojos()+"\n"+ nariz()+"\n"+boca()+"\n"+barbilla()+"\n");
		System.out.println("Si quieres hacer otro Robot pulsa S, sino pulsa cualquier tecla.");
		rep= (char) in.read();
		}while(rep=='s'|| rep=='S');
	}
	
	public static String pelo() throws IOException {
		String modPelo = "";

		System.out.println("Elige el pelo para tu Robot");
		System.out.println("1. wwwwwwwwww");
		System.out.println("2. \\\\\\///////");
		System.out.println("3. \"\"\"\"\"\"\"\"\"\"");
		System.out.println("4. ||||||||||");

		int opc=opcValid();

		switch (opc) {
		case 1:
			modPelo = "wwwwwwwwwww";
			break;
		case 2:
			modPelo = "\\\\\\////////";
			break;
		case 3:
			modPelo = "\"\"\"\"\"\"\"\"\"\"\"";
			break;
		case 4:
			modPelo = "|||||||||||";
			break;
		default:
			modPelo = "";
		}
		return modPelo;
	}
	
	public static String ojos() throws IOException {
		String modOjos = "";

		System.out.println("Elige los ojos");
		System.out.println("1. |  O  O  |");
		System.out.println("2. |  ò  ó  |");
		System.out.println("3. |  Ô  Ô  |");
		System.out.println("4. |  \\  /  |");

		int opc=opcValid();

		switch (opc) {
		case 1:
			modOjos = "|  O   O  |";
			break;
		case 2:
			modOjos = "|  ò   ó  |";
			break;
		case 3:
			modOjos = "|  Ô   Ô  |";
			break;
		case 4:
			modOjos = "|  \\   /  |";
			break;
		default:
			modOjos = "";
		}
		return modOjos;
	}
	
	public static String nariz() throws IOException {
		String modNariz = "";

		System.out.println("Elige la nariz");
		System.out.println("1. @    J    @");
		System.out.println("2. {    \"    }");
		System.out.println("3. [    \"    ]");
		System.out.println("4. <    -    >");

		int opc=opcValid();

		switch (opc) {
		case 1:
			modNariz = "@    J    @";
			break;
		case 2:
			modNariz = "{    \"    }";
			break;
		case 3:
			modNariz = "[    \"    ]";
			break;
		case 4:
			modNariz = "<    -    >";
			break;
		default:
			modNariz = "";
		}
		return modNariz;
	}
	
	public static String boca() throws IOException {
		String modBoca = "";

		System.out.println("Elige la boca");
		System.out.println("1. |   ===   |");
		System.out.println("2. |   ___   |");
		System.out.println("3. |   ---   |");
		System.out.println("4. |    -    |");

		int opc=opcValid();

		switch (opc) {
		case 1:
			modBoca = "|   ===   |";
			break; 
		case 2:
			modBoca = "|   ___   |";
			break;
		case 3:
			modBoca = "|   ---   |";
			break;
		case 4:
			modBoca = "|    -    |";
			break;
		default:
			modBoca = "";
		}
		return modBoca;
	}
	
	public static String barbilla() throws IOException {
		String modBarbilla = "";
		int exc=0;
		int opc=0;

		System.out.println("Y por último elige la barbilla");
		System.out.println("1. \\________/");
		System.out.println("2. \\,,,,,,,,/");

	 	 do{
			try {
				opc = Integer.parseInt(in.readLine());
				exc = 1;
			} catch (NumberFormatException ex) {
				System.out.print("No es una opción, inténtalo de nuevo.");
				exc = 0;
			}
		}while ((opc != 1 && opc != 2)||exc ==0);
		exc = 0;

		switch (opc) {
		case 1:
			modBarbilla = "\\_________/";
			break; 
		case 2:
			modBarbilla = "\\,,,,,,,,,/";
			break;
		default:
			modBarbilla = "";
		}
		return modBarbilla;
	}

	 public static int opcValid() throws IOException{
		int opc=0;
	 	int exc=0;
	 	while ((opc != 1 && opc != 2 && opc != 3 && opc != 4)||exc ==0) {
			try {
				opc = Integer.parseInt(in.readLine());
				exc = 1;
			} catch (NumberFormatException ex) {
				System.out.print("No es una opción, inténtalo de nuevo.");
				exc = 0;
			}
		}exc = 0;
		return opc;
	 }
		
 }
	 
