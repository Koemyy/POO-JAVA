//Francine de Paula Nogueira Santos
import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	
	public static void main (String[] args) {
		int C[][],tamanho;
		Random random = new Random();
		Scanner scr= new  Scanner(System.in);
		
		do{
		System.out.print("Tamanho da matriz, 1 a 20: ");
		tamanho=scr.nextInt();
	}while(tamanho<0||tamanho>=20);
		
		C  = new int[tamanho][tamanho];
		
		for(int i=0;i<tamanho;i++){
			for(int j=0;j<tamanho;j++){
				C[i][j] = random.nextInt(100)+1;
				System.out.print(C[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

