//Josimar Pereira Bazilio

import java.util.Random;
import java.util.Scanner;
public class ex07 {

    public static void main (String[] args) {
        int mA[][], l, c, maior=0, menor=100;
        String maiorP="", menorP="";

        Scanner scr = new Scanner(System.in);
        Random aleatorio = new Random();

        do{
            System.out.print("Qtd de linhas da matriz (maiores do que 0): ");
            l = scr.nextInt();
        }while(l<1);
        do{
            System.out.print("Qtd de colunas da matriz (maiores do que 0): ");
            c = scr.nextInt();
        }while(c<1);

        mA = new int[l][c];
        System.out.println();

        for(int i = 0; i<l; i++){
            for(int j = 0; j<c; j++){
                mA[i][j] = aleatorio.nextInt(100);
                System.out.print(mA[i][j] + "\t");
                if(mA[i][j]>maior){
                    maior = mA[i][j];
                    maiorP = "Linha " + (i+1) + " Coluna " + (j+1);
                }
                if(mA[i][j]<menor){
                    menor = mA[i][j];
                    menorP = "Linha " + (i+1) + " Coluna " + (j+1);
                }
            }
            System.out.println();
        }

        System.out.println("Maior numero: " + maior + " Posicao: " + maiorP);
        System.out.println("Menor numero: " + menor + " Posicao: " + menorP);


    }
}
