package Model;

public class Guerreros extends Personaje {
	private int PoderAtaqueEspecial;

	public Guerreros() {
		super();
	}

	public Guerreros(String nombre, int vida, int ataque, int defensa) {
		super(nombre, vida, ataque, defensa);
	}

	public Guerreros(String nombre, int vida, int ataque, int defensa, int poderAtaqueEspecial) {
		super(nombre, vida, ataque, defensa);
		PoderAtaqueEspecial = poderAtaqueEspecial;
	}

	public int getPoderAtaqueEspecial() {
		return PoderAtaqueEspecial;
	}

	public void setPoderAtaqueEspecial(int poderAtaqueEspecial) {
		PoderAtaqueEspecial = poderAtaqueEspecial;
	}

	@Override
	public String toString() {
		return "Guerreros" + super.toString() + " [PoderAtaqueEspecial=" + PoderAtaqueEspecial + "]";
	}
	
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj != null) {
			if (this == obj) {
				result = true;
			} else {
				if (this.getClass() == obj.getClass()) {
					Guerreros tmp = (Guerreros) obj;
					if (tmp.getNombre() == this.getNombre()) {
						result = true;
					}
				}
			}
		}
		return result;
	}
}
