//Francine de Paula Nogueira Santos
import java.util.Scanner;

public class ex04 {
	
	public static void main (String[] args) {
		int receberMenor, array[];		
		array=getDados();
		receberMenor=menor(array);
		
		System.out.print("O maior e: "+receberMenor);
	}
	
	public static int[] getDados(){
		Scanner src = new Scanner (System.in);
		int array[]= new int[2];
		
		System.out.print("Primeiro valor: ");
		array[0]=src.nextInt();
		System.out.print("Segundo valor: ");
		array[1]=src.nextInt();
		
		return array;
		
	}
	public static int menor(int [] valores){
		int aux=0;
		for(int i=0;i<2;i++){
			if(i==0){
				aux=valores[0];
			}else{
				aux=Math.min(valores[i],aux);
				
			}
		}
		
		return aux;
	}
}
