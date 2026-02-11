
public class EVA1_11_ARREGLO_OBJETOS {
	public static void main(String args[]){
		Ejemplo[] arreglo = new Ejemplo[2];
		System.out.println(arreglo);
		//arreglo ----> nos permite acceder al arreglo
		//creamos cada objeto en las posiciones del arreglo
		arreglo[0] = new Ejemplo();
		arreglo[1] = new Ejemplo();
		//IMPRIME DIRECCIONES
		System.out.println(arreglo[0]);
		System.out.println(arreglo[1]);
		//arreglo[0].val = 10;
		
		System.out.println(arreglo[0].val);
		System.out.println(arreglo[1].val);
	}
}
	
	class Ejemplo{
		int val = 5;
	}
