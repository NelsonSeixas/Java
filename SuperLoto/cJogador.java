
package SuperLoto;

import java.util.Scanner;
/**
 * @Project: ProgrTegr
 * @version: cJogador.java : 1.1.1.1
 * @First Build: (26/abr/2016)
 * @author: Nelson Seixas 
 */
public class cJogador {
    public static void chavesJogador(int matriz[][], int chaveUtilizador[], int limiteChave, int chaves) {
        int i, j, k;
        boolean validar;
        System.out.println(cores.YELLOW + "Introduza a sua chave [5 numeros - 1 a 49]:" + cores.RESET);  // introduçao de chaves do jogador
        Scanner input = new Scanner(System.in);
        for (i=0 ; i <= (chaves-1); i++){
            try {
                System.out.print((i+1) + "º número: ");
                chaveUtilizador[i] = input.nextInt();
                validar = (chaveUtilizador[i]>=1) && (chaveUtilizador[i]<=limiteChave);
                for (j=0; j<i;j++){ // verificar repetidos
                    if (chaveUtilizador[i]== chaveUtilizador[j]){                   
                    validar = false;
                    }
                }
                if (validar == true){ // nesta posiçao nao deixar repetidos, quando existia.
                    ordenar.ord(i, chaveUtilizador); // chamar metodo para ordenar
                } 
                if (validar == false){
                    throw new Exception();}}
            catch (Exception e) {
                System.out.println(cores.REDLIGHT + "Valor inválido! Fora do intervalo ou repetido.\nDigite valor entre 1 e "+limiteChave+"!!!" + cores.RESET);
                i--;
            }
        }
    }
}
