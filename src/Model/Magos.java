package Model;


public class Magos extends Personaje {
	private int PoderDefensaEspecial;

	public Magos(String nombre, int vida, int ataque, int defensa) {
		super(nombre, vida, ataque, defensa);
		this.PoderDefensaEspecial = 0;
	}

	public Magos(String nombre, int vida, int ataque, int defensa, int poderDefensaEspecial) {
		super(nombre, vida, ataque, defensa);
		PoderDefensaEspecial = poderDefensaEspecial;
	}

	public Magos() {
		// TODO Auto-generated constructor stub
	}

	public int getPoderDefensaEspecial() {
		return PoderDefensaEspecial;
	}

	public void setPoderDefensaEspecial(int poderDefensaEspecial) {
		PoderDefensaEspecial = poderDefensaEspecial;
	}
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj != null) {
			if (this == obj) {
				result = true;
			} else {
				if (this.getClass() == obj.getClass()) {
					Magos tmp = (Magos) obj;
					if (tmp.getNombre() == this.getNombre()) {
						result = true;
					}
				}
			}
		}
		return result;
	}
	@Override
	public String toString() {
		return "Magos"+ super.toString() +" [PoderDefensaEspecial=" + PoderDefensaEspecial + "]";
	}
	
}
