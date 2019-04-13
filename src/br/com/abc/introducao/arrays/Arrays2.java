package br.com.abc.introducao.arrays;

public class Arrays2 {
    public static void main(String[] args) {
        //byte, short, int, long, float, double = 0
        //char '\u0000'  ' '
        // boolean = false
        //reference = null
        String[] nomes = new String[4];
            nomes[0] = "Bruce Wayne - DC";
            nomes[1] = "Steve Rogers - Marvel";
            nomes[2] = "Dr. Manhattan - Vertigo";
            nomes[3] = "John Constantine - DC";

            for(int i=0; i<nomes.length; i++) {
                System.out.println(nomes[i]);
            }
            nomes = new String[4];

    }
}
