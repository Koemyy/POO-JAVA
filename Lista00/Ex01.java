public class Ex01 {
	
	public static void main (String[] args) {
		int A[][];
		
		A = new int[4][5];
		
		for(int i=0;i<4;i++){
			for(int j=0;j<5;j++){
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
	}
}

