package br.com.abc.introducao.arrays;/*
* Estudar e largar a mão de ser idiota
* */

public class Arrays3 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numeros2 = {1,2,3,4,5};
        //array com 5 posições tam = 5, index 0-4
        int[] numeros3 = new int[]{1,2,3,4,5};
        //Junção entre os dois arrays, sem colocar tamanho entre as chaves

//        for(int i=0; i<numeros2.length; i++){
//            System.out.println(numeros2[i]);
//        }
        for(int aux: numeros2) {
        System.out.println(aux); //será muito utilizado em coleções
        }
    }

}
