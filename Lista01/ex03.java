//Francine de Paula Nogueira Santos
import java.util.Scanner;

public class ex03 {
	
	public static void main (String[] args) {
		Scanner src = new Scanner (System.in);
		double input;
		
		System.out.print("Digite um numero pra ser verificado((com ,)): ");
		input = src.nextDouble();

		if(isZero(input)){
			System.out.print("Numero digitado e zero " + input+ ".");
		}else if(isPositivo(input)){
			System.out.print("Numero digitado e positivo " + input+ ".");
		}else{
			System.out.print("Numero digitado e negativo " + input+ ".");
		}
		
	}
	
	public static boolean isPositivo(double num){
		if(num>=0){
			return true;
		}else{
			return false;
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

