package prototype;

import entidades.Prototipo;

public class Main {

	public static void main(String[] args) {
		Prototipo prototipo = new Prototipo("Marco");
		System.out.println(prototipo.getNombre());
		
		System.out.println("-------");
		
		Prototipo prototipo2 = (Prototipo) prototipo.clone();
		System.out.println(prototipo2.getNombre());
	}

}
