
public class EVA1_20_POTENCIA {
	/*
	 * 
	 */
	static int n;
	public static void main(String args[]){
		n = 8;
		System.out.println("Potencia de 8 al cuadrado es " + potencia(9,2));
		
	}
	/*
	public static int potencia(int num, int exp) {
		if (exp == 1)
			return num;	
		else
			return potencia((num * n), (exp - 1));
	}
}
*/
 	public static int potencia(int num, int exp) {
  		int res = num * num;
		if (exp == 1)
			return potencia(res, (exp - 1));	
		else
			return res;
	}
}

 	