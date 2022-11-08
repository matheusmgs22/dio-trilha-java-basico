public class Carro {
    
    String modelo;
    String cor;
    int capacidade;

    int valorTotal;
    double valorDaGasolina;

    Carro(){

    }

    Carro(String cor, String modelo, int capacidade){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidade = capacidade;


    }

    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getCor() {
        return cor;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }


    public double getCapacidade() {
        return capacidade;
    }


    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }


    public int getValorTotal() {
        return valorTotal;
    }


    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }


    public double getValorDaGasolina() {
        return valorDaGasolina;
    }


    public void setValorDaGasolina(Double valorDaGasolina) {
        this.valorDaGasolina = valorDaGasolina;
    }


    public void valorTotal (int valorDaGasolina, int capacidade){
        this.valorTotal = valorDaGasolina * capacidade;

    }
}
