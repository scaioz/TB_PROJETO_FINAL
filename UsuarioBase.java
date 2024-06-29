package bancoCaio;

public abstract class UsuarioBase implements UsuarioInterface {
    protected String nome;
    protected String cpf;
    protected String email;
    protected String endereco;
    protected double telefone;
    protected double rendasal;

    public UsuarioBase(String nome, String cpf, String email, String endereco, double telefone, double rendasal) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.rendasal = rendasal;
    }

    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public void set.Nome(String nome) {
        this.nome = nome;
    }
    @Override
    public String getCpf() {
        return cpf;
    }
    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    @Override
    public String getEmail() {
        return email;
    }
    @Override
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String getEndereco() {
        return endereco;
    }
    @Override
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    @Override
    public double getTelefone() {
        return telefone;
    }
    @Override
    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }
    @Override
    public double getRendaSal() {
        return rendasal;
    }
    @Override
    public void setRendaSal(double rendasal) {
        this.rendasal = rendasal;
    }
}