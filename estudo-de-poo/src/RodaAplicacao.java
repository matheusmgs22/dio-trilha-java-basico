public class RodaAplicacao {

    public static void main(String[] args){

    Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("Corsa");
        carro1.setCapacidade(220);
        carro1.setValorDaGasolina(6.45);
        

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidade());

        Carro carro2 = new Carro();

        carro2.setCor("\nRosa");
        carro2.setModelo("Ferrari");
        carro2.setCapacidade(110);
        carro2.setValorDaGasolina(6.45);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidade());


 }   
}
