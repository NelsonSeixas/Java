
package SuperLoto;

/**
 * @Project: ProgrTegr
 * @version: random.java : 1.1.1.1
 * @First Build: (26/abr/2016)
 * @author: Nelson Seixas 
 */
public class random {
    public static void randomizar(int matriz1[][], int limiteChave, int numeroDeChaves, int chaves) {    
        int i, j, k;
        for (i=0; i <= (numeroDeChaves-1) ; i++){
            for (j=0; j <= (chaves-1); j++){
                matriz1 [i][j] = (int) Math.round(Math.random()*((limiteChave+.5)-0.5)+0.5);
                if (matriz1 [i][j] == (limiteChave - 1)){ // remove a possibilidade de sair numero 50.
                    j--;
                }
                for (k=0; k<j;k++){ // verificar repetidos
                    if (matriz1[i][j]== matriz1[i][k]){
                        j--;
                    }
                }
                int id = i;
                int jd = j;
                if (jd!=0) {
                    ordenar.ordRandom(id, jd, matriz1); // chamar metodo ordRandom da classe ordenar (ordenar numeros random)
                }
            }
        }
    }
}


 