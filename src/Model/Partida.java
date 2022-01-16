package Model;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.text.View;

import Utils.Utilidades;
import Views.Menu;

public class Partida {
	private static Personaje[] p;
	private static Personaje[] personajes;
	private static Personaje[] lucha = new Personaje[2];

	public Partida(Personaje[] person) {
		super();
		this.p = person;
	}

	public Partida() {
		super();
	}

	public Partida(int nPersonajes) {

		p = new Personaje[nPersonajes];
	}

	public static void cantidadJugadores(int a) {
		personajes = new Personaje[a];
	}

	public static void eligeJugador(int a) {

		for (int i = 0; i < lucha.length; i++) {

			switch (a) {
			case 1:
				lucha[0] = personajes[0];
				personajes[0] = null;

				i = lucha.length;
				break;
			case 2:
				lucha[0] = personajes[1];
				personajes[1] = null;

				i = lucha.length;
				break;
			case 3:
				lucha[0] = personajes[2];
				personajes[2] = null;

				i = lucha.length;
				break;
			case 4:
				lucha[0] = personajes[3];
				personajes[3] = null;

				i = lucha.length;
				break;
			case 5:
				lucha[0] = personajes[4];
				personajes[4] = null;

				i = lucha.length;
				break;
			case 6:
				lucha[0] = personajes[5];
				personajes[5] = null;

				i = lucha.length;
				break;
			case 7:
				lucha[0] = personajes[6];
				personajes[6] = null;

				i = lucha.length;
				break;
			case 8:
				lucha[0] = personajes[7];
				personajes[7] = null;

				i = lucha.length;
				break;
			case 9:
				lucha[0] = personajes[8];
				personajes[8] = null;

				i = lucha.length;
				break;
			case 10:
				lucha[0] = personajes[9];
				personajes[9] = null;

				i = lucha.length;
				break;
			default:
				break;
			}

		}

	}

