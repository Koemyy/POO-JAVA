//Francine de Paula Nogueira Santos
import java.util.Scanner;
import java.util.Random;

public class ex31 {
	
	public static void main (String[] args) {
		int linha,coluna, matriz[][],  maior, menor;
		
		Scanner src = new Scanner(System.in);
		Random aleatorio = new Random();
		
		System.out.print("Quantidade de linhas: ");
		linha = src.nextInt();
		System.out.print("Quantidade de colunas: ");
		coluna = src.nextInt();
		System.out.print("Maior numero: ");
		maior = src.nextInt();
		System.out.print("Menor numero: ");
		menor = src.nextInt();

		matriz= new int [linha][coluna];

		for(int i=0;i<linha;i++){
			for(int j=0;j<coluna;j++){
				matriz[i][j]=aleatorio.nextInt(maior-menor)+menor;
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
}
