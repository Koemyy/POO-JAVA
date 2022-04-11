//Francine de Paula Nogueira Santos
import java.util.Scanner;
import java.util.Random;

public class ex26 {
	
	public static void main (String[] args) {
		int matriz[][], ordem[],linha, coluna,contador=0,ordenada[][],aux;
		Random aleatorio = new Random();
		Scanner src = new Scanner (System.in);
		
		System.out.print("Numero de linhas: ");
		linha = src.nextInt();
		System.out.print("Numero de colunas: ");
		coluna = src.nextInt();
		
		matriz= new int [linha][coluna];
		ordem= new int [linha*coluna];
		ordenada = new int [linha][coluna];
		
		for(int i=0;i<matriz.length;i++){
			for(int j=0; j<matriz.length; j++){
				matriz[i][j]=aleatorio.nextInt(9);
				ordem[contador]=matriz[i][j];
				contador++;
			}
		}
		for(int i=0; i<ordem.length-1;i++){
			for(int j=i+1;j<ordem.length;j++){
				if(ordem[i]<ordem[j]){
					aux = ordem[j];
					ordem[j]=ordem[i];
					ordem[i]= aux;
				}
			}
		}
		contador=0;
		for(int i=0;i<linha;i++){
			for(int j=0;j<coluna;j++){
				ordenada[i][j]=ordem[contador];
				contador++;
				
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.print("\t");
			for(int j=0;j<ordenada.length;j++){
				System.out.print(ordenada[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

