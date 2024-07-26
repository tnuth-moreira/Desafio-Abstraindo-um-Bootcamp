import java.time.LocalDate;

import br_com_dio_desafio.dominio.Bootcamp;
import br_com_dio_desafio.dominio.Curso;
import br_com_dio_desafio.dominio.Dev;
import br_com_dio_desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de Java Bootcamp");
        curso1.setCargaHoraria(80);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Curso de Python Bootcamp");
        curso2.setCargaHoraria(70);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso JavaScript");
        curso3.setDescricao("Curso de JavaScript Bootcamp");
        curso3.setCargaHoraria(96);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Curso de Java Bootcamp");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(curso3);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Curso sobre Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devThiago = new Dev();
        devThiago.setNome("Thiago");
        devThiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devThiago.getConteudosInscritos());
        devThiago.progredir();
        devThiago.progredir();
        devThiago.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos: " + devThiago.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: " + devThiago.getConteudosConcluidos());
        System.out.println("XP: " + devThiago.calcularTotalXp());

        System.out.println("--------------------");

        Dev devNuth = new Dev();
        devNuth.setNome("Nuth");
        devNuth.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devNuth.getConteudosInscritos());
        devNuth.progredir();
        devNuth.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos: " + devNuth.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: " + devNuth.getConteudosConcluidos());
        System.out.println("XP: " + devNuth.calcularTotalXp());

    }
}
