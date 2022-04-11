//Francine de Paula Nogueira Santos
import java.util.Random;


public class ex17 {
	
	public static void main (String[] args) {
		int G[][],numeros;
		
		Random random = new Random ();
		numeros=random.nextInt(9)+1;
		G = new int[numeros][numeros];
		
		for(int i=0;i<numeros;i++){
			for(int j=0;j<numeros;j++){
				G[i][j]=random.nextInt(5);
				if(i<=j||i+j>=numeros-1){
					System.out.print(G[i][j]+" ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
