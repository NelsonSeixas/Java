
package SuperLoto;

/**
 * @Project: ProgrTegr
 * @version: Loto2.java : 1.1.1.1
 * @First Build: (26/abr/2016)
 * @author: Nelson Seixas 
 */
public class Loto2 {
    public static void main(String[] args) {  
        int numeroDeChaves = 6;
        int chaves = 5;
        int limiteChave = 49;
        int[] [] matriz= new int[numeroDeChaves][chaves];
        int[] chaveUtilizador = new int[chaves];
        int[] certos = new int[numeroDeChaves];
        int[] certostotal = new int[numeroDeChaves];
        random.randomizar(matriz, limiteChave, numeroDeChaves, chaves);   // chamar o metodo randomizar
        cJogador.chavesJogador(matriz, chaveUtilizador, limiteChave, chaves);
        calcularCertos.calCertos(matriz, chaveUtilizador, certos, certostotal, numeroDeChaves, chaves);
        apresentarResultados.resultados(matriz, chaveUtilizador, certos, certostotal, numeroDeChaves, chaves);
    }
}
