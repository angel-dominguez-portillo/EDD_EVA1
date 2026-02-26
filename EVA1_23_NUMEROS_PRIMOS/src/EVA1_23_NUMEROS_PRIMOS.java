
public class EVA1_23_NUMEROS_PRIMOS {
	public static void main(String args[]){
		System.out.println("El numero 537 es primo? " + esPrimoNoEficiente(11));
		System.out.println("El numero 537 es primo? " + esPrimoEficiente(11));
	}
	public static boolean esPrimoNoEficiente(int num) {
		boolean esPrimo= true;
		for(int i = 2; i < num; i++) {
			if ((num % i) == 0) {// NO ES PRIMO
				esPrimo = false;
				break;
			}
		}
		return esPrimo;
	}
	public static boolean esPrimoEficiente(int num) {
		boolean esPrimo = false;
		int limite = (int)Math.sqrt(num);
		for(int i = 2; i < num; i++) {
			if ((limite % i) == 0) {//ES PRIMO
				esPrimo = true;
				break;
			}
		}
		return esPrimo;
	}
	

}
//if (scanf("%d", &numero) != 1) {