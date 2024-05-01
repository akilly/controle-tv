

        /** <h1>SmartTV</h1>
         * Este bloco de código serve para processar ações escolhidas e realizadas pelo usuario atravez de um controle
         * @author joao
         * @version 1.0
         * @since 30/04/2024
         */

        public class smartTV {
            /**
             * Este código serve para processar ações escolhidas pelo usuario*/
            int volume = 25; // volume inicial da tv
            boolean ligada = false; // estado inicial da tv
            int canal = 1; // canal inicial da tv
           
                public void aumentarVolume () { // metodo para aumentar o volume em +1
                    volume++;
                    System.out.println("aumentando volume:" + volume); // escrever na tela do terminal em qual volume a tv se encontra apos a alteração
                }


                public void diminuirVolume () { // metodo de diminuir o volume em -1
                    volume--;
                    System.out.println("diminuindo volume:" + volume); // escrever no terminal em qual volume a tv se encontra apos a alteração
                }


                public void ligar () { // mudar o estado da tv para ligada
                    ligada = true;
                }

                public void desligar () { // mudar o estado da tv para desligada
                    ligada = false;
                }

                public void aumentarCanal () { //metodo para aumentar o canal em +1
                    canal++;
                    System.out.println("aumentando canal:" + canal); // escrever no terminal em qual canal se encontra apos a alteração
                }

                public void diminuirCanal () { // metodo para diminuir o canal em -1
                    canal--;
                    System.out.println("diminuindo canal:" + canal);  // escrever no terminal em qual canal se encontra apos a alteração
                }

                public void mudarCanal ( int novoCanal)
                { // metodo para mudar o canal para o canal selecionado, esse metodo espera o parametro novoCanal
                    canal = novoCanal;
                    System.out.println("vc está no canal :" + canal); // escrever no terminal em qual canal se encontra apos a alteração
                }
            }
            

        /*javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java
         */
