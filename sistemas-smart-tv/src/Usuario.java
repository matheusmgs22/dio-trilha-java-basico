public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        
        smartTv.diminuirVolume(); //24
        smartTv.diminuirVolume(); //23
        smartTv.diminuirVolume();  //22
        smartTv.aumentarVolume();  //23

        System.out.println("Canal Atual? : " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual? : " + smartTv.canal);

        System.out.println("Volume Atual? : " + smartTv.volume);



        System.out.println("Tv Ligada? : " + smartTv.ligada);
        System.out.println("Canal Atual? : " + smartTv.canal);
        System.out.println("Volume Atual? : " + smartTv.volume);




        smartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada? : " + smartTv.ligada);


        smartTv.desligar();
        System.out.println("Novo Status -> Tv Ligada? : " + smartTv.ligada);

    }
}
