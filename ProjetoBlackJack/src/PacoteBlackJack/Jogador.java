package PacoteBlackJack;

public class Jogador extends Pessoa{
   private String email;

    public Jogador(String email, String cpf, String estadoCivil, String nascionalidade, String nome, String corOlhos, String nomePai, String nomeMae, String dataNascimento) {
        super(cpf, estadoCivil, nascionalidade, nome, corOlhos, nomePai, nomeMae, dataNascimento);
        this.email = email;
     }

    protected void imprimeDadosJogador(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Email: "+ this.email);
        System.out.println("CPF: "+ this.cpf);
        System.out.println("Data de nascimento: "+ this.dataNascimento);
        System.out.println("Estado Civil: "+ this.estadoCivil);
        System.out.println("Nascionalidade: "+ this.nascionalidade);
        System.out.println("Cor dos Olhos: " + this.corOlhos);
        System.out.println("Nome da Mãe: " + this.nomeMae);
        System.out.println("Nome do Pai: "+ this.nomePai);
        
   }
   
   public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
    
    
}
