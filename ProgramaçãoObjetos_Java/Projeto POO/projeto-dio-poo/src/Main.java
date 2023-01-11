import java.time.LocalDate;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

    // Cursos, Mentorias e Bootcamp

        AtividadeCurso curso1 = new AtividadeCurso();
        curso1.setTitulo("Curso HTML");
        curso1.setDescricao("Curso de Sintaxe HTML Básico");
        curso1.setCargaHoraria(8);

        AtividadeCurso curso2 = new AtividadeCurso();
        curso2.setTitulo("Curso CSS3");
        curso2.setDescricao("Curso de CSS3 Básico");
        curso2.setCargaHoraria(10);
        
        AtividadeCurso curso3 = new AtividadeCurso();
        curso3.setTitulo("Curso de JS");
        curso3.setDescricao("Curso de Sintaxe de JavaScript Básico");
        curso3.setCargaHoraria(16);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria FrontEnd Final");
        mentoria1.setDescricao("Mentoria de Final do Bootcamp de Desenvolvedor FrontEnd");
        mentoria1.setData(LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("FrontEnd Developer HTML+CSS3+JS");
        bootcamp.setDescricao("Bootcamp para estudos de desenvolvimento FrontEnd utilizando HTML, CSS3 e JavaScript");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria1);
        
        System.out.println(bootcamp); 
        System.out.println("");

        // Desenvolvedores na plataforma

        System.out.println("Dev 1: ");
        Dev dev1 = new Dev();
        dev1.setNome("Raíssa");
        dev1.inscreverBootcamp(bootcamp);
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos Inscritos de Raíssa: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Raíssa: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());
        dev1.statusDev();
        System.out.println("----------");
        
        System.out.println("Dev 2: ");
        Dev dev2 = new Dev();
        dev2.setNome("Larissa");
        dev2.inscreverBootcamp(bootcamp);
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos Inscritos de Larissa: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Larissa: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());
        dev2.statusDev();
        System.out.println("----------");
        
        System.out.println("Dev 3: ");
        Dev dev3 = new Dev();
        dev3.setNome("Lucas");
        dev3.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Lucas: " + dev3.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Lucas: " + dev3.getConteudosConcluidos());
        System.out.println("XP: " + dev3.calcularTotalXp());
        dev3.statusDev();
        System.out.println("----------");

        System.out.println("Dev 4: ");
        Dev dev4 = new Dev();
        dev4.setNome("Pedro");
        dev4.progredir();
        System.out.println("Conteúdos Inscritos de Pedro: " + dev4.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Pedro: " + dev4.getConteudosConcluidos());
        System.out.println("XP: " + dev4.calcularTotalXp());
        dev4.statusDev();
        System.out.println("----------");

        System.out.println("Dev 5: ");
        Dev dev5 = new Dev();
        dev5.setNome("Camila");
        dev5.inscreverBootcamp(bootcamp);
        dev5.progredir();
        dev5.progredir();
        dev5.progredir();
        dev5.progredir();
        System.out.println("Conteúdos Inscritos de Camila: " + dev5.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Camila: " + dev5.getConteudosConcluidos());
        System.out.println("XP: " + dev5.calcularTotalXp());
        dev5.statusDev();
        System.out.println("----------");
        System.out.println("");
        
        // Ranking do Bootcamp

        System.out.println("Ranking do Bootcamp: ");
        System.out.println("");
        Map<String, Double> ranking = new TreeMap<>(){{
            put(dev1.getNome(), dev1.calcularTotalXp());
            put(dev2.getNome(), dev2.calcularTotalXp());
            put(dev3.getNome(), dev3.calcularTotalXp());
            put(dev4.getNome(), dev4.calcularTotalXp());
            put(dev5.getNome(), dev5.calcularTotalXp());
        }};
        
        Set<Map.Entry<String, Double>> rankingDevs = new TreeSet<>(new ComparatorXp().reversed());
        rankingDevs.addAll(ranking.entrySet());
        
        for (Map.Entry<String, Double> entry : rankingDevs) {
            System.out.println(entry.getKey() + " - XP: " + entry.getValue());
        }
}
  
}

class ComparatorXp implements Comparator<Map.Entry<String, Double>>{

    @Override
    public int compare(Map.Entry<String, Double> d1 , Map.Entry<String, Double> d2) {
        return d1.getValue().compareTo(d2.getValue());
    }

}