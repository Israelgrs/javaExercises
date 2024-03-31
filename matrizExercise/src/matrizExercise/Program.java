package matrizExercise;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int rows, columns, selected;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the number of rows");
		rows = sc.nextInt();
		System.out.println("Insert the number of columns");
		columns = sc.nextInt();
		int[][] matriz = new int[rows][columns];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				System.out.println("Insira o valor que será acrescentado na " + (j + 1) + "ª Coluna da linha " + (i + 1));
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]);
				
				if(!(j == (matriz[i].length - 1))){
					System.out.print("-");
				}
			}
			System.out.println("");
		}
		
		System.out.println("Select a Number to see his neighboors");
		selected = sc.nextInt();
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				if(matriz[i][j] == selected) {
					System.out.println("Position: " + i + ", " + j);
					if(j > 0){
						System.out.println("Left: " + matriz[i][j -1]);
					}
					
					if(i > 0){
						System.out.println("Top: " + matriz[i - 1][j]);
					}
					if(j < (matriz[i].length - 1)){
						System.out.println("Right: " + matriz[i][j + 1]);
					}
					
					if(i < (matriz.length - 1)){
						System.out.println("Down: " + matriz[i + 1][j]);
					}
				}
			}
		}
		
		
		sc.close();
	}

}
