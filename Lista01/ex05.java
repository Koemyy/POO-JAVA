//Francine de Paula Nogueira Santos
import java.util.Scanner;
import java.lang.Math;

public class ex05 {
	
	public static void main (String[] args) {
		Scanner src = new Scanner (System.in);
		double a,b,c,resultado[];
		
		resultado = new double [2];
		
		System.out.print("Digite um numero a: ");
		a = src.nextDouble();
		System.out.print("Digite um numero b: ");
		b = src.nextDouble();
		System.out.print("Digite um numero c: ");
		c = src.nextDouble();
		
		resultado = bhaskara(a,b,c);
		
		System.out.print("Raiz 01: "+resultado[0]);
		
		System.out.print("Raiz 02: "+resultado[1]);
		
		bhaskara(a,b,c);
	}
	
	public static double[] bhaskara(double a, double b, double c){
		double delta,retorno[];
		retorno = new double [2];
		delta=(b*b)-4*a*c;
		
		if(delta>=0){
			retorno[0]=(-b+Math.sqrt(delta))/2*a;
			retorno[1]=(-b-Math.sqrt(delta))/2*a;
		}
		return retorno;	
	}
}

