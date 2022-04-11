//Francine de Paula Nogueira Santos
import java.util.Random;
public class Ex02 {
	
	public static void main (String[] args) {
		int B[][];
		Random random = new Random();
		B = new int[6][3];
		
		for(int i=0;i<6;i++){
			for(int j=0;j<3;j++){
				B[i][j] = random.nextInt(100)+1;
				System.out.print(B[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("\n");
		for(int i=5;i>=0;i--){
			for(int j=2;j>=0;j--){
				System.out.print(B[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

