public class EVA1_10_CAMBIO_TAMAÑO {
	public static void main(String args[]){
		int[] datos = new int[5];
		
		for(int i = 0; i < datos.length; i++) {
			datos[i] = (int)(Math.random() * 100);
		}	
		
		for(int i = 0; i < datos.length; i++) {
			System.out.print("[" + datos[i] + "]");	
		}
		
		int[] copiaDatos = datos;//copia	
		System.out.println("\n");
		System.out.println("--------AJUSTAMOS EL AREGLO A 3--------");
		datos = new int[3];
		System.out.println("");datos = new int[3];
		
		for(int i = 0; i < datos.length; i++) {
			datos[i] = copiaDatos[i];
			System.out.print("[" + datos[i] + "]");
		}
		
	}
}