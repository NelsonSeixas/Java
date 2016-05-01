
package SuperLoto;

/**
 * @Project: ProgrTegr
 * @version: ordenar.java : 1.1.1.1
 * @First Build: (26/abr/2016)
 * @author: Nelson Seixas 
 */
public class ordenar {
    public static void ord (int ident, int[] chaveUtilizador){
        int k, temp;
        if (ident!=0) {
            for (k=ident;k>=1;k--){
                if  ((chaveUtilizador[k]<chaveUtilizador[k-1])) {
                    temp = chaveUtilizador[k-1];
                    chaveUtilizador[k-1] = chaveUtilizador[k];
                    chaveUtilizador[k]= temp;
                }   
            }    
        }
        // para visualizar a ordenação em tempo real
//      System.out.println(""); // mostrar a ordenaçao em tempo real
//      int i;
//      for (i=0 ; i <= 4; i++){
//          System.out.println(chaveUtilizador[i]);
//      }
    }
    public static void ordRandom (int id, int jd, int[][] matriz1){
        int k, temp;
        for (k=jd;k>=1;k--){
            if  ((matriz1[id][k]<matriz1[id][k-1])) {
                temp = matriz1[id][k-1];
                matriz1[id][k-1] = matriz1[id][k];
                matriz1[id][k]= temp;
            }   
        }
//        // para visualizar a ordenação em tempo real
//        System.out.println(""); // mostrar a ordenaçao em tempo real
//        int i,j;
//        for (i=0 ; i <=5; i++){
//            for (j=0; j<=4; j++){ 
//                System.out.println(matriz1[i][j] + " numero " + i + "i - j "+ j);
//            }
//        }
    }
}

