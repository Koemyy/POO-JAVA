//Francine de Paula Nogueira Santos
import java.util.Scanner;
import java.util.Random;

public class ex07 {

    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        
        while(true){
			System.out.print("Jogar o dado [s/n]: ");
			if(src.next().equals("s")){
				System.out.println("Saiu: "+dado());
			}else{
				break;
			}
		}
        
	}
	public static int dado(){
		Random rnd = new Random();
		return rnd.nextInt(6)+1;
	}
		
}
