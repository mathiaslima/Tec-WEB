package PacoteBlackJack;

public class Humano {
    protected String nome;
    protected String corOlhos;
    protected String nomePai;
    protected String nomeMae;
    protected String dataNascimento;

    public Humano(String nome, String corOlhos, String nomePai, String nomeMae, String dataNascimento) {
        super();
        this.nome = nome;
        this.corOlhos = corOlhos;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorOlhos() {
        return corOlhos;
    }

    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    
    
}
