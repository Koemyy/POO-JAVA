//Francine de Paula Nogueira Santos
import java.util.Random;
import java.util.Scanner;


public class ex08 {
	
	public static void main (String[] args) {
		int A[][], n, m,impar[],par[],elementosPar=0,elementosImpar=0;

        Scanner scr = new Scanner(System.in);
        Random aleatorio = new Random();

        do{
            System.out.print("Qtd de linhas da matriz (maiores do que 0): ");
            n = scr.nextInt();
        }while(n<1);
        do{
            System.out.print("Qtd de colunas da matriz (maiores do que 0): ");
            m = scr.nextInt();
        }while(m<1);
        
        A = new int[n][m];
        System.out.println();
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                A[i][j] = aleatorio.nextInt(100);
                System.out.print(A[i][j] + "\t");
                if(A[i][j]%2==0){
					elementosPar++;
				}else{
					elementosImpar++;
				}
		}
		System.out.println();	
		}
		
			par = new int[elementosPar];
		
			impar = new int[elementosImpar];
	
		elementosPar=0;
		elementosImpar=0;
		
		for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(A[i][j]%2==0){
					par[elementosPar]=A[i][j];
					elementosPar++;
				}else{
					impar[elementosImpar]=A[i][j];
					elementosImpar++;
				}
			}
		}
		if(par.length>0){
			System.out.println("Quantidade de pares: " + par.length);
			for(int i=0;i<par.length;i++){
				System.out.print(par[i]+ " ");
			}
		}else{
		System.out.print("Nenhum par");
		}if(impar.length>0){
			System.out.println("\nQuantidade de impares: " + impar.length);
			for(int i=0;i<impar.length;i++){
				System.out.print(impar[i]+ " ");
			}
		}else{
		System.out.print("Nenhum impar");
		}
		
	}
}
