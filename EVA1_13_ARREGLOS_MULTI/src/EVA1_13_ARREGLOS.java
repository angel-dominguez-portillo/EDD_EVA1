
public class EVA1_13_ARREGLOS {
	final static int filas = 5;
	final static int columnas = 3;
	
	public static void main(String args[]){
		int[][] arreglo = new int[filas][columnas];//5 FILAS X 3 COLUMNAS = 15 ENTEROS
		//ACCEDEMOS POR INDICES
		//PRIMER POSICION
		arreglo[0][0] = 100;
		//INTERMEDIA:
		arreglo[3][1] = 500;
		//ULTIMA POSICION:
		arreglo[4][2] = 100;
		
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < columnas; j++) {
				arreglo[i][j] = (int)(Math.random() * 100);
			}
			System.out.println("");
		}
		
		//DOS DIMENCIONES ---> DOS CICLOS PARA PODER RECORRER EL ARREGLO
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < columnas; j++) {
				System.out.print("[" + arreglo[i][j] + "]");
			}
			System.out.println("");		
		}
		System.out.println("");
		System.out.print("[" + arreglo[2][1] + "]");
		System.out.println("");
		System.out.println("arreglo: " + arreglo);
		System.out.println("arreglo[0]: " + arreglo[0]);
		System.out.println("arreglo[1]: " + arreglo[1]);
		System.out.println("arreglo[2]: " + arreglo[2]);
		System.out.println("arreglo[3]: " + arreglo[3]);
		System.out.println("arreglo[4]: " + arreglo[4]);
	}

}
