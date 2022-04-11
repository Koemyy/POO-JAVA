//Francine de Paula Nogueira Santos
import java.util.Scanner;

public class ex05 {
	
	public static void main(String[] args) {
        int a, b, c, maior, array[] = getDados(); 

        a = array[0];
        b = array[1];
        c = array[2];

        maior = maior(a,b,c);

        System.out.print("O maior numero digitado foi o " + maior);
    }

    public static int[] getDados(){
        int array[] = new int[3];

        Scanner src = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro numero: ");
        array[0] = src.nextInt();
        System.out.print("Digite o valor do segundo numero: ");
        array[1] = src.nextInt();
        System.out.print("Digite o valor do terceiro numero: ");
        array[2] = src.nextInt();

        src.close();

        return array;
    }

    public static int maior(int a, int b, int c){
        int valores[] = {a,b,c};

        int aux = 0;
        for(int i=0; i<3; i++){
            if(i==0) aux = valores[0];
            else if(aux<valores[i]) aux = valores[i];
        }
        return aux;
    }

    public static int maior(int[] valores){
        int aux=0;
        for(int i=0; i<valores.length; i++){
            if(i==0) aux = valores[0];
            else if(aux<valores[i]) aux = valores[i];
        }
        return aux;
    }
}
