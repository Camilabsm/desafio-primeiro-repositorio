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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devRaissa = new Dev();
        devRaissa.setNome("Raíssa");
        devRaissa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Raíssa: " + devRaissa.getConteudosInscritos());
        devRaissa.progredir();
        devRaissa.progredir();
        System.out.println("-x-");
        System.out.println("Conteúdos Inscritos de Raíssa: " + devRaissa.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Raíssa: " + devRaissa.getConteudosConcluidos());
        System.out.println("XP: " + devRaissa.calcularTotalXp());
       
        System.out.println("----------");
        
        Dev devLarissa = new Dev();
        devLarissa.setNome("Larissa");
        devLarissa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Larissa: " + devLarissa.getConteudosInscritos());
        devLarissa.progredir();
        devLarissa.progredir();
        devLarissa.progredir();
        System.out.println("-x-");
        System.out.println("Conteúdos Inscritos de Larissa: " + devLarissa.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Larissa: " + devLarissa.getConteudosConcluidos());
        System.out.println("XP: " + devLarissa.calcularTotalXp());


        /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1); */
    }
    
}
