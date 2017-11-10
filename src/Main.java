
public class Main {

	public static void main(String[] args) {
		
		Animales guepardo = new Animales("guepardo");
		Animales liebre = new Animales("liebre");
		Animales tortuga = new Animales("tortuga");
		
		guepardo.setPriority(Thread.MAX_PRIORITY);
		liebre.setPriority(Thread.NORM_PRIORITY);
		tortuga.setPriority(Thread.MIN_PRIORITY);
		
		guepardo.start();
		liebre.start();
		tortuga.start();
	}

}
