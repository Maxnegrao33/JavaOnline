package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

            calc.somaDoisNumeros();
            calc.subtraiDoisNumeros();
            calc.multiplicaDoisNumeros(5,5);
            calc.divideDoisNumeros(20,2);


        System.out.println("Continue a execução");

    }
}
