//Francine de Paula Nogueira Santos
import java.util.Random;

public class ex22 {
	
	public static void main (String[] args) {
		int a[][],b[][],c[][],numeros,linha,coluna1,coluna2,contador=0;
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
			}
			System.out.print("\t");
			for(int k=0;k<coluna2;k++){
				b[i][k]=random.nextInt(9);
				System.out.print(b[i][k]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<linha;i++){
			for(int j=0;j<coluna1+coluna2;j++){
				if(j<coluna1){
					c[i][contador]=a[i][j];
					System.out.print(c[i][contador]+" ");
					contador++;
				}
				if(j<coluna2){
					c[i][contador]=b[i][j];
					System.out.print(c[i][contador]+" ");
					contador++;
				}
				
			}
			contador=0
			System.out.println();
		}
	}
}

