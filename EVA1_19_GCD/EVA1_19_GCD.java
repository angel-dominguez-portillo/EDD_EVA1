
public class EVA1_19_GCD {
	/*
	 * 
	 */
	public static void main(String args[]){
		System.out.println("Maximo común divisor de 180 y 48 es " + gcd(180,48));
		
	}
	public static int gcd(int max, int div) {
		if (div == 0)
			return max;	
		else
			return gcd(div, (max % div));
	}
}


/*ES EL EJEMPLO DEL PROFE:
 * 
 * public static void main(String args[]){
		System.out.println("Maximo común divisor de 180 y 48 es " + gcd(180,48));
		
	}
	public static int gcd(int max, int div) {
	int resi = max % div; //Me interesa el reciduo
		if (resi > 0)
			return gcd(div, resi);	
		else
			return div;
	}
}



ESTE ES EL OTRO:

 *public static void main(String args[]){
		System.out.println("Maximo común divisor de 180 y 48 es " + gcd(180,48));
		
	}
	public static int gcd2(int max, int div) {
		if (resi > 0)
			int resi = max % div; //Me interesa el reciduo
			return gcd(div, resi);	
		else
			return valor;
	}
}
 */