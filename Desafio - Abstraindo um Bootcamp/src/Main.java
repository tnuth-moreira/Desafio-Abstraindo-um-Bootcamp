import java.time.LocalDate;

import br_com_dio_desafio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);

        System.out.println(mentoria);
    }
}
