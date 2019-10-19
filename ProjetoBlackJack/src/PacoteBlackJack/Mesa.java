package PacoteBlackJack;

public class Mesa {
    private Jogador jogador1;
    private Jogador jogador2;

    Mesa(){
        this.jogador1 = new Jogador("mathias.morais7@gma.", "089611 ", "Solteiro", "Brasileiro", "mathias", "preto", "Marinaldo", "Maria", "20/11/2000");
        this.jogador2 = new Jogador("mathias.morais7@gma.", "089611 ", "Solteiro", "Brasileiro", "matheus", "preto", "Marinaldo", "Maria", "20/11/2000");
    }
    public void imprimirDadosJogador1(){
        jogador1.imprimeDadosJogador();
    }
     public void imprimirDadosJogador2(){
        jogador2.imprimeDadosJogador();
    }
    
    public String getNomeJogador1(){
        return this.jogador1.getNome();
    }
    
    public String getNomeJogador2(){
        return this.jogador2.getNome();
    }
    
}
