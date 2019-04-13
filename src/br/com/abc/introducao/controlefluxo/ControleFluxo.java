package br.com.abc.introducao.controlefluxo;

public class ControleFluxo {
    public static void main (String [] args){
        // idade < 15 categoria infantil
        // idade >= 15 && idade < juvenil
        // idade >= 18 adulto
        int idade = 18;
        String categoria;
        if (idade < 15)
            categoria = "infantil";
        else if (idade >=15 && idade < 18)
            categoria = "juvenil";
        else
            categoria = "adulto";

        System.out.println(categoria);

    }
}
