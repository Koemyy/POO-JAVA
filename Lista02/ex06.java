//Francine de Paula Nogueira Santos
import java.util.Scanner;

public class ex06 {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int menor = getDados();

        while(true){
            System.out.print("Inserir outro numero?[s/n]: ");
            if(str.next().equals("s")){
                int aux=getDados();
                if(aux<menor){
                    menor=aux;
                }
            }else break;
        }
        System.out.print("O menor valor digitado foi o : " + menor);

        str.close();
    }

    public static int getDados(){
        Scanner src = new Scanner(System.in);
        int numero;
        System.out.print("Digite o valor do primeiro numero: ");
        numero= src.nextInt();

        return numero;
    } 
}
