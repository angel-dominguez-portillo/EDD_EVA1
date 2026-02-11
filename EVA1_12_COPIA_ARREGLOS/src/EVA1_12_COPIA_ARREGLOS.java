
public class EVA1_12_COPIA_ARREGLOS {
	
	public static void main(String args[]){
		
		Ejemplo[] arreglo = new Ejemplo[2];
		System.out.println("arreglo = " + arreglo);
		
		//arreglo ----> nos permite acceder al arreglo
		//creamos cada objeto en las posiciones del arreglo
		arreglo[0] = new Ejemplo();
		arreglo[1] = new Ejemplo();
		System.out.println("arreglo[0] = " + arreglo[0]);
		System.out.println("arreglo[1] = " + arreglo[1]);
		//arreglo[0].val = 10;
		
		System.out.println(arreglo[0].val);
		System.out.println(arreglo[1].val);
		
		//Ejemplo[] copia = arreglo; //NO FUNCIONA PORQUE SOLO ESTAMOS COPIANDO LA DIRECCION
		Ejemplo[] copia = new Ejemplo[2];//DEBO CREAR UN NUEVO ARREGLO
		System.out.println("copia = " + copia);
		//POSICION POR POSICION COPIAR DE UN ARREGLO AL OTRO
		
		//ESTO NO SIRVE TAMPOCO
		//copia[0] = arreglo[0];  //NO DUPLICO ELM OBJETO
		//copia[1] = arreglo[1];
		
		copia[0] = new Ejemplo();
		copia[1] = new Ejemplo();
		
		//ahora si, hay que transferir la info de un objeto a otro 
		//(siempre y cuando esa info no sean objetos tambien)
		copia[0].val = arreglo[0].val;
		copia[0].val = arreglo[0].val;
		
		System.out.println("copia[0] = " + copia[0]);
		System.out.println("copia[1] = " + copia[1]);
		
		System.out.println(copia[0].val);
		System.out.println(copia[1].val);
	}
}
	
class Ejemplo{
	int val = 5;
}

