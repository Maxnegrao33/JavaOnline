package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {

        Professor prof = new Professor();
        prof.nome = "Max Oliveira";
        prof.materia = "CyberSecurity";
        prof.especializacao = "OpenSource";
        prof.telefone = "17 99713-1004";
        prof.periodoLetivo = "Manhã";

        Professor prof2 = new Professor();
        prof2.nome = "Luana Rocha";
        prof2.materia = "Astrofisica";
        prof2.especializacao = "Física Nuclear";
        prof2.telefone = "17 94578-4420";
        prof2.periodoLetivo = "Manhã";

        /* Cada new Professor é um objeto*/

        System.out.println(prof.nome);
        System.out.println(prof.materia);
        System.out.println(prof.especializacao);
        System.out.println(prof.telefone);
        System.out.println(prof.periodoLetivo);
        System.out.println();
        System.out.println("--------------------------");
        System.out.println();
        System.out.println(prof2.nome);
        System.out.println(prof2.materia);
        System.out.println(prof2.especializacao);
        System.out.println(prof2.telefone);
        System.out.println(prof2.periodoLetivo);

    }
}
