package entidades;

public class Prototipo implements Cloneable {
	private String nombre;

	public Prototipo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public Object clone() {
		Prototipo p = null;
		try {
			p = (Prototipo) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return p;

	}
}
