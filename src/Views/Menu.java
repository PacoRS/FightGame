package Views;

import Model.Personaje;

public class Menu {
	public static void menu1() {
		System.out.println("**********************************************************************");
		System.out.println("* Elije la cantida de jugadores con la que deseas jugar. Nota: Max10 *");
		System.out.println("**********************************************************************");
	}
	public static void menu2() {
		System.out.println("");
		System.out.println("***********************************************");
		System.out.println("* Elije una posicion para añadir el personaje *");
		System.out.println("***********************************************");
	}
	public static void menu3() {
		System.out.println("");
		System.out.println("**************************************************************");
		System.out.println("* Elije una posicion para jugar con elpersonaje seleccionado *");
		System.out.println("**************************************************************");
	}
	public static void menu4(String p) {
		System.out.println("");
		System.out.println("*****************************************");
		System.out.println("*                                       *");
		System.out.println("*         El ganador es "+p+"            *");
		System.out.println("*                                       *");
		System.out.println("*****************************************");
	}
	public static void menu5() {
		System.out.println("");
		System.out.println("**************************************************************");
		System.out.println("*                        Has perdido                         *");
		System.out.println("**************************************************************");
	}
}
