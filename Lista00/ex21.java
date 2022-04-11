//Francine de Paula Nogueira Santos
import java.util.Random;

public class ex21 {
	
	public static void main (String[] args) {
		int a[][],b[][],c[][],numeros,linha,coluna1,coluna2;
		Random random = new Random();
		
		linha=random.nextInt(4)+1;
		coluna1=random.nextInt(4)+1;
		coluna2=random.nextInt(4)+1;
		
		a=new int [linha][coluna1];
		b=new int [linha][coluna2];
		c=new int [linha][coluna1+coluna2];
		
		for(int i=0;i<linha;i++){
			for(int j=0;j<coluna1;j++){
				a[i][j]=random.nextInt(9);
				System.out.print(a[i][j]+" ");
				c[i][j]=a[i][j];
			}
			System.out.print("\t");
			for(int k=0;k<coluna2;k++){
				b[i][k]=random.nextInt(9);
				System.out.print(b[i][k]+" ");
				c[i][k+coluna1]=b[i][k];
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<linha;i++){
			for(int j=0;j<coluna1+coluna2;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}

