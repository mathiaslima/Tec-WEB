package PacoteBlackJack;

public class Pessoa extends Humano{
    protected String cpf;
    protected String estadoCivil;
    protected String nascionalidade;

    public Pessoa(String cpf, String estadoCivil, String nascionalidade, String nome, String corOlhos, String nomePai, String nomeMae, String dataNascimento) {
        super(nome, corOlhos, nomePai, nomeMae, dataNascimento);
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.nascionalidade = nascionalidade;
    }
    
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNascionalidade() {
        return nascionalidade;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }
    
}
