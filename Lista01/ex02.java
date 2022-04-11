//Francine de Paula Nogueira Santos
import java.util.Scanner;

public class ex02 {
	
	public static void main (String[] args) {
		Scanner src = new Scanner (System.in);
		double input;
		
		System.out.print("Digite um numero pra ser verificado((com ,)): ");
		input = src.nextDouble();

		if(isZero(input)){
			System.out.print("Numero digitado e zero " + input+ ".");
		}else{
			System.out.print("Numero digitado nao e zero " + input+ ".");
		}
		
	}
	public static boolean isZero(double num){
		if(num==0){
			return true;
		}else{
			return false;
		}
	}
}

