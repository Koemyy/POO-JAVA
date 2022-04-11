//Francine de Paula Nogueira Santos
import java.util.Scanner;
import java.util.Random;

public class ex29 {
	
	public static void main (String[] args) {
		int elementos, array[], matriz[][], primo,contador=0;
		
		Scanner src = new Scanner(System.in);
		Random aleatorio = new Random();
		
		System.out.print("Quantidade de elementos da array: ");
		elementos = src.nextInt();
		
		array = new int[elementos];
		matriz= new int [elementos][];
		
		for(int i=0;i<elementos;i++){
			int numero= aleatorio.nextInt(8)+1;
			array[i]= numero;
			matriz[i]= new int [numero+1];
			
			matriz[i][0]=numero;
			primo=2;
			
			
			for(int j=1; j<=numero; ){
                contador=0;
                for(int k=2; k<primo;k++ ){
                    if(primo%k ==0){
                        contador++;
                    }
                }
                if(contador==0){
                    matriz[i][j] = primo;
                    j++;
                }
                primo++;
            }
        }


        for(int i=0; i<elementos; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }	
	}
}
