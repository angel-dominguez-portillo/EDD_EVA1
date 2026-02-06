package EVA1_7_ARREGLOS;

public class EVA1_7_ARREGLOS {
	public static void main(String args[]){
		//String[] cade1, cade2, cade3; --> todos son arreglos
		//String cade1, cade2[], cade3; --> solo cade2 es arreglo
		int[] datos = new int[10];
		//MANEJO DE ÍNDICES
		System.out.println(datos);
		datos[0] = 100;//arregolo 1
		datos[1]= 200;//arregolo 2
		datos[2] = 300;//arregolo 3
		datos[9] = 1000; //arregolo 10
		//si ponemos datos[10] = 1100 java no suelta error pero esta fuera de los limites entonces no existe
		System.out.println("Valor en posicion 0 = " + datos[0]);
	}
}
