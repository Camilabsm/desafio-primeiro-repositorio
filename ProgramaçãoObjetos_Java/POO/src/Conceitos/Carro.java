package Conceitos;
class Carro extends Veiculo {
    
    String cor;
    String modelo;
    int capacidadeTanque;

    /* Sobrecarga 1 */
    Carro(){

    }

    /* Sobrecarga 2 */

    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    /* Set & Get */

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapacitadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacitadeTanque(){
        return capacidadeTanque;
    }
    
    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque*valorCombustivel;
}
}  
   