package bancoCaio;

public class CP extends UsuarioBase {
    
    public CP(String nome, String cpf, String email, String endereco, double telefone, double rendasal) {
        super (nome, cpf, email, endereco, telefone, rendasal);
    }

    public void criarCP() {
        System.out.println(x:"CP criada com sucesso!!");
    }

    public void lerCP() {
        System.out.println(x:"Nome " + nome + ", CPF: ", + cpf + ", Email: ", + email + ", Endereço: ", + endereco + ", Telefone: ", + telefone + ", Renda Salarial: R$" + rendasal);
    }

    public void atualizarDados(String email, String endereco, double telefone, double rendasal) {
        this.email = novoEmail;
        this.endereco = novoEndereco;
        this.telefone = novoTelefone;
        this.rendasal = novaRendaSal;
        System.out.println(x:"Dados de CP atualizados com sucesso!!");
    }

    public void removerCP() {
        System.out.println(x:"CP removida com sucesso!!");
    }
}