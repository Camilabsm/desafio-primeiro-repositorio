import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AtividadeCurso curso1 = new AtividadeCurso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de Java Básico do Bootcamp");
        curso1.setCargaHoraria(20);

        AtividadeCurso curso2 = new AtividadeCurso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Curso de Js Básico do Bootcamp");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria Java do Bootcamp");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
    
}
