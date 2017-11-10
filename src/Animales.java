
public class Animales extends Thread{

	private String nombre;
	
	public Animales(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public void run() {
		for (int i=0; i<5; i++) {
			System.out.println(this.nombre);
		}
		System.out.println("Ha finalizado "+this.nombre);
	}
}
