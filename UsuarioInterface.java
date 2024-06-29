package bancoCaio;

public interface Usuario {
    String getNome();
    void setNome(String nome);
    String getCpf();
    void setCpf(String cpf);
    String getEmail();
    void setEmail(String email);
    String getEndereco();
    void setEndereco(String endereco);
    double getRendaSal();
    void setRendaSal(double rendasal);
}