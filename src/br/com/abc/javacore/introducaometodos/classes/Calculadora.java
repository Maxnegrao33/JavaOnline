package br.com.abc.javacore.introducaometodos.classes;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(5 + 57);
    }
    public void subtraiDoisNumeros(){
        System.out.println(5 - 65);
    }
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public int divideDoisNumeros(double num1, double num2) {
        double resultado = num1/num2;
        return resultado;
    }
}
