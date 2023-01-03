public class App {
    public static void main(String[] args) throws Exception {
        double salarioMensal = 9000d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 1;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes > mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes > mediaDependentes;

        System.out.println(salarioBaixo && muitosDependentes);
    }
}
