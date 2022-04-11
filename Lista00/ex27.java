//Francine de Paula Nogueira Santos
import java.util.Scanner;
import java.util.Random;

public class ex27 {
	
	public static void main (String[] args) {
		int matrizOrdenada[][],matriz[][],linha, coluna;
		
		Scanner src = new Scanner(System.in);
		Random aleatorio = new Random();
		
		System.out.print("Quantidade de linhas: ");
		linha = src.nextInt();
		System.out.print("Quantidade de colunas: ");
		coluna = src.nextInt();
		
		matriz= new int[linha][coluna];
		matrizOrdenada= new int [linha][coluna];
		
		for(int i=0;i<linha;i++){
			for(int j=0;j<coluna;j++){
				int numero=aleatorio.nextInt(9);
				matriz[i][j]= numero;
				matrizOrdenada[i][j]= numero;
				
			}
		}	
		
		for(int i=0;i<linha;i++){
			for(int j=0;j<coluna-1;j++){
				for(int k=j+1;k<coluna;k++){
					if(matrizOrdenada[i][j]>matrizOrdenada[i][k]){
						int aux=matrizOrdenada[i][j];
						matrizOrdenada[i][j]=matrizOrdenada[i][k];
						matrizOrdenada[i][k]=aux;
					}
				}
			}
		}
		for(int i=0;i<linha;i++){
			for(int j=0;j<coluna;j++){
				System.out.print(matriz[i][j]+" ");
			}
			System.out.print("\t");
			for(int j=0;j<coluna;j++){
				System.out.print(matrizOrdenada[i][j]+" ");
			}
			System.out.println();
		}
	}
}
