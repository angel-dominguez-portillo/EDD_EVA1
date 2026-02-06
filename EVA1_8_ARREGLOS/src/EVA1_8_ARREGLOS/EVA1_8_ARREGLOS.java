package EVA1_8_ARREGLOS;

public class EVA1_8_ARREGLOS {
	public static void main(String args[]){
		int[] datos = new int[1000000000];//-----> 4 gigas
		
		
		for(int i = 0; i < datos.length; i++) {
			datos[i] = (int)(Math.random() * 100);
		}
		
		/*for(int i = 0; i < datos.length; i++) {
			System.out.print("[" + datos[i] + "]");
		}
		System.out.println("");*/
	}

}
