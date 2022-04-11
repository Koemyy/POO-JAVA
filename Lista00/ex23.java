//Francine de Paula Nogueira Santos
import java.util.Scanner;

public class ex23 {
	
	public static void main (String[] args) {
		int matriz[][],colunas,linhas,primos=2,contador=0;
		
		Scanner src= new Scanner(System.in);
		System.out.print("Quantidade de linhas: ");
		linhas = src.nextInt();
		System.out.print("Quantidade de colunas: ");
		colunas = src.nextInt();
		
		matriz= new int[linhas][colunas];
		
		for(int i=0; i<linhas;i++){
			for(int j=0; j<colunas; ){
				contador=0;
				for(int k=2;k<primos;k++){
					if(primos%k==0){
						contador++;
					}
				}
				if(contador==0){
					matriz[i][j]=primos;
					System.out.print(matriz[i][j]+"\t");
					j++;
				}
				primos++;
			}
			System.out.println();
		}
	}
}

