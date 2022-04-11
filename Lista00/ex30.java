//Francine de Paula Nogueira Santos
import java.util.Scanner;
import java.util.Random;

public class ex30 {
	
	public static void main (String[] args) {
		int elementos, array[], matriz[][], v1,v2;
		
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
			
			v1=0;
			v2=1;
			for(int j=1; j<=numero;j++){
                matriz[i][j]=v1;
                int aux=v1;
				v1+=v2;
				v2=aux;
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
