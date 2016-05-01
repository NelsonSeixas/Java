
package SuperLoto;

/**
 * @Project: ProgrTegr
 * @version: apresentarResultados.java : 1.1.1.1
 * @First Build: (26/abr/2016)
 * @author: Nelson Seixas 
 */
public class apresentarResultados {
    static public void resultados(int matriz[][], int chaveUtilizador[], int certos [], int certostotal[], int numeroDeChaves, int chaves){
        int i, j, k;
        String t = "";
// Apresentar tabela      
        if (chaves<=5 ){
            System.out.println("\n\t   Chaves de Jogo\t  Chave do jogador\t Números certos");
        } else {
            System.out.printf("\n%1$" + (2*chaves) + "s Chave do jogador",t);
            System.out.printf("%1$" + (((7+(4*chaves))-(7+(2*chaves)+16))+(2*chaves)) + "s Chave do jogador",t);
            System.out.printf("%1$" + (2*chaves) + "s Números certos\n", t);
        }
        for (i=0; i <= (numeroDeChaves-1) ; i++){
            System.out.printf( "%2dª -  ",(i+1));
           
            for (j=0; j <= (chaves-1); j++){
                System.out.printf("%4d",matriz[i][j],"\t\t"); // ver o que está gravado
            }
            System.out.print("    ");
            for (j=0; j<= (chaves-1); j++){
                System.out.printf("%4d", chaveUtilizador[j]);
            }
            System.out.print("    ");
            if (certos[i]== 0){
                System.out.println("\t\t" +certos[i]);
            } else {    
                System.out.println(cores.GREEN + "\t\t" +certos[i] +  cores.RESET);    
        
            }
        }
        // Apresentar tabela de Prémios
        System.out.println("\n\tPrémio\t\tQuantidade");
        int b = 4;
        int c = 2;
        for (i=2; i<=(numeroDeChaves-1); i++) { // para começar só com mais de 2 numeros certos
            if (b>=1){
                if (certostotal[i]>=1) {
                    System.out.printf("%s%2dº%s (%d números certos)\t     ",cores.GREEN,b,cores.RESET,c);
                    System.out.print(cores.GREEN + certostotal[i] + cores.RESET);
                    // System.out.printf("%dº (%d números certos)\t%6d",b,c,certostotal[i]);
                } else {
                    System.out.printf("%2dº (%d números certos)\t%6d",b,c,0);
                }
                b--;
                c++;
                System.out.println("");
            }
        }
        System.out.printf("\n\n");
    }
}
