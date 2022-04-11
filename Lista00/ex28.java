//Francine de Paula Nogueira Santos
import java.util.Scanner;
import java.util.Random;

public class ex28 {
	
	public static void main (String[] args) {
		int matrizOrdenada[][],matriz[][],linha, coluna,matrizAux[][];
		
		Scanner src = new Scanner(System.in);
		Random aleatorio = new Random();
		
		System.out.print("Quantidade de linhas: ");
		linha = src.nextInt();
		System.out.print("Quantidade de colunas: ");
		coluna = src.nextInt();
		
		matriz= new int[linha][coluna];
		matrizAux= new int[coluna][linha];
		matrizOrdenada= new int [linha][coluna];
		
		for(int i=0;i<linha;i++){
			for(int j=0;j<coluna;j++){
				int numero=aleatorio.nextInt(9);
				matriz[i][j]= numero;
				matrizAux[j][i]=numero;
			}
		}	
		
		for(int i=0;i<coluna;i++){
			for(int j=0;j<linha-1;j++){
				for(int k=j+1;k<linha;k++){
					if(matrizAux[i][j]>matrizAux[i][k]){
						int aux=matrizAux[i][j];
						matrizAux[i][j]=matrizAux[i][k];
						matrizAux[i][k]=aux;
					}
				}
			}
		}
		
		for(int i=0;i<linha;i++){
			for(int j=0;j<coluna;j++){
				int numero=aleatorio.nextInt(9);
				matrizOrdenada[i][j]= matrizAux[j][i];
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
