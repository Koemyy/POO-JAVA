//Francine de Paula Nogueira Santos
import java.util.Scanner;

public class ex04 {
	
	public static void main (String[] args) {
		Scanner src = new Scanner (System.in);
		double a,b,c;
		
		System.out.print("Digite um numero a: ");
		a = src.nextDouble();
		System.out.print("Digite um numero b: ");
		b = src.nextDouble();
		System.out.print("Digite um numero c: ");
		c = src.nextDouble();
		
		System.out.print("Delta e: "+delta(a,b,c));
	}
	
	public static double delta(double a, double b, double c){
		return (b*b)-4*a*c;
	}
}

