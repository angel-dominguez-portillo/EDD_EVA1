package EVA1_9_INMUTABLES;

public class EVA1_9_INMUTABLES {
	public static void main(String args[]){
		int[] datos = new int[5];
		
		
		for(int i = 0; i < datos.length; i++) {
			datos[i] = (int)(Math.random() * 100);
		}
		
		for(int i = 0; i < datos.length; i++) {
			System.out.print("[" + datos[i] + "]");
		}
		System.out.println("");
		System.out.println("--------AJUSTAMOS EL AREGLO A 3--------");
		datos = new int[3];
		System.out.println("");datos = new int[3];
		for(int i = 0; i < datos.length; i++) {
			System.out.print("[" + datos[i] + "]");
		}
		System.out.println("");
		
	}
}
