package br.com.abc.introducao.controlefluxo;/*
Aula 15
 */

public class ControleFluxo4 {
    public static void main(String[] args) {
        int contador = 11;
        while (contador < 10 ){
            System.out.println(++contador);
        } //estrutura falsa
        contador = 0;
        do {
            System.out.println("Dentro do Do While: " + contador++);
        }while (contador < 10);

        for(int i=0 ; i<10; i++) {
            System.out.println("O valor de i é: " +i);
            if(i==5) {
                break;
            }
        }
    }
}
