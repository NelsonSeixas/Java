
package SuperLoto;

/**
 * @Project: ProgrTegr
 * @version: calcularCertos.java : 1.1.1.1
 * @First Build: (26/abr/2016)
 * @author: Nelson Seixas 
 */
public class calcularCertos {
    public static void calCertos (int matriz[][], int chaveUtilizador[], int certos[], int certostotal[], int numeroDeChaves, int chaves) {
        int i, j, k;
        for (i=0; i<=(numeroDeChaves-1); i++){
            certos[i]=0;
        }
        // calcular numeros certos por chave
        for (i=0;i <= (numeroDeChaves-1); i++) {
            for (j=0; j <= (chaves-1); j++){
                for (k=0; k<=(chaves-1); k++){
                    if(matriz[i][j] == chaveUtilizador[k]){
                        certos[i] += 1;
                    }
                }
            }        
        }
        // Iniciar matriz para apresentar tabela de Prémios
        for (i=0; i<=(numeroDeChaves-1); i++){
            certostotal[i]=0;
        }
        // calcular Prémios
        for (i=1; i<=(numeroDeChaves-1); i++) {
            for (j=0;j<=(numeroDeChaves-1);j++){
                if (certos[j]==i){
                    certostotal[i]++;           
                }   
            }
        }
    }
}
