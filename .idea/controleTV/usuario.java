public class usuario {
        public static void main (String[] args){

            smartTV smartTv = new smartTV(); //armazena as informações contidas no arquivo smartTV.java em uma nova variavel para assim poder ser usada para processar os metodos
            System.out.println("seu canal é: "+smartTv.canal);
            System.out.println("seu volume é: "+smartTv.volume);
            System.out.println("sua tv está ligada: "+smartTv.ligada);
            smartTv.diminuirVolume();
            smartTv.aumentarVolume();
            smartTv.ligar();
            smartTv.mudarCanal(14);
        };
};
