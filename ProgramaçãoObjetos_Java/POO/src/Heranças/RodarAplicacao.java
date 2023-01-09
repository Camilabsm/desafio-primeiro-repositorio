package Heranças;

public class RodarAplicacao {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        /* Upcast */
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        /* Downcast 
        Vendedor vendedor_ = (Vendedor) new Funcionario(); */
    }
}
