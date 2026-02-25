
public class EVA1_21_SUMATORIA {
	public static void main(String args[]){
		System.out.println("Sumatoria de 8 es: " + sumatoria(0, 8));
		
	}
	public static int sumatoria(int sum, int cont) {
	    if (cont == 1)
	        return sum;
	    return sum + sumatoria(sum + 1, cont - 1);
	}
}
