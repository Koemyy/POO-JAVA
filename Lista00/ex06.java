//Francine de Paula Nogueira Santos
import java.util.Scanner;
import java.util.Random;

public class ex06{
	
	public static void main (String[] args) {
		int A[][],n,m,busca,contador=0;
		Random random = new Random();
		Scanner src = new Scanner(System.in);
		
		System.out.print("Linhas: ");
		n=src.nextInt();
		System.out.print("Colunas: ");
		m=src.nextInt();
		System.out.print("Achar na matriz: ");
		busca=src.nextInt();
		
		A=new int[n][m];
		
		for(int i=0;i<n;i++){
			for(int j=0; j<m;j++){
				A[i][j]=random.nextInt(25);
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<n;i++){
			for(int j=0; j<m;j++){
				if(A[i][j]==busca){
					contador++;
					System.out.println("Linhas " + (i+1) + "Colunas "+ (j+1));
				}
			}
			System.out.println();
		}
		System.out.print("Quantidade de vezes que "+ busca + " apareceu: "+contador);
	}
}

