//Francine de Paula Nogueira Santos
import java.util.Scanner;
import java.util.Random;

public class ex08 {

    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        int array[] = new int[6];
         
		for(int i=0;i<100;i++){
			int aux= dado();
			 array[aux-1]++;
		}
		for(int i=0;i<6;i++){
			System.out.println(i+1+": "+array[i]+(100/array[i])+"%");
		}
	}
        
	public static int dado(){
		Random rnd = new Random();
		return rnd.nextInt(6)+1;
	}		
}
