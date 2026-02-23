import java.util.Scanner;

public class EVA1_16_CALIFAS {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int[][] grupos; //NO SE CUANTOS GRUPOS SON, LO INDICA EL USUARIO
		
		System.out.println("¿cuantos grupos tiene la escuela?");
		int cant = input.nextInt();
		grupos = new int[cant][];
		for(int i = 0; i < grupos.length; i++) {//recorremos cada grupo para capturar calificaciones
			System.out.println("¿cuantos estudiantes tiene el grupo " + (i + 1) + "?");
			int estudiantes = input.nextInt();
			grupos[i] = new int[estudiantes];
		}
		//capturar calificaciones:
		for(int i = 0; i < grupos.length; i++) {//recorremos cada grupo para capturar calificaciones
			System.out.println("");
			System.out.println("+++++++++++GRUPO " + (i + 1) + "++++++++++++++++");
			for(int j = 0; j < grupos[i].length; j++) {
				System.out.println("Calificaciones del estudiante " + (j + 1) + ":");
				int califa = input.nextInt();
				grupos[i][j] = califa;
				input.nextLine();
				
			}
		}
		//IMPRIMIR CALIFICACIONES
		for(int i = 0; i < grupos.length; i++) {
			System.out.println("");
			System.out.println("+++++++++++GRUPO " + (i + 1) + "++++++++++++++++");
			for(int j = 0; j < grupos[i].length; j++) {
				System.out.println("Calificaciones del estudiante " + (j + 1) + ":" + "[" + grupos[i][j] + "]");
				}
			System.out.println("");

		}
		// CALCULAR EL PROMEDIO POR GRUPO
		for(int i = 0; i < grupos.length; i++) {
		    System.out.println("");
		    System.out.println("+++++++++++GRUPO " + (i + 1) + "++++++++++++++++");
		    
		    int acum = 0;
		    
		    for(int j = 0; j < grupos[i].length; j++) {
		        acum = acum + grupos[i][j]; 
		    }
		    
		    double promedio = (double) acum / grupos[i].length;
		    
		    System.out.println("Promedio del grupo: [" + promedio + "]");
		    System.out.println("");
		}

		
	}

}
