public class EVA1_18_FACTORIAL {
/*
 * 
 */
	public static void main(String args[]){
		System.out.println("Factorial de 5 = " + factorialFor(5));
		System.out.println("");
		System.out.println("Factorial de 5 = " + factorialRec(5));
	}
	
	public static int factorialFor(int valor) {
		int resu = 1;
		for(int i = 1; i <= valor; i++) {
			resu = resu * i;
			
	    }
		return resu;
	}
	public static int factorialRec(int val) {
		if(val > 0)
		    return val * factorialRec(val - 1);
		else
			return 1;
	}
	
}