	public static void eligePersonajes() {

		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i] + " posicion= " + (i + 1));
		}

		for (int i = 0; i < personajes.length; i++) {
			Menu.menu2();
			int eleccion = Utilidades.leeEntero();
			switch (eleccion) {

			case 1:
				personajes[i] = p[0];
				break;
			case 2:
				personajes[i] = p[1];
				break;
			case 3:
				personajes[i] = p[2];
				break;
			case 4:
				personajes[i] = p[3];
				break;
			case 5:
				personajes[i] = p[4];
				break;
			case 6:
				personajes[i] = p[5];
				break;
			case 7:
				personajes[i] = p[6];
				break;
			case 8:
				personajes[i] = p[7];
				break;
			case 9:
				personajes[i] = p[8];
				break;
			case 10:
				personajes[i] = p[9];
				break;

			default:
				break;
			}

		}

	}

	public static void personajes() {
		Partida p = new Partida(10);

		Magos mago1 = new Magos("paco", 10, 5, 3, 3);
		Magos mago2 = new Magos("jose", 10, 5, 3, 3);
		Magos mago3 = new Magos("ana", 10, 5, 3, 3);
		Magos mago4 = new Magos("manuel", 10, 5, 3, 3);
		Magos mago5 = new Magos("antonio", 10, 5, 3, 3);

		Guerreros guerrero1 = new Guerreros("dalas", 10, 3, 5, 3);
		Guerreros guerrero2 = new Guerreros("sion", 10, 3, 5, 3);
		Guerreros guerrero3 = new Guerreros("daniela", 10, 3, 5, 3);
		Guerreros guerrero4 = new Guerreros("daniel", 10, 3, 5, 3);
		Guerreros guerrero5 = new Guerreros("pablo", 10, 3, 5, 3);

		p.newPersonaje(mago1);
		p.newPersonaje(mago2);
		p.newPersonaje(mago3);
		p.newPersonaje(mago4);
		p.newPersonaje(mago5);

		p.newPersonaje(guerrero1);
		p.newPersonaje(guerrero2);
		p.newPersonaje(guerrero3);
		p.newPersonaje(guerrero4);
		p.newPersonaje(guerrero5);

	}

	public boolean isFull() {
		boolean lleno = true;
		for (int i = 0; i < p.length; i++) {
			if (p[i] == null) {
				lleno = false;
			}
		}
		return lleno;
	}

	public static void muestraPersonajes() {

		for (int i = 0; i < personajes.length; i++) {
			System.out.println(personajes[i] + " posicion= " + (i + 1));
		}
	}

	public static void muestraP() {

		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i] + " posicion= " + (i + 1));
		}
	}

	public static void muestraLucha() {

		for (int i = 0; i < lucha.length; i++) {
			System.out.println(lucha[i] + " posicion= " + (i + 1));
		}
	}

	public void newPersonaje(Personaje a) {
		boolean insertado = false;
		if (this.getPersonaje(a) != -1) {
			System.out.println("Personaje existente,ya esta el personaje: " + this.getPersonaje(a));
		} else if (this.isFull()) {
			System.out.println("Grupo lleno, no se ha podido aniadir Personaje");
		} else {

			for (int i = 0; i < p.length && !insertado; i++) {
				if (p[i] == null) {
					p[i] = a;
					insertado = true;

				}
			}
		}
	}

	public int getPersonaje(Personaje a) {
		int posi = -1;
		for (int i = 0; i < p.length; i++) {
			if (a.equals(p[i])) {
				posi = i;
				i = p.length;
			}
		}
		return posi;
	}

	public static void partida(int n) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		Partida.cantidadJugadores(n);
		Partida.personajes();
		Partida.eligePersonajes();
		Partida.muestraPersonajes();
		Menu.menu3();
		a = Utilidades.leeEntero();
		Partida.eligeJugador(a);

		while (n >= 0 && Partida.lucha() == true) {
			n--;
			Partida.lucha();
			System.out.println(Partida.lucha());
			if (Partida.lucha() == false) {
				Menu.menu5();
			}
		}

	}

	public static void iniciaPartida() {
		Menu.menu1();
		Partida.partida(Utilidades.leeEntero());
	}

	public static boolean lucha() {
		boolean result = true;
		int a = 0;
		Personaje p1 = new Personaje();
		Personaje p2 = new Personaje();

		for (int j = 0; j < personajes.length; j++) {
			a = j;
			if (personajes[j] != null) {

				lucha[1] = personajes[j];
				j = personajes.length;

			}
		}
		personajes[a] = null;
		p1 = lucha[0];
		p2 = lucha[1];
		System.out.println("");
		System.out.println(p1 + " --> p1");
		System.out.println(p2 + " --> p2");
		
			while (p1.getVida() > 0 && p2.getVida() > 0) {
				ataqueP1(p1, p2);
				ataqueP2(p2, p1);
			}
		
		if (p1.getVida() <= 0) {
			Menu.menu4(p2.getNombre());

			//lucha[0] = null;
			result = false;

		}
		if (p2.getVida() <= 0) {
			Menu.menu4(p1.getNombre());
			lucha[1] = null;
			p1.setVida(10);
		}
		return result;
	}

	public static int ataqueP1(Personaje p1, Personaje p2) {
		int vida = 0;

		int ataque = (int) Math.floor(Math.random() * 5 + 1);
		int defensa = (int) Math.floor(Math.random() * 3 + 1);
		int defensaEspecial = (int) Math.floor(Math.random() * 3 + 1);
		int ataqueEspecial = (int) Math.floor(Math.random() * 3 + 1);
		int defensaTotal = defensa + defensaEspecial;
		int ataqueTotal = ataque + ataqueEspecial;

		if (p1 instanceof Magos) {
			Magos magoP1ataca = (Magos) p1;

			if (p2 instanceof Magos) {
				Magos magoP2defiende = (Magos) p2;
				magoP1ataca.setAtaque(ataque);
				if (magoP1ataca.getAtaque() < defensaTotal) {
					magoP1ataca.setAtaque(0);
					defensaTotal = 0;
				}
				magoP2defiende.setVida(magoP2defiende.getVida() - (magoP1ataca.getAtaque() - defensaTotal));

				System.out.println("La vida de " + magoP2defiende.getNombre() + " es --> " + magoP2defiende.getVida());
				vida = magoP2defiende.getVida();

			}
			if (p2 instanceof Guerreros) {
				Guerreros guerrerop2defiende = (Guerreros) p2;
				if (magoP1ataca.getAtaque() < defensa) {
					magoP1ataca.setAtaque(0);
					defensa = 0;
				}
				guerrerop2defiende.setVida(guerrerop2defiende.getVida() - (magoP1ataca.getAtaque() - defensa));

				System.out.println(
						"La vida de " + guerrerop2defiende.getNombre() + " es --> " + guerrerop2defiende.getVida());
				vida = guerrerop2defiende.getVida();
			}
		}

		if (p1 instanceof Guerreros) {
			Guerreros guerrerop1ataca = (Guerreros) p1;

			if (p2 instanceof Magos) {
				Magos magoP2defiende = (Magos) p2;
				guerrerop1ataca.setAtaque(ataque);
				if (guerrerop1ataca.getAtaque() < defensaTotal) {
					guerrerop1ataca.setAtaque(0);
					defensaTotal = 0;
				}
				magoP2defiende.setVida(
						magoP2defiende.getVida() - ((guerrerop1ataca.getAtaque() + ataqueTotal) - defensaTotal));

				System.out.println("La vida de " + magoP2defiende.getNombre() + " es --> " + magoP2defiende.getVida());
				vida = magoP2defiende.getVida();

			}
			if (p2 instanceof Guerreros) {
				Guerreros guerrerop2defiende = (Guerreros) p2;
				if (guerrerop1ataca.getAtaque() < defensa) {
					guerrerop1ataca.setAtaque(0);
					defensa = 0;
				}
				guerrerop2defiende.setVida(
						guerrerop2defiende.getVida() - ((guerrerop1ataca.getAtaque() + ataqueTotal) - defensa));

				System.out.println(
						"La vida de " + guerrerop2defiende.getNombre() + " es --> " + guerrerop2defiende.getVida());
				vida = guerrerop2defiende.getVida();

			}

		}
		return vida;
	}

	public static int ataqueP2(Personaje p1, Personaje p2) {
		int vida = 0;

		int ataque = (int) Math.floor(Math.random() * 5 + 1);
		int defensa = (int) Math.floor(Math.random() * 3 + 1);
		int defensaEspecial = (int) Math.floor(Math.random() * 3 + 1);
		int ataqueEspecial = (int) Math.floor(Math.random() * 3 + 1);
		int defensaTotal = defensa + defensaEspecial;
		int ataqueTotal = ataque + ataqueEspecial;

		if (p1 instanceof Magos) {
			Magos magoP1ataca = (Magos) p1;

			if (p2 instanceof Magos) {
				Magos magoP2defiende = (Magos) p2;
				magoP1ataca.setAtaque(ataque);
				if (magoP1ataca.getAtaque() < defensaTotal) {
					magoP1ataca.setAtaque(0);
					defensaTotal = 0;
				}
				magoP2defiende.setVida(magoP2defiende.getVida() - (magoP1ataca.getAtaque() - defensaTotal));

				System.out.println("La vida de " + magoP2defiende.getNombre() + " es --> " + magoP2defiende.getVida());
				vida = magoP2defiende.getVida();
			}
			if (p2 instanceof Guerreros) {
				Guerreros guerrerop2defiende = (Guerreros) p2;
				if (magoP1ataca.getAtaque() < defensa) {
					magoP1ataca.setAtaque(0);
					defensa = 0;
				}
				guerrerop2defiende.setVida(guerrerop2defiende.getVida() - (magoP1ataca.getAtaque() - defensa));

				System.out.println(
						"La vida de " + guerrerop2defiende.getNombre() + " es --> " + guerrerop2defiende.getVida());
				vida = guerrerop2defiende.getVida();
			}
		}

		if (p1 instanceof Guerreros) {
			Guerreros guerrerop1ataca = (Guerreros) p1;

			if (p2 instanceof Magos) {
				Magos magoP2defiende = (Magos) p2;
				guerrerop1ataca.setAtaque(ataque);
				if (guerrerop1ataca.getAtaque() < defensaTotal) {
					guerrerop1ataca.setAtaque(0);
					defensaTotal = 0;
				}
				magoP2defiende.setVida(
						magoP2defiende.getVida() - ((guerrerop1ataca.getAtaque() + ataqueTotal) - defensaTotal));

				System.out.println("La vida de " + magoP2defiende.getNombre() + " es --> " + magoP2defiende.getVida());
				vida = magoP2defiende.getVida();
			}
			if (p2 instanceof Guerreros) {
				Guerreros guerrerop2defiende = (Guerreros) p2;
				if (guerrerop1ataca.getAtaque() < defensa) {
					guerrerop1ataca.setAtaque(0);
					defensa = 0;
				}
				guerrerop2defiende.setVida(
						guerrerop2defiende.getVida() - ((guerrerop1ataca.getAtaque() + ataqueTotal) - defensa));

				System.out.println(
						"La vida de " + guerrerop2defiende.getNombre() + " es --> " + guerrerop2defiende.getVida());
				vida = guerrerop2defiende.getVida();
			}
		}

		return vida;
	}
}
