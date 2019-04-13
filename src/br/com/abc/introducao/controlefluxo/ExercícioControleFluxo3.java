package br.com.abc.introducao.controlefluxo;

public class ExercícioControleFluxo3 {
    public static void main(String[] args) {
        //Imprimir todos os números pares de 0 até 100000

        int contador = 100000;
            for (int i=0; i<=contador; i++) {
                if (i % 50 == 0) {
                    System.out.println(i);
                }
            }
    }
}
