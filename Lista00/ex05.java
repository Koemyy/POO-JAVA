//Francine de Paula Nogueira Santos
import java.util.Scanner;

public class ex05 {
	
	public static void main (String[] args) {
		int A[][],B[][],soma[][],n,m,aleatorio;
		Scanner src = new Scanner(System.in); 
		
		System.out.print("Quantidade de linhas: ");
		n=src.nextInt();
		System.out.print("Quantidade de colunas: ");
		m=src.nextInt();
		
		A=new int[n][m];
		B=new int[n][m];
		soma=new int[n][m];
		
		for(int i=0;i<n;i++){
			for(int j=0; j<m;j++){
				System.out.print("Digite um valor matriz A : "+i+" "+j+" ");
				A[i][j]=src.nextInt();
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0; j<m;j++){
				System.out.print("Digite um valor matriz B: "+i+" "+j+" ");
				B[i][j]=src.nextInt();
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0; j<m;j++){
				soma[i][j]=A[i][j]+B[i][j];
				System.out.print(soma[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

