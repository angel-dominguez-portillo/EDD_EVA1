
public class EVA1_17_RECURSIVIDAD {
	
	public static void main(String args[]){
		imprimirLista(10);
		System.out.println("");
		imprimirListaRec(10);
		System.out.println("");
		imprimirListaUp(10);
		System.out.println("");
		imprimirListaRecUp(1,5);
	}
	
		
	private static void imprimirLista(int val) {
		for(int i = val; i > 0; i--) {
			System.out.print(i + " - ");
		}	
	}
	private static void imprimirListaUp(int val) {
		for(int i = 1; i <= val; i++) {
			System.out.print(i + " - ");
		}
	}
	private static void imprimirListaRec(int val) {
		//seleccionar que resuelve el problema
		System.out.print(val + " - ");
		//llamda recursiva: el metodo se invoca a si mismo
		if(val > 1) //detiene la recursividad
		imprimirListaRec(val - 1);
		//detener la recursividad
		
	}
	private static void imprimirListaRecUp(int ini, int val) {
		System.out.print(ini + " - ");
		if(ini < val) {			
		    imprimirListaRecUp(ini + 1, val);
		}
		
	}

}
