package Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilidades {
	
	public static int leeEntero() {
		Scanner teclado = new Scanner(System.in);
		int numero = -1;
		boolean valid = false;// variable para terminar el bucle cuando el valor sea correcto
		do {
			try {
				numero = teclado.nextInt();
				valid = true;

			} catch (InputMismatchException ex) {
				System.out.println("Número entero no valido. Introduce una opcion valida:");
				teclado.next();

			}
		} while (!valid);
		return numero;
	}
	
	
}
