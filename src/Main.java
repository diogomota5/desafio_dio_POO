import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição curso java");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JS");
        curso1.setDescricao("Descrição curso js");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Camila");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Camila: " + dev.getConteudosIncritos());
        dev.progredir();
        System.out.println("\nConteudos concluidos Camila: " + dev.getConteudosConcluidos());
        System.out.println("\nConteudos inscritos Camila: " + dev.getConteudosIncritos());
        dev.progredir();
        System.out.println("\nConteudos concluidos Camila: " + dev.getConteudosConcluidos());
        System.out.println("\nConteudos inscritos Camila: " + dev.getConteudosIncritos());
        System.out.println("XP: " + dev.calcularTotalXp());

        System.out.println("====================================");

        Dev dev1 = new Dev();
        dev.setNome("João");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("\nConteudos inscritos João: " + dev1.getConteudosIncritos());
        dev1.progredir();
        System.out.println("\nConteudos concluidos Camila: " + dev.getConteudosConcluidos());
        System.out.println("\nConteudos inscritos João: " + dev1.getConteudosIncritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("\nConteudos concluidos Camila: " + dev.getConteudosConcluidos());
        System.out.println("\nConteudos inscritos João: " + dev1.getConteudosIncritos());
        System.out.println("XP: " + dev1.calcularTotalXp());

    }
}