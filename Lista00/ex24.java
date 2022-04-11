//Francine de Paula Nogueira Santos
import java.util.Scanner;

public class ex24 {
	
	public static void main (String[] args) {
		int matriz[][], linha, coluna,v1=0,v2=1,aux;
		
		Scanner src = new Scanner (System.in);
		
		System.out.print("Numero de linhas: ");
		linha = src.nextInt();
		System.out.print("Numero de colunas: ");
		coluna = src.nextInt();
		
		matriz= new int [linha][coluna];
		
		for(int i=0;i<linha;i++){
			for(int j=0; j<coluna; j++){
				matriz[i][j]=v1;
				aux=v1;
				v1+=v2;
				v2=aux;
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

