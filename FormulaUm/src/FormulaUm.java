import java.util.Scanner;

public class FormulaUm {
    public static void main(String[] args) throws Exception {

        String pilotos[] = new String[20];
        float tempos[] = new float[20];
        // pisição atual do loop
        int posicaoPiloto = 0;

        // coloquei um incremento para pegar a posição atual vencedor
        int vencedor = 0;

        // chamando as funções.
        nomePiloto(pilotos, posicaoPiloto);
        tempoPorPiloto(tempos, pilotos);
        encontraVencedor(pilotos, tempos, posicaoPiloto, vencedor);
        System.out.println();
        tempoMedio(pilotos, tempos);

    }

    public static void nomePiloto(String[] pilotos, int posicaoPiloto) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < pilotos.length; i++) {
            System.out.println("informe o nome do piloto : " + (posicaoPiloto + 1));
            pilotos[i] = entrada.nextLine();
            posicaoPiloto++;

        }

    }

    public static void tempoPorPiloto(float[] tempos, String[] pilotos) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < tempos.length; i++) {
            System.out.println("informe o tempo do piloto " + pilotos[i]);
            tempos[i] = entrada.nextFloat();
        }
    }

    public static void encontraVencedor(String[] pilotos, float[] tempos, int posicaoPiloto, int vencedor) {

        for (int i = 0; i < tempos.length; i++) {
            float menorTempo = tempos[0];
            vencedor = i;
            if (tempos[i] < menorTempo) {
                menorTempo = tempos[i];
                System.out.println("o vencedor foi: " + pilotos[vencedor]);
            }
        }
    }

    public static void tempoMedio(String[] pilotos, float[] tempos) {
        float tempoMedioCorrida = 0;
        for (int i = 0; i < pilotos.length; i++) {
            System.out.println(
                    "o piloto " + pilotos[i] + " terminou a corrida com o tempo de: " + tempos[i] + " segundos.");
            System.out.println();
            tempoMedioCorrida += tempos[i] / tempos.length;
        }
        System.out.println("tempo medio da corrida foi de " + tempoMedioCorrida);
    }
}
