package Conceitos;
class RodarAplicacao  {
    public static void main(String[] args) {
    
        Carro carro1 = new Carro();

        carro1.setCor("Vermelho");
        carro1.setModelo("Gol");
        carro1.setCapacitadeTanque(52);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacitadeTanque());
        System.out.println(carro1.totalValorTanque(5.99));

        Carro carro2 = new Carro("Azul", "BMW", 45);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacitadeTanque());
        System.out.println(carro2.totalValorTanque(4.87));
    }
}
