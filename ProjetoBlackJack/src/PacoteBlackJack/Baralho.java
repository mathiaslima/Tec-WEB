package PacoteBlackJack;

public class Baralho {
    private Carta cartas[];

    public Baralho() {
        this.cartas = new Carta[52];
        
        String numero = "0";
        String naipe = "fake";
        int valor = 0;
        int contador = 0;
        for (int num=1; num<14; num++){
            for (int naip=1; naip<5; naip++){
                Carta c = new Carta(); //cria carta
                //verifica numero
                switch (num) {
                    case 1:
                        numero="A";
                        valor=1;
                        break;
                    case 11:
                        numero="J";
                        valor=11;
                        break;
                    case 12:
                        numero="Q";
                        valor=12;
                        break;
                    case 13:
                        numero="K";
                        valor=13;
                        break;
                    default:
                        numero = String.valueOf(num);
                        valor = num;
                        break;
                }
                
                //verifica naipe
                switch (naip) {
                    case 1:  naipe = "Paus"; break;
                    case 2:  naipe = "Ouros"; break;
                    case 3:  naipe = "Copas";  break;
                    case 4:  naipe = "Espadas"; break;
                    default: naipe = "fake"; break;
                }
                //seta a carta
                c.setNumero(numero);
                c.setNaipe(naipe);
                c.setValor(valor);
               
                //Adiciona a carta no baralho
                this.cartas[contador] = c;
                contador++;
            }
        }
    }
    
    public void listarCartas(){
        for (int i=0; i<52; i++){
            System.out.println(cartas[i].getNumero() +" de "+cartas[i].getNaipe() +". Valor: "+ cartas[i].getValor());
        }
    }
    
}
