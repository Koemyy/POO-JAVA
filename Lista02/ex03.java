//Francine de Paula Nogueira Santos
import java.util.Scanner;

public class ex03 {
	
	public static void main (String[] args) {
		int receberMaior, array[];		
		array=getDados();
		receberMaior=maior(array);
		
		System.out.print("O maior e: "+receberMaior);
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
	public static int maior(int [] valores){
		int aux=0;
		for(int i=0;i<2;i++){
			if(i==0){
				aux=valores[0];
			}else{
				aux=Math.max(valores[i],aux);
				
			}
		}
		
		return aux;
	}
}
