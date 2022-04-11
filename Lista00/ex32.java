//Francine de Paula Nogueira Santos
import java.util.Scanner;
import java.util.Random;

public class ex32 {
	
	public static void main (String[] args) {
		int linha,coluna, matriz[][];
		
		Scanner src = new Scanner(System.in);
		Random aleatorio = new Random();
		
		System.out.print("Quantidade de linhas: ");
		linha = src.nextInt();
		System.out.print("Quantidade de colunas: ");
		coluna = src.nextInt();
		matriz= new int [linha+1][coluna+1];
		
		for(int i=0;i<linha;i++){
			for(int j=0;j<coluna;j++){
				matriz[i][j]=aleatorio.nextInt(8)+1;
				matriz[i][coluna]+=matriz[i][j];
				matriz[linha][j]+=matriz[i][j];
				
				if(i==j){
					matriz[linha][coluna]+=matriz[i][j];
				}
			}
		}
		for(int i=0;i<=linha;i++){
			for(int j=0;j<=coluna;j++){
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
