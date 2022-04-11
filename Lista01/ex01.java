//Francine de Paula Nogueira Santos
import java.util.Scanner;

public class ex01 {
	
	public static void main (String[] args) {
		Scanner src = new Scanner (System.in);
		double input;
		
		System.out.print("Digite um numero pra ser verificado((com ,)): ");
		input = src.nextDouble();

		if(isPositivo(input)){
			System.out.print("Numero digitado positivo " + input+ ".");
		}else{
			System.out.print("Numero digitado negativo " + input+ ".");
		}
		
	}
	public static boolean isPositivo(double num){
		if(num>=0){
			return true;
		}else{
			return false;
		}
	}
}

