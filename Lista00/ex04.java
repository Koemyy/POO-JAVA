//Francine de Paula Nogueira Santos
import java.util.Scanner;
import java.util.Random;

public class ex04 {
	
	public static void main (String[] args) {
		int D[][],n,m,aleatorio;
		Random random = new Random();
		Scanner src = new Scanner(System.in); 
		do{
			System.out.print("Quantidade de linhas: ");
			n=src.nextInt();
		}while(n<=0);
		do{
			System.out.print("Quantidade de colunas: ");
			m=src.nextInt();
		}while(m<=0);
		do{
			System.out.print("Maior numero a ser gerado: ");
			aleatorio=src.nextInt();
		}while(aleatorio<=0);
		
		D = new int [n][m];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				D[i][j]= random.nextInt(aleatorio);
				System.out.print(D[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
